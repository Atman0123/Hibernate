package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Student;

public class StudentDAO {

	public static Session getSeesion() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}

	// insertion code
	public static void insert(Student s) {
		Session session = StudentDAO.getSeesion();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
	}

	// fetch All
	public static List<Student> getAllStudents() {
		Session session = StudentDAO.getSeesion();
		List<Student> list = session.createQuery("from Student").list();
		return list;
	}

	// delete Record
	public static void deleteStudent(int id) {
		Session session = StudentDAO.getSeesion();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, id);
		session.delete(s);
		session.getTransaction().commit();
		session.close();

	}

	// fetch single record based on id
	public static Student getSinglRecord(int id)
	{
		Session session=StudentDAO.getSeesion();
		Student s=(Student) session.get(Student.class, id);
		return s;
	}
	
	//Update record 
	public static void update(Student s)
	{
		Session session=StudentDAO.getSeesion();
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();
		session.close();
	}

}
