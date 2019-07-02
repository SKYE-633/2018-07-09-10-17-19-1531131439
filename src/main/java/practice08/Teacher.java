package practice08;

import static java.util.Objects.isNull;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        final String introduce = super.introduce();
        return String.format("%s I am a Teacher. I teach %s.", introduce,
                isNull(this.klass) ? "No Class" : this.klass.getDisplayName());
    }

    public String introduceWith(Student student) {
        final String introduce = super.introduce();
        return String.format("%s I am a Teacher. I %s.", introduce,
                this.klass.getNumber() == student.getKlass().getNumber()
                        ? "teach " + student.getName() : "don't teach " + student.getName());
    }
}
