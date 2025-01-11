public class Student {
    //Student object consists of name, rollNo, address
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Roll No. " + rollNo +
                ": " + name +
                ", " + address;
    }
}