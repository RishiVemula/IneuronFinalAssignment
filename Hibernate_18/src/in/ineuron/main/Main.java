package in.ineuron.main;

import org.hibernate.Session;


import in.ineuron.HBUtil.HibernateUtil;
import in.ineuron.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		session.close();

	}

}
