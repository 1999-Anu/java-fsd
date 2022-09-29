package services;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import beans.Address;
import beans.EmployeeDetails;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	int register(EmployeeDetails user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 int i=(Integer)session.save(user);
		session.getTransaction().commit();

		session.close();
		return i;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDetails e1=new EmployeeDetails();    
		String name= request.getParameter("name");
		String Email= request.getParameter("email");
		String AdressLine1= request.getParameter("AL1");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String country= request.getParameter("country");
		int pincode= Integer.parseInt(request.getParameter("code"));
		PrintWriter out= response.getWriter();
		EmployeeDetails e11=new EmployeeDetails();    
	    e11.setName(name);    
	    e11.setEmail(Email);    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1(AdressLine1);    
	    address1.setCity(city);    
	    address1.setState(state);    
	    address1.setCountry(country); 
	    address1.setPincode(pincode);
	    //address1.setPincode(201301);    
	    //to set relationship pass address object to employee and employee object to address    
	    e11.setAddress(address1);    
	    address1.setEmployee(e11);   
	    
		int i=register(e11);
		PrintWriter out1=response.getWriter();
				if(i>0)
					out1.println("Record Inserted");
				else
					out1.println("Record not Inserted");
	}

}