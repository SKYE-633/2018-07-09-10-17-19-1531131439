package practice02;

  public class Student extends Person{
    public Student() {
        private int klass;
    }
    public Student(){
        klass = 2;
    }
    public Student(String name, int age){
        super(name,age);
    }

    public String introduce(){
        return "I am a Student. I am at Class"+klass;
    }
}

