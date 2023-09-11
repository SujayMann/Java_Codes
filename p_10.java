import java.util.Formatter;

public class p_10 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "68D-WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B-WallsStreet");
        print(e1, e2, e3);
    }

    public static void print(Employee e1, Employee e2, Employee e3) {
        Formatter fmt = new Formatter();
        String format = "%1$-10s%2$-10s%3$15s\n";
        fmt.format(format, "Name", "Year of joining", "Address");
        System.out.print(fmt);
        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
        // fmt.close();
    }
}

class Employee {
    String name, address;
    int year_of_joining;

    public Employee(String name, int year_of_joining, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }

    public void printInfo() {
        Formatter fmt = new Formatter();
        String format = "%1$-15s%2$-10s%3$19s\n";
        fmt.format(format, name, year_of_joining, address);
        System.out.print(fmt);
    }
}