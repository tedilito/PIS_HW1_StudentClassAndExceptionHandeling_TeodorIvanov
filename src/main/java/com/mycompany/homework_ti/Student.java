/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_ti;

import java.util.ArrayList;
/**
 *
 * @author tedil
 */
public class Student {
    private String firstName;
    private String midName;
    private String lastName;
    private int courseYear;
    private String specialty;
    private int group;
    private String subGroup;
    private String facultyNum;
    
    private ArrayList<String> disciplines;
    
    public Student(String firstName, String midName, String lastName, int courseYear,
            String specialty, int group, String subGroup, String facultyNum, ArrayList<String> disciplines)
    {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.courseYear = courseYear;
        this.specialty = specialty;
        this.group = group;
        this.subGroup = subGroup;
        this.facultyNum = facultyNum;
        this.disciplines = disciplines;
    }
    
    
    public void setFirstName(String firstName)
    {
        if (!firstName.isBlank()) {
            this.firstName = firstName;
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for firstName");
            
        }    
    }
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setMidName(String midName)
    {
         if (!midName.isBlank()) {
            this.midName = midName;
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for midName");
            
        }
         
    }
    public String getMidName()
    {
        return midName;
    }
    
    public void setLastName(String lastName)
    {
         if (!lastName.isBlank()) {
            this.lastName = lastName;
        }
         else {
            throw new IllegalArgumentException("Enter a valid value for lastName");
            
        }  
    }
    public String getLastName()
    {
        return lastName;
    }
    
    public void setCourseYear(int courseYear)
    {
        if (courseYear < 1 || courseYear > 4) {
            throw new IllegalArgumentException("Course year must be between 1 and 4");
        }
        else {
            
             this.courseYear = courseYear;
        }
   
    }
    public int getCourseYear()
    {
        return courseYear;
    }
    
    
    public void setSpecialty(String specialty)
    {
        if (!specialty.isBlank()) {
            this.specialty = specialty;
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for specialty");
        }
    }
    public String getSpecialty()
    {
        return specialty;
    }
    
    public void setGroup(int group)
    {
        if (group > 0) {
              this.group = group;
        }
        else {
            throw new IllegalArgumentException("Group must be positive number");
        }
    }
    public int getGroup()
    {
        return group;
    }
    
    public void setSubGroup(String subGroup)
    {
        if (!subGroup.isBlank()) {
             this.subGroup = subGroup;
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for subGroup");
        }
        
       
    }
    public String getSubGroup()
    {
        return subGroup;
    }
    
    public void setFacultyNumber(String facultyNum)
    {
        if (!facultyNum.isEmpty()) {
            this.facultyNum = facultyNum;
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for facultyNum");
        }
        
        
        
    }
    public String getfacultyNum()
    {
        return facultyNum;
    }
  
    public void SetDisciplines(ArrayList<String> disciplines)
    {
        if (disciplines != null) {
         this.disciplines = disciplines;
        }
        else {
             throw new IllegalArgumentException("Disciplines list cannot be null.");
        }
        

    }
    public ArrayList<String> GetDisciplines()
    {
        return disciplines;
    }
    
    public void AddDisciplines(String disciplineToAdd)
    {
        if (!disciplineToAdd.isEmpty()) {
            this.disciplines.add(disciplineToAdd);
         System.out.println("The discipline is added");
        }
        else {
            throw new IllegalArgumentException("Enter a valid value for discipline");
        }  
    }
    
    public void RemoveDisciplines(String disciplineToRemove)
    {
        if (this.disciplines.contains(disciplineToRemove)) {
            this.disciplines.remove(disciplineToRemove);
            System.out.println("The discipline is removed");
        }
        else {
            throw new IllegalArgumentException("Entered discipline to remove is not found");
        }
        }
    
      public void PrintInfo()
    {
        System.out.println("Student: " + this.firstName + " " + this.midName + " " + this.lastName); 
        System.out.println("Course: " + this.courseYear);
        System.out.println("specialty: " + this.specialty);
        System.out.println("Group: " + this.group + " SubGroup: " + this.subGroup);
        System.out.println("Faculty number: " + this.facultyNum);
        System.out.print("Disciplines that are being studied");
        System.out.println(" ");
        int countDisciplines = this.disciplines.size() - 1;
        
        for (int i = 0; i <= countDisciplines; i++) {
            System.out.println("-" + disciplines.get(i));
            
        }
      
        
    }
    
}
