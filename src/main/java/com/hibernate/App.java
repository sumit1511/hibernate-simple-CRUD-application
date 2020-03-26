package com.hibernate;

import com.hibernate.model.Employee;
import com.hibernate.operation.CrudOperation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        SessionFactory sessionFactory = null;
        try{

            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
            Session session=sessionFactory.getCurrentSession();

             CrudOperation.deleteEmployee(session);

           // System.out.println( CrudOperation.showAllEmployee(session));
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
        finally {
            sessionFactory.close();
        }

    }
}
