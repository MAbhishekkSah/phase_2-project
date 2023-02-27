package com.java.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subjects_Table")
public class Subjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectCode;
	private String subName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="sub_class_id")
	private List<ClassName> classList;

	public int getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public List<ClassName> getClassList() {
		return classList;
	}

	public void setClassList(List<ClassName> classList) {
		this.classList = classList;
	}

	public Subjects(String subName, List<ClassName> classList) {
		super();
		this.subName = subName;
		this.classList = classList;
	}
	
	

	public Subjects(int subjectCode, String subName) {
		super();
		this.subjectCode = subjectCode;
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subjects [subjectCode=" + subjectCode + ", subName=" + subName + ", classList=" + classList + "]";
	}

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
/*	@ManyToMany(cascade = CascadeType.ALL)
	private List<Students> studentList;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="sub_teacher_id")
	private List<Teachers> teacher;   */
	
	
	
}
