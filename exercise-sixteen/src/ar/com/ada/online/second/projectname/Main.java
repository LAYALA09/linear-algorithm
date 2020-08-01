package ar.com.ada.online.second.projectname;
//Represente el área de un cuadrado.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double heightSquare,areaSquare;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println(" Ingrese lado del cuadrado ");
        heightSquare = Keyboard.nextDouble();



        areaSquare = Math.pow(heightSquare, 2) ;
        System.out.println(" El área del cuadrado es:  " + areaSquare);
    }
}
