package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class EmployeeRecord {
    public static void main(String[] args) {

        //creating HR office Object
        Service hr = new Service();

        Record record = new Record();

        record.setEmployeeId(123);
        record.setFirstName("Nitu");
        record.setLastName("Karki");
        record.setDateOfEmployment(10/29);
        record.setSalary(2000);
        record.setDepartment("IT");

        //calling add method
        hr.add(record);

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //creating option integer variable
        int option =0;

        do{
            menu();
            option = input.nextInt();

            switch (option){
                case 1:

                    //displaying message
                    System.out.println("What is the employee id Number?");

                    int employeeId = input.nextInt();

                    System.out.println("What is the first name of the employee?");
                    String FirstName = String.valueOf(input.nextInt());

                    System.out.println("What is the last name of the employee?");
                    String LastName = String.valueOf(input.nextInt());

                    System.out.println("What is the date of employment?");
                    int dateOfEmployment = input.nextInt();

                    System.out.println("What is the salary of the employee?");
                    int salary = input.nextInt();

                    System.out.println("What is the department of the employee?");
                    String department = String.valueOf(input.nextInt());

                    //create record object and pass constructor and parameters
                    record = new Record( FirstName, LastName, employeeId, dateOfEmployment, salary, department );

                    //add record

                    hr.add(record);
                    System.out.println(record.toString());

                    break;

                case 2:
                    System.out.println("What is the employee id number?");
                    int eId = input.nextInt();

                    //delete record
                    hr.delete(eId);

                    break;

                case 3:
                    System.out.println("What is the employee id number?");

                    //update record
                    int eIdno = input.nextInt();
                    hr.update(eIdno, input);

                    break;

                case 4:
                    System.out.println("What is the employee id number?");
                    int empId = input.nextInt();

                    if(!hr.find(empId)){
                        System.out.println("Student id does not exist.");
                    }
                    break;

                case 5:
                    //list of employee

                    hr.display();
                    break;

                case 6:
                    System.out.println("\n Thank you for using the program.");
                    System.exit(0);

                    break;

                default:
                    System.out.println("\nInvalid input");
                    break;
            }
        }
        while(option != 6);


    }
    public static void menu(){
        System.out.println("Options");
        System.out.println("1: Add Employee");
        System.out.println("2: Delete Employee");
        System.out.println("3: Update Employee");
        System.out.println("4: Search Employee");
        System.out.println("5: Display Employee");
        System.out.println("6: Exit program");
        System.out.print("Enter your option: ");
    }
}