package org.example;

import exams.Evi;
import objects.Admin;
import objects.Student;
import objects.User;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Admin admin = new Admin();

        admin.setName("Oleksiy");
        admin.setLastname("Gruzevuch");
        admin.setAge(18);

        Student student = new Student();

        student.setName("Oleksiy");
        student.setLastname("Gruzevuch");
        student.setAge(20);

        Student student2 = new Student();

        student2.setName("Ilon");
        student2.setLastname("Mask");

        System.out.println(admin.equals(student));
        System.out.println(admin.equals(student2));

        printUser(student);
        printUser(student2);

        System.out.println(admin.hashCode());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println("___________________________________________________________________");

        printUser(admin);

        happyBirthday(admin);

        printUser(admin);

        System.out.println("___________________________________________________________________");

        Evi eviExamp = new Evi();

        eviExamp.registerStudent(student);
        eviExamp.registerStudent(student2);

        eviExamp.prinAllparticipants();
    }

    private static Student getStudent(Student student) {
        return student;
    }

    private static void printUser(User user){
        System.out.println(user);
    }

    private static void happyBirthday(User user){
        user.setAge(user.getAge() + 1);
    }
}


