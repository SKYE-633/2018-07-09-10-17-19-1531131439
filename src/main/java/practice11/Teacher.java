package practice11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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
        List<String> classNumber = new ArrayList<>();
        for (Klass klass: classes) {
            classNumber.add(klass.getNumber()+"");
        }
        return String.format("%s I am a Teacher. I teach %s.", introduce,
                this.classes.size() == 0 ? "No Class"
                        : "Class " + String.join(", ", classNumber));
    }

    public boolean isTeaching(Student student) {
        return this.classes.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        final String introduce = super.introduce();
        return String.format("%s I am a Teacher. I %s.", introduce,
                this.classes.contains(student.getKlass()) ? "teach "+ student.getName() : "don't teach " + student.getName());
    }
}
