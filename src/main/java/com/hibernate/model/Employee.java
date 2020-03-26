package com.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name="employeeTable")
public class Employee {
    @Id
    @Column(name = "empId")
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int empId;
    @Column(name = "empName")
    private String empName;
    @Column(name = "empCity")
    private String empCity;
    @Column(name = "empAge")
    private int empAge;
    @Column(name = "empDept")
    private String empDept;

    public Employee()
    {

    }

    public Employee(String empName, String empCity, int empAge, String empDept)
    {
        this.empName=empName;
        this.empCity=empCity;
        this.empAge=empAge;
        this.empDept=empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empAge=" + empAge +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
