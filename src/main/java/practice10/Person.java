package practice10;

import static java.util.Objects.isNull;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) {
            return false;
        }

        Person newPerson = (Person) obj;
        return this.id == newPerson.id;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old.";
    }
}
