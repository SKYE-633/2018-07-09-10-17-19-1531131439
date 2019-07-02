package practice08;

import static java.util.Objects.nonNull;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
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
        return String.format("%s I am a Student. I am %s.", introduce,
                nonNull(this.klass.getLeader()) && this.klass.getLeader().getName().equals(this.getName())
                        ? "Leader of Class 2" : "at " + this.klass.getDisplayName());
    }
}
