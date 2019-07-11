package practice05;

public class Student extends Person{
    public Student() {

        int klass;
    }
    public Student(){

    }
    public Student(String name, int age){
        super(name,age);
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old."+"I am a Student. I am at Class 2";
    }


}
