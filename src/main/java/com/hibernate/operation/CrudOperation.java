package com.hibernate.operation;

import com.hibernate.model.Employee;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CrudOperation {

    public static void createEmployee(Session session)
    {
        Employee employee = new Employee("Dabid","kks",44,"DMP");
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        System.out.println("successfully inserted ");
    }
    public static void deleteEmployee(Session session) {
        session.beginTransaction();
        Employee employee = session.get(Employee.class,7);
        session.delete(employee);
        session.getTransaction().commit();
        System.out.println("execute successfully");
    }
    public static void updateEmployee(Session session,int empId) {
        session.beginTransaction();
        Employee employee = session.get(Employee.class,empId);
        employee.setEmpName("prakash");
        session.getTransaction().commit();
    }
    public static List<Employee> showAllEmployee(Session session) {
        session.beginTransaction();
        List employeeList = new ArrayList<Employee>();
        employeeList=session.createQuery("from Employee").list();
        session.getTransaction().commit();
        return employeeList;
    }
    public static void getEmployee(Session session ,int empId) {
          session.beginTransaction();
          Employee employee = session.get(Employee.class,empId);
          System.out.println(employee);
          session.getTransaction().commit();
    }
}
