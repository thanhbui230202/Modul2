package SS4_Class_and_OOP.BT;

import java.util.Scanner;

public class QuadraticEquation {
    private  double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a,b,c: ");
        a = Double.parseDouble(scanner.nextLine());
        b = Double.parseDouble(scanner.nextLine());
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() >= 0){
            System.out.printf("Hiển thị 2 nghiệm : Nghiệm 1 là %f nghiệm 2 là %f  " , quadraticEquation.getRoot1() , quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.printf("Hiển thị 1 nghiệm : Nghiệm 1 là %f ",quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
