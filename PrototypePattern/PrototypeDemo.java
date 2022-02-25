package PrototypePattern;
import java.util.*;
public class PrototypeDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name of the Student :");
        String name=scanner.next();
        System.out.print("Id : ");
        String id=scanner.next();
        System.out.print("Age : ");
        int age=scanner.nextInt();
        Course course=new Course();
        course.addCourse("Data science");
        //Shallow copy
        StudentRecord record1=new StudentRecord(name,id,age,course);
        /*StudentRecord record2=(StudentRecord)record1.clone();
        record2.getDetails();
        record1.getDetails();*/
        //Deep Copy
        StudentRecord record3=(StudentRecord)record1.clone();
        record3.getDetails();
        record1.getDetails();

    }
}
