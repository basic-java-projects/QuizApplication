package com.twg.spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springhibernate.business.EmployeeBusiness;
import com.twg.spring.springhibernate.business.EmployeeBusinessImpl;
import com.twg.spring.springhibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl)context.getBean("employeeBusinessImpl");
        
    	Employee employee=new Employee();
    	employee.setAddress("Ongole");
    	employee.setContact("9000855791");
    	employee.setExp(3);
    	employee.setId(7);
    	employee.setName("Siva teja");
    	System.out.println( "Hello World!" );
    }
}
