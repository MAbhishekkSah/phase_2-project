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
@Table(name="teachers_table")
public class Teachers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String teachersName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_class_id")
	private List<ClassName> classList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeachersName() {
		return teachersName;
	}

	public void setTeachersName(String teachersName) {
		this.teachersName = teachersName;
	}

	public List<ClassName> getClassList() {
		return classList;
	}

	public void setClassList(List<ClassName> classList) {
		this.classList = classList;
	}

	public Teachers(String teachersName, List<ClassName> classList) {
		super();
		this.teachersName = teachersName;
		this.classList = classList;
	}
	

	public Teachers(int id, String teachersName) {
		super();
		this.id = id;
		this.teachersName = teachersName;
	}

	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", teachersName=" + teachersName + ", classList=" + classList + "]";
	}
	
	
	
/*	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_student_id")
	private List<Students> studentsList;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_sub_id")
	private List<Subjects> subjectList;  */
	
	
	
}
