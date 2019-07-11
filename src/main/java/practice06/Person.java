package practice06;

public class Person {
  private String name;
    private int age;
    public Person(){
        name = "Tom";
        age = 21;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is"+name+"."+"I am"+age+"years old.";
    }
}
