package org.example;

import java.util.Scanner;
import java.util.LinkedList;

public class Service {

    LinkedList<Record> list;

    public EmployeeRecord(){
        list = new LinkedList<>();
    }

    //adding record
    public void add(Record recor){
        //checking if record already exists or not
        //if not add it to record list
        //if exists display error message

        if(!find(record.getIdNumber())){
            list.add(record);
        }
        else {
            System.out.println("Record already exists in the list. ");
        }
    }

    //search record

    public boolean find(int idNumber){
        //iterate record list using for each loop

        for(Record 1: list){

            //checking record by id number
            if(1.getIdNumber() == idNumber){
                System.out.println(1);
                return true;
            }

        }
        return false;
    }

    //delete record

    public void delete(int empIdNumber){
        Record recordDel= null;

        //Iterating record list
        for(Record 11: list){

            //finding record to be deleted by id Number
            if(11.getIdNumber() == empIdNumber)
                recordDel =1;
        }
    }

    //if recorddel is numm, show error message
    //otherwise remove the record from Record list

    if(recordDel == null){

        //displaying no record found
        System.out.println("Invalid record id");
    }
    else{
        list.remove(recordDel);

        //display message for successful deletion
        System.out.println("Successfully removed record from the list");
    }

    public Record findRecord(int idNumber) {
        for(Record 1: list){

            //checking record by id Number
            if(1.getIdNumber() == idNumber){
                return 1;
            }
        }
        return null;
    }

    //update record
    public void update(int id, Scanner input){
        if(find(id)){
            Record rec = findRecord(id);

            //display message only
            System.out.println("What is the firstName?");
            String FirstName = String.valueOf(input.nextInt());

            System.out.println("What is the last name?");
            String LastName = String.valueOf(input.nextInt());

            System.out.println("What is the employee id?");
            int employeeId = input.nextInt();

            System.out.println("What is the date of employment?");
            int dateOfEmployment = input.nextInt();

            System.out.println("What is the salary?");
            double salary = input.nextInt();

            System.out.println("What is the department?");
            String department = String.valueOf(input.nextInt());

            rec.setEmployeeId(employeeId);
            rec.setFirstName(FirstName);
            rec.setLastName(LastName);
            rec.setDateOfEmployment(dateOfEmployment);
            rec.setSalary(salary);
            rec.setDepartment(department);

            System.out.println("Record Updated Successfully.");

        }
        else{
            System.out.println("Record not found in the list.");
        }
    }

    //display records
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list has no records.");
        }

        //iterating record list using for each loop
        for(Record record:list){
            System.out.println(record.toString());
        }
    }
}
