package com.xiaochen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.xiaochen.view.AddTeacher;

import com.xiaochen.model.Admin;
import com.xiaochen.model.UserType;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	public static UserType userType;
	public static Object userObject;
	private JMenuItem addStudentMenuItem ;
	private JMenu manageClassMenu ;
	private JMenu manageTeacherMenu;
	private JMenuItem addTeacherMenuItem;

	public Main(UserType userType,Object userObject) {
		this.userType=userType;
		this.userObject=userObject;
		setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 647);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		menu.setIcon(new ImageIcon(Main.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				editPassword(ae);
			}
		});
		menuItem.setIcon(new ImageIcon(Main.class.getResource("/images/\u4FEE\u6539\u5BC6\u7801.png")));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(Main.this, "确定退出么？")==JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		menuItem_1.setIcon(new ImageIcon(Main.class.getResource("/images/\u9000\u51FA.png")));
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("\u5B66\u751F\u7BA1\u7406");
		menu_1.setIcon(new ImageIcon(Main.class.getResource("/images/\u5B66\u751F\u7BA1\u7406.png")));
		menuBar.add(menu_1);
		
		addStudentMenuItem = new JMenuItem("\u5B66\u751F\u6DFB\u52A0");
		addStudentMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent addStudent = new AddStudent();
				addStudent.setVisible(true);
				desktopPane.add(addStudent);
			}
		});
		addStudentMenuItem.setIcon(new ImageIcon(Main.class.getResource("/images/\u6DFB\u52A0.png")));
		menu_1.add(addStudentMenuItem);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5B66\u751F\u5217\u8868");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentManage studentMange = new StudentManage();
				studentMange.setVisible(true);
				desktopPane.add(studentMange);
			}
		});
		menuItem_2.setIcon(new ImageIcon(Main.class.getResource("/images/\u7528\u6237\u5217\u8868.png")));
		menu_1.add(menuItem_2);
		
		manageClassMenu = new JMenu("\u73ED\u7EA7\u7BA1\u7406");
		manageClassMenu.setIcon(new ImageIcon(Main.class.getResource("/images/\u73ED\u7EA7\u7BA1\u7406.png")));
		menuBar.add(manageClassMenu);
		
		JMenuItem menuItem_3 = new JMenuItem("\u73ED\u7EA7\u6DFB\u52A0");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudentClass(e);
			}
		});
		menuItem_3.setIcon(new ImageIcon(Main.class.getResource("/images/\u6DFB\u52A0.png")));
		manageClassMenu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u73ED\u7EA7\u7BA1\u7406");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				classManage classManger= new classManage();
				classManger.setVisible(true);
				desktopPane.add(classManger);
			}
		});
		menuItem_4.setIcon(new ImageIcon(Main.class.getResource("/images/\u73ED\u7EA7\u5217\u8868.png")));
		manageClassMenu.add(menuItem_4);
		
		manageTeacherMenu = new JMenu("\u6559\u5E08\u7BA1\u7406");
		manageTeacherMenu.setIcon(new ImageIcon(Main.class.getResource("/images/\u8001\u5E08.png")));
		menuBar.add(manageTeacherMenu);
		
		addTeacherMenuItem = new JMenuItem("\u6DFB\u52A0\u6559\u5E08");
		addTeacherMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeacher addTeacher = new AddTeacher();
				addTeacher.setVisible(true);
				desktopPane.add(addTeacher);
			}
		});
		addTeacherMenuItem.setIcon(new ImageIcon(Main.class.getResource("/images/\u6DFB\u52A0.png")));
		manageTeacherMenu.add(addTeacherMenuItem);
		
		JMenuItem menuItem_7 = new JMenuItem("\u6559\u5E08\u5217\u8868");
		menuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherManage teacherMange = new TeacherManage();
				teacherMange.setVisible(true);
				desktopPane.add(teacherMange);
			}
		});
		menuItem_7.setIcon(new ImageIcon(Main.class.getResource("/images/\u7528\u6237\u5217\u8868.png")));
		manageTeacherMenu.add(menuItem_7);
		
		JMenu menu_3 = new JMenu("\u5E2E\u52A9");
		menu_3.setIcon(new ImageIcon(Main.class.getResource("/images/\u5E2E\u52A9.png")));
		menuBar.add(menu_3);
		
		JMenuItem menuItem_5 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutUs(ae);
			}
		});
		menuItem_5.setIcon(new ImageIcon(Main.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		menu_3.add(menuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(51, 153, 204));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setAuthority();
	}



	protected void addStudentClass(ActionEvent e) {
		// TODO Auto-generated method stub
		StudentClassAdd stuAdd = new StudentClassAdd();
		stuAdd.setVisible(true);
		desktopPane.add(stuAdd);
		
	}

	protected void editPassword(ActionEvent ae) {
		// TODO Auto-generated method stub
		EditPassword editPassword = new EditPassword();
		editPassword.setVisible(true);
		desktopPane.add(editPassword);
	}

	protected void aboutUs(ActionEvent ae) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "本次java课程设计由广西科技大学经济与管理学院 信管171 班 陈欣 全程制作！ ");
	}
	private void setAuthority(){
		if("学生".equals(userType.getName())){
			addStudentMenuItem.setEnabled(false);
			manageClassMenu.setEnabled(false);
			manageTeacherMenu.setEnabled(false);
		}
		if("教师".equals(userType.getName())){
			addTeacherMenuItem.setEnabled(false);
		}
	}
}
