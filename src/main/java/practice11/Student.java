package practice11;

import static java.util.Objects.isNull;

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
        return String.format("%s I am a Student. I am %s %s.", introduce,
                isNull(this.getKlass().getLeader()) || this.getId() != this.getKlass().getLeader().getId()
                        ? "at" : "Leader of", this.getKlass().getDisplayName());
    }
}
