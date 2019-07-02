package practice10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classes = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        final String introduce = super.introduce();
        return String.format("%s I am a Teacher. I teach %s.", introduce,
                isNull(this.classes) || this.classes.size() == 0 ? "No Class" : "Class 2, 3");
    }

    public boolean isTeaching(Student student) {
        return this.getClasses().contains(student.getKlass());
    }
}
