package BT_QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    private double delta;
    private double r1,r2;

    public QuadraticEquation(){
    }

    public void Quadratiction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ba số a,b,c: ");
        this.a = a;
        double a = sc.nextDouble();
        this.b = b;
        double b = sc.nextDouble();
        this.c = c;
        double c = sc.nextDouble();
    }
    private double getA(){
        return a;
    }
    private double getB() {
        return b;
    }
    private double getC() {
        return c;
    }
    private double getDelta(){
        return delta = b*b - 4*a*c;
    }
    private double getRoot1(){
        return r1 = (-b- Math.sqrt(getDelta())/2*a*c);
    }
    private double getRoot2(){
        return r2 = (b- Math.sqrt(getDelta())/2*a*c);
    }
}
