package practice07;

public class Klass {
    private int number;
    private String displayName;

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
        return String.format("Class %s", this.number);
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
