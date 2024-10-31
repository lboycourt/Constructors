/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseassignment;
import java.util.*;
import java.text.*;
/**
 *
 * @author lboycourt2025
 */

class Course{
    private int points;
    private String code;
    private String title;
    private String instructor;
    
    public Course(Integer pt, String ti, String cd, String ir){
        this.points = pt;
        this.code = cd;
        this.title = ti;
        this.instructor = ir;
    }
    
    public Course(String nm){
        points = 0;
        code = null;
        title = nm;
        instructor = null;   
    }
    //getters
    public String getTitle(){
        return title;
    }
     public Integer getPoints(){
        return points;
     }
     public String getCode(){
        return code;
    } 
     public String getInstructor(){
        return instructor;
    } 
     //setters
     public void setTitle(String ti){
       this.title = ti;
    } 
     public void setPoints(int pt){
         this.points = pt;
     }
     public void setCode(String cd){
       this.code = cd;
     }  
      public void setInstructor(String ir){
       this.instructor = ir;
     }  
      
    public String courseDescription(){
        String name = title;
        String level = code;
        int score = points;
        String teacher = instructor;
        
        StringBuilder coursePhrase = new StringBuilder();
        
        coursePhrase.append("Course Description:\n");
        
        coursePhrase.append(String.format("The course %s ", name));
        coursePhrase.append(String.format("awards %d points and is considered an %s course", score, level));
        coursePhrase.append(String.format(", taught by %s ", teacher));
        
        return coursePhrase.toString();
    }  
}
    public class CourseAssignment {

    public static void main(String[] args) {
        
        Course assign = new Course(5, "Computer Science A", "AP", "Mr. Nelson.");
        
        Course assign2 = new Course("AP Gov");
       
        assign2.setPoints(5);
        assign2.setCode("AP");
        assign2.setInstructor("Mr. B.");
        
        Course assign3 = new Course(5, "Physics 1", "AP", "Mrs. Rafie.");
        
        String result = assign.courseDescription();
        System.out.println(result);
        result = assign2.courseDescription();
        System.out.println(result);
        result = assign3.courseDescription();
        System.out.println(result);
    }
}
