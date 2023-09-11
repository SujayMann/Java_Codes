public class p_2 {
    public static void main(String[] args) {
        Student s = new Student(2, "John");
        System.out.println(s.roll_no + " " + s.name);
    }
}

class Student {
    int roll_no;
    String name;
    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
