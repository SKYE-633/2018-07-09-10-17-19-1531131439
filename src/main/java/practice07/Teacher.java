package practice07;

import static java.util.Objects.isNull;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
        return String.format("%s I am a Teacher. I teach %s.", introduce, isNull(klass)
                ? "No Class" : this.klass.getDisplayName());
    }

    public String introduceWith(Student jerry) {
        final String introduce = super.introduce();

        return String.format("%s I am a Teacher. I %s %s.", introduce,
                this.klass.getNumber() == jerry.getKlass().getNumber()
                ? "teach" : "don't teach", jerry.getName());
    }
}
