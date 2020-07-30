package ar.com.ada.online.second.projectname;

import java.util.Scanner;

//Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
//Considere que se cobra por m2
public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double costSquareMeter,totalSquareMeters,budget;

        System.out.println(" Enter total square meters ");
        totalSquareMeters = Keyboard.nextDouble();

        System.out.println(" Enter total costs square meter ");
        costSquareMeter = Keyboard.nextDouble();

        budget = totalSquareMeters * costSquareMeter  ;
        System.out.println(" Enter total square meters " + budget);


    }
}
