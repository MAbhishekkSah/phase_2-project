package com.java.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Classes_Names")
public class ClassName {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classCode;
	
	private String class_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="class_sub_id")
	private List<Subjects>  subList;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="class_teacher_id")
	private List<Teachers> teachersList;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="class_student_id")
	private List<Students> studentList;
	
	
	public ClassName(String class_name, List<Subjects> subList, List<Teachers> teachersList,
			List<Students> studentList) {
		super();
		this.class_name = class_name;
		this.subList = subList;
		this.teachersList = teachersList;
		this.studentList = studentList;
	}
	
	
	public ClassName(int classCode, String class_name) {
		super();
		this.classCode = classCode;
		this.class_name = class_name;
	}


	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public List<Students> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Students> studentList) {
		this.studentList = studentList;
	}
	public int getClassCode() {
		return classCode;
	}
	public void setClassCode(int classCode) {
		this.classCode = classCode;
	}
	public List<Subjects> getSubList() {
		return subList;
	}
	public void setSubList(List<Subjects> subList) {
		this.subList = subList;
	}
	public List<Teachers> getTeachersList() {
		return teachersList;
	}
	public void setTeachersList(List<Teachers> teachersList) {
		this.teachersList = teachersList;
	}
	
	
	public ClassName() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassName [classCode=" + classCode + ", class_name=" + class_name + ", subList=" + subList
				+ ", teachersList=" + teachersList + ", studentList=" + studentList + "]";
	}
	
	
	
	
}
