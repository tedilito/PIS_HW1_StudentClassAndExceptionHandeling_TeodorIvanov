/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_ti;

import java.util.ArrayList;
/**
 *
 * @author tedil
 */
public class Homework_TI {

    public static void main(String[] args) 
    {
        
        ArrayList<String> disciplines = new ArrayList<>();
        disciplines.add("Programming");
        disciplines.add("Mathematics");

        Student st = new Student(
                "Teodor",
                "Atanasov",
                "Ivanov",
                2,
                "SKI",
                3,
                "A",
                "22572113",
                disciplines
        );

       
        st.PrintInfo();


       
      
        st.setFirstName("Tedi");
        st.setMidName("A");
        st.setLastName("Ivanov");
        st.setCourseYear(3);
        st.setSpecialty("Software Engineering");
        st.setGroup(5);
        st.setSubGroup("B");
        st.setFacultyNumber("12345678");

        st.PrintInfo();
        
        //set-ове с невалидни стойности
        try {
            st.setFirstName(""); 
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }

        try {
            st.setCourseYear(10);
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }

        try {
            st.setGroup(-5);
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }

        try {
            st.setFacultyNumber("");
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }

        try {
            st.AddDisciplines("");
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }

        try {
            st.RemoveDisciplines("NonExisting");
        } catch (IllegalArgumentException exc) {
            System.out.println("Caught exception: " + exc.getMessage());
        }   
        
    }
}
