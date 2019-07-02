package practice10;

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
        return String.format("Class %s", number);
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != this.getNumber()){
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void appendMember(Student student) {

    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) {
            return false;
        }
        Klass newKlass = (Klass) obj;
        return this.getNumber() == newKlass.getNumber();
    }
}
