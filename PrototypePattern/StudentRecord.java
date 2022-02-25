package PrototypePattern;

public class StudentRecord implements Cloneable{
    private String name;
    private String id;
    private int age;
    private Course courses;
    StudentRecord(String name,String id,int age,Course courses){
        this.name=name;
        this.age=age;
        this.id=id;
        this.courses=courses;
    }
    StudentRecord(String name,String id,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    //Shallow Copy
    /*public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }*/
    //Deep Copy
   public Object clone(){
       try {
        StudentRecord s=(StudentRecord)super.clone();
           s.courses=new Course();
           return s;
       } catch (CloneNotSupportedException e) {
           return null;
       }

    }
    public void addCourses(Course courses){
        this.courses=courses;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setId(String id){
        this.id=id;
    }
    public int getNoOfCourses(){
        return courses.courseList.size();
    }
    public void getDetails(){
        System.out.println("Details of the Student : \nName : "+name+"\nId : "+id+"\nAge : "+age+"\nCourses : "+courses.getList());
    }
}
