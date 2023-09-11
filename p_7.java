import java.util.Scanner;

public class p_7 {
    public static void main(String[] args) {
        int length, breadth;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        length = input.nextInt();
        breadth = input.nextInt();
        Area a = new Area(length, breadth);
        System.out.println("Area of rectangle: " + a.returnArea());
        input.close();
    }
}

class Area {
    int length, breadth;
    
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea() {
        return length * breadth;
    }
}