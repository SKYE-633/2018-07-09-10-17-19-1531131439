package practice11;

import static java.util.Objects.isNull;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.number) {
            System.out.println("It is not one of us.");
        } else {
            this.leader = student;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student student) {
        this.leader = student;
    }

    public void appendMember(Student student) {

    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) {
            return false;
        }

        Klass newKlass = (Klass) obj;
        return this.number == newKlass.number;
    }
}
