package ar.com.ada.online.second.projectname;
//Determinar el promedio que obtendrá un alumno considerando que realiza tres
//exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,
//mientras que el tercero de 50%.


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double firstQualification, secondQualification, thirdGrade, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese primer calificación ");
        firstQualification = keyboard.nextDouble();
        firstQualification = firstQualification * 0.25;
        System.out.println(" Ingrese segunda calificación ");
        secondQualification = keyboard.nextDouble();
        secondQualification = secondQualification * 0.25;
        System.out.println(" Ingrese tercer calificación ");
        thirdGrade = keyboard.nextDouble();
        thirdGrade = thirdGrade * 0.50;

        average = firstQualification + secondQualification + thirdGrade;
        System.out.println("El promedio de las notas es:  " + average);

    }
}
