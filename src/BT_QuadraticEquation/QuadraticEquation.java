package BT_QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public void Quadratiction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ba số a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
    }
    public double getA(){
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDelta(){
        return double delta = b*b - 4*a*c;
    }
    public double getRoot1(){
        return double r1 = (-b- Math.sqrt(getDelta()))/2*a*c;
    }
}
