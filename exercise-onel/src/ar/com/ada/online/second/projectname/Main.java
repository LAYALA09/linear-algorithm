package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double base,height,area;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter the base");
	base = keyboard.nextDouble();
        System.out.print("Enter the height");
        height=keyboard.nextDouble();
        area = (base * height)/2;
        System.out.print("The area of the triangle is:" + area);

    }
}
