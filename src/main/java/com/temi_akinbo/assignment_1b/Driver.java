/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temi_akinbo.assignment_1b;

import com.temi_akinbo.assignment_1.CourseProgram;
import com.temi_akinbo.assignment_1.Modules;
import com.temi_akinbo.assignment_1.Student;
import java.util.ArrayList;

/**
 *
 * @author Temi
 */
public class Driver {
    
    public static void main(String [] args){
        Student temiAkinbo = new Student("Temi Akinbo", 20);
        Student tomDunne = new Student("Tom Dunne", 21);
        Student martaRashford = new Student("Marta Rashford", 21);
        
        Modules CT417 = new Modules("Software Engineering III", "CT417");
        Modules EE445 = new Modules("Digital Signal Processing", "EE445");
        
        CourseProgram ECE = new CourseProgram("Electronic and Computer Engineering");
        CourseProgram CSIT = new CourseProgram("CS&IT");
        
        
        
        temiAkinbo.setRegModules(new ArrayList());
        temiAkinbo.setCourses(new ArrayList());
        temiAkinbo.getRegModules().add(EE445);
        temiAkinbo.getRegModules().add(CT417);
        temiAkinbo.getCourses().add(ECE);
        
        tomDunne.setRegModules(new ArrayList());
        tomDunne.setCourses(new ArrayList());
        tomDunne.getRegModules().add(EE445);
        tomDunne.getRegModules().add(CT417);
        tomDunne.getCourses().add(ECE);
        
        martaRashford.setRegModules(new ArrayList());
        martaRashford.setCourses(new ArrayList());
        martaRashford.getRegModules().add(CT417);
        martaRashford.getCourses().add(CSIT);
        
        CT417.getStudents().add(temiAkinbo);
        CT417.getStudents().add(tomDunne);
        CT417.getStudents().add(martaRashford);
        
        CT417.getAssignesCourses().add(ECE);
        CT417.getAssignesCourses().add(CSIT);
        
        EE445.getStudents().add(temiAkinbo);
        EE445.getStudents().add(tomDunne);
        
        EE445.getAssignesCourses().add(ECE);
        
        ECE.getModules().add(EE445);
        ECE.getModules().add(CT417);
        
        CSIT.getModules().add(CT417);
        
        
        
        
        System.out.println("Courses : " + ECE.getCourseName() + "\n " + CSIT.getCourseName()+ "\n ");
        
        System.out.println("ECE modules: ");
        
        for(Modules mod : ECE.getModules()){
            System.out.println(mod.getModuleName());
            System.out.println("Registered students: ");
            
            for(Student stud : mod.getStudents()){
                System.out.println(stud.getName() + ", Username: " + stud.getUsername());
                System.out.println("Registered Modules: ");
                for(Modules modules : stud.getRegModules()){
                    System.out.println(modules.getModuleName());
                }
                System.out.println();
            }
        }
        
         System.out.println("CSIT modules: ");
        
        for(Modules mod : CSIT.getModules()){
            System.out.println(mod.getModuleName());
            System.out.println("Registered students: ");
            
            for(Student stud : mod.getStudents()){
                System.out.println(stud.getName() + ", Username: " + stud.getUsername());
                System.out.println("Registered Modules: ");
                for(Modules modules : stud.getRegModules()){
                    System.out.println(modules.getModuleName());
                }
                System.out.println();
            }
        }
                
//        int count = 0;
//        
//        for(Modules mod: temiAkinbo.getRegModules()){
//            
//            System.out.println("Student: " + temiAkinbo.getUsername() + " is taking: " + mod.getModuleName());
//        }
        
        
        
        //
    }
    
}
