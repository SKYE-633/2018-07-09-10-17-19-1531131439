package practice03;

public class Worker {
    private int age;
    private String name;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}
