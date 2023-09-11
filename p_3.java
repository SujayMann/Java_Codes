public class p_3 {
    public static void main(String[] args) {
        Student s1 = new Student(2, "9876543210", "home");
        Student s2 = new Student(3, "9845671230", "mansion");
        s1.printInfo();
        s2.printInfo();
    }
}

class Student {
    int roll_no;
    String phone_number, address;
    public Student(int roll_no, String phone_number, String address) {
        this.roll_no = roll_no;
        this.phone_number = phone_number;
        this.address = address;
    }
    void printInfo() {
        System.out.println("Roll number: " + roll_no);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Address: " + address);
    }
}