package in.ineuron.main;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.HBUtil.HibernateUtil;
import in.ineuron.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Chose the options");
		System.out.println("1-save student.");
		int op = sc.nextInt();
		
		
		
		
		if(op==1) {
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the address");
			String address = sc.next();
			System.out.println("Enter the age");
			Integer age = sc.nextInt();
			Student st=new Student();
			st.setSaddress(address);
			st.setSage(age);
			st.setSname(name);
			
		Session session = HibernateUtil.getSession();
         
		Transaction transaction = session.beginTransaction();
		
		Serializable result = session.save(st);
		
		Student str = session.get(Student.class, result);
		System.out.println("Student saved with the details->"+str);
		
			
			
			
		
		
		
		}
		

	}

}
