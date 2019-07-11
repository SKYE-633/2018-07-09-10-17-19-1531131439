package practice04;

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
        return "I am a Student. I am at Class 2";
    }

    @Override
    public void basicIntroduce() {
        super.basicIntroduce();
    }
}
