import java.util.Scanner;

public class p_1 {
    public static void main(String[] args) {
        int length, breadth;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        length = input.nextInt();
        breadth = input.nextInt();
        Area a = new Area();
        a.setDim(length, breadth);
        System.out.println("Area of rectangle: " + a.getArea());
        input.close();
    }
}

class Area {
    int length, breadth;
    
    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}