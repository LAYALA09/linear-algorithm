package ar.com.ada.online.second.projectname;

import java.util.Scanner;

//Una empresa que contrata personal requiere determinar la edad de las personas que
//solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
//que nacieron
public class Main {

    public static void main(String[] args) {
        int yearOfBirth,currentYear,age;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter year of birth");
        yearOfBirth = Keyboard.nextInt();
        System.out.println("Enter current year");
        currentYear = Keyboard.nextInt();
        age = currentYear - yearOfBirth;
        System.out.println("The age of the employee is: " + age);



    }
}
