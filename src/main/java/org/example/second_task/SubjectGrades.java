package org.example.second_task;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.round;

public class SubjectGrades {
    String subject;
    public Map<String, Integer> grades = new HashMap<>();

   public void addGrade(String studentName, Integer grade){
        grades.put(studentName,grade);
    }
    public double calculateAverage(){
       int grade = 0;
        for(var entry : grades.entrySet()){
            grade += entry.getValue();
        }
        return (double) (grade/grades.size())%10;
    }
}
