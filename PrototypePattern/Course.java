package PrototypePattern;

import java.util.*;

public class Course {
    public List<String> courseList=new ArrayList<String>();
    public String getList(){
        return courseList.toString();
    }
    public void addCourse(String course){
        courseList.add(course);
    }
}
