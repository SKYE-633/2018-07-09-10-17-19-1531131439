package practice05;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        final String introduce = super.introduce();
        return String.format("%s I am a Worker. I have a job.", introduce);
    }
}
