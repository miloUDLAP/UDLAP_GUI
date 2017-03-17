package mx.udlap.gui;



import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import mx.udlap.model.Course;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

/**
 * @author buns
 *
 */
public class UDLAPGui {

	private JFrame frmUdlapGui;
	private JTextField txtStudent;
	private JList<Course> lstCourses;
	
	private DefaultListModel<Course> mdlCourses;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UDLAPGui window = new UDLAPGui();
					window.frmUdlapGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UDLAPGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUdlapGui = new JFrame();
		frmUdlapGui.setTitle("UDLAP GUI");
		frmUdlapGui.setBounds(100, 100, 549, 347);
		frmUdlapGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUdlapGui.getContentPane().setLayout(null);
		
		lstCourses = new JList<Course>();
		
		lstCourses.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent key) {
				System.out.println(key);
				if (key.getKeyCode() == KeyEvent.VK_DELETE)
					mdlCourses.remove(lstCourses.getSelectedIndex());
			}
		});
		
		mdlCourses = new DefaultListModel<Course>();
		
		lstCourses.setModel(mdlCourses);
		
		lstCourses.setCellRenderer(new CourseRenderer());
		
		JLabel lblStatus = new JLabel("Application started");
		lblStatus.setBounds(0, 294, 533, 14);
		frmUdlapGui.getContentPane().add(lblStatus);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 513, 274);
		frmUdlapGui.getContentPane().add(tabbedPane);
		
		JPanel plCourses = new JPanel();
		tabbedPane.addTab("Courses", new ImageIcon(UDLAPGui.class.getResource("/mx/udlap/resources/aztecas.jpg")), plCourses, "These are the courses");
		plCourses.setLayout(null);
		
		JButton btnAddCourse = new JButton("Add");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String courseName = txtStudent.getText();
				Course c = new Course(courseName, "some key", "some desc");
				
				mdlCourses.addElement(c);				
				
				lblStatus.setText("Added course '" + c.getName() + "'");
			}
		});
		btnAddCourse.setBounds(10, 11, 89, 23);
		plCourses.add(btnAddCourse);
		
		
		txtStudent = new JTextField();
		txtStudent.setBounds(109, 12, 232, 20);
		plCourses.add(txtStudent);
		txtStudent.setColumns(10);
		
		lstCourses.setBounds(20, 45, 478, 156);
		plCourses.add(lstCourses);
		
		JPanel plStudent = new JPanel();
		tabbedPane.addTab("Student", null, plStudent, null);
		
		JPanel plProfe = new JPanel();
		tabbedPane.addTab("Professor", null, plProfe, null);
	}
	
	private class CourseRenderer extends DefaultListCellRenderer {

		public Component getListCellRendererComponent(JList<?> list, 
				Object value, int index, boolean isSelected,
				boolean cellHasFocus) {

		     if (value != null) {
		        Course c = (Course) value;
		        String displayString = c.getName() + " " + c.getKey();
		        value = displayString;  
		     }
		     return super.getListCellRendererComponent(list, value, index,
		           isSelected, cellHasFocus);
		  }      
		}
	}
