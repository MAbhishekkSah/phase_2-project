package com.java.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students_Table")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	private String name;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name) {
		super();
		this.name = name;
	}
	
	public Students(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
/*	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_class_id")
	private ClassName className;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="student_teacher_id")
	private List<Teachers> teachersList;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="student_sub_id")
	private List<Subjects> subjectsList; */
	
	
	
	

}
