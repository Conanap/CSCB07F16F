public class Student {
    private String name;
    private int s_number, iq;
    
    public Student(String name, int s_number, int iq) {
        this.name = name;
        this.s_number = s_number;
        this.iq = iq;
    }

    public int getIQ() {
        return this.iq;
    }

    public int askForIQ() {
        return this.iq * 10;
    }

    public String getName() {
        return this.name;
    }

    public String askForName() {
        return "sir " + this.name;
    }

    public int getSNumber() {
        return this.s_number;
    }

    public int askForSNumber() {
        return this.s_number + 1926;
    }
}