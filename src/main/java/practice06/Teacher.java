package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        final String introduce = super.introduce();
        return String.format("%s I am a Teacher. I teach %s.", introduce, this.klass == 0
                ? "No Class" : "Class " + this.klass);
    }
}
