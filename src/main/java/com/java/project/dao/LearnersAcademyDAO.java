package com.java.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.java.project.model.ClassName;
import com.java.project.model.Students;
import com.java.project.model.Subjects;
import com.java.project.model.Teachers;

public class LearnersAcademyDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		List<Students> studentList1 = new ArrayList();
		List<Students> studentList2 = new ArrayList();
		List<Students> studentList3 = new ArrayList();
		List<Students> studentList4 = new ArrayList();
		List<Students> studentList5 = new ArrayList();
		
		List<Teachers> teachersList1 = new ArrayList();
		List<Teachers> teachersList2 = new ArrayList();
		List<Teachers> teachersList3 = new ArrayList();
		
		List<Subjects> subjectList1 = new ArrayList();
		List<Subjects> subjectList2 = new ArrayList();
		List<Subjects> subjectList3 = new ArrayList();
		List<Subjects> subjectList4 = new ArrayList();
		List<Subjects> subjectList5 = new ArrayList();
		
		List<ClassName> classList1 = new ArrayList();
		List<ClassName> classList2 = new ArrayList();
		List<ClassName> classList3 = new ArrayList();
		
		Students student1 = new Students("Abhishek");
		Students student2 = new Students("Subhrajit");
		Students student3 = new Students("Suvam");
		Students student4 = new Students("Shubham");
		Students student5 = new Students("Himanshu");
		studentList1.add(student1);
		studentList1.add(student2);
		studentList1.add(student3);
		studentList1.add(student4);
		studentList1.add(student5);
		
		Students student6 = new Students("Gaurav");
		Students student7 = new Students("Manmeet");
		Students student8 = new Students("Kapil");
		Students student9 = new Students("Ashish");
		Students student10 = new Students("Avijit");
		Students student11 = new Students("Rajiv");
		studentList2.add(student6);
		studentList2.add(student7);
		studentList2.add(student8);
		studentList2.add(student9);
		studentList2.add(student10);
		studentList2.add(student11);
		
		Students student12 = new Students("Rahul");
		Students student13 = new Students("Abhinita");
		Students student14 = new Students("Neetu");
		Students student15 = new Students("Priya");
		studentList3.add(student12);
		studentList3.add(student13);
		studentList3.add(student14);
		studentList3.add(student15);
		
		Students student16 = new Students("Raju");
		Students student17 = new Students("Puja");
		Students student18 = new Students("Anshu");
		Students student19 = new Students("Satyam");
		Students student20 = new Students("Harsh");
		studentList4.add(student16);
		studentList4.add(student17);
		studentList4.add(student18);
		studentList4.add(student19);
		studentList4.add(student20);
		
		Students student21 = new Students("Amit");
		Students student22 = new Students("Sourav");
		Students student23 = new Students("Saurav");
		Students student24 = new Students("Sharat");
		Students student25 = new Students("Keshav");
		studentList5.add(student21);
		studentList5.add(student22);
		studentList5.add(student23);
		studentList5.add(student24);
		studentList5.add(student25);
		
		Teachers teacher1 = new Teachers("Manoj",classList1);
		Teachers teacher2 =new Teachers("Raman",classList2);
		Teachers teacher3 = new Teachers("Arnab",classList3);
		Teachers teacher4 =new Teachers("Shivam",classList1);
		
		teachersList1.add(teacher1);
		teachersList1.add(teacher4);
		teachersList2.add(teacher3);
		teachersList2.add(teacher1);
		teachersList3.add(teacher2);
		teachersList3.add(teacher4);
		
		Subjects subject1 = new Subjects("Physics",classList2);
		Subjects subject2 = new Subjects("Mathematics",classList1);
		Subjects subject3 = new Subjects("Chemistry",classList3);
		Subjects subject4 = new Subjects("English",classList2);
		Subjects subject5 = new Subjects("Computer",classList3);
		
		subjectList1.add(subject1);
		subjectList1.add(subject2);
		subjectList1.add(subject5);
		subjectList2.add(subject4);
		subjectList2.add(subject3);
		subjectList2.add(subject2);
		subjectList3.add(subject1);
		subjectList3.add(subject4);
		subjectList3.add(subject5);
		subjectList4.add(subject3);
		subjectList4.add(subject1);
		subjectList4.add(subject4);
		subjectList5.add(subject3);
		subjectList5.add(subject2);
		subjectList5.add(subject5);
		
		ClassName class1 = new ClassName("A1",subjectList1,teachersList1,studentList1);
		ClassName class2 = new ClassName("A2",subjectList2,teachersList2,studentList2);
		ClassName class3 = new ClassName("A3",subjectList3,teachersList3,studentList3);
		ClassName class4 = new ClassName("A4",subjectList4,teachersList2,studentList4);
		ClassName class5 = new ClassName("A5",subjectList5,teachersList1,studentList5);
		classList1.add(class1);
		classList1.add(class3);
		classList2.add(class2);
		classList2.add(class5);
		classList3.add(class3);
		classList3.add(class4);
		
		session.save(class1);
		session.save(class2);
		session.save(class3);
		session.save(class4);
		session.save(class5);
		t.commit();
		System.out.print("Successfully inserted values");
		factory.close();
		session.close();
		

	}

}
