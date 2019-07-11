package practice05;

public class Worker extends Person{

    public Worker(){

    }
    public Worker(String name, int age){
        super(name,age);
    }
    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }

}
