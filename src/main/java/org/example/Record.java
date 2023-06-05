package org.example;

public class Record {
    private String FirstName;
    private String LastName;
    private int employeeId;
    private int dateOfEmployment;
    private double salary;
    private String department;

    public Record(String FirstName, String LastName, int employeeId,
                  int dateOfEmployment, double salary, String department){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.employeeId = employeeId;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(int dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void EmployeeDetails(){
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Date of Employment: " + dateOfEmployment);
        System.out.println("Salary: " + salary);
        System.out.println("Department: "+ department);
    }



}
