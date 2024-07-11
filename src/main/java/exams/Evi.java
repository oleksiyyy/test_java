package exams;

import objects.Student;

import java.util.*;

public class Evi {

    private Map<Student, String> participants = new HashMap<>();

    public void registerStudent(Student student){
        participants.put(student, "0");
    }

    public void prinAllparticipants(){

        for(Map.Entry<Student, String> keyValue : participants.entrySet()) {

            System.out.println(keyValue.getKey() + " | Score " + keyValue.getValue());
        }
    }
}