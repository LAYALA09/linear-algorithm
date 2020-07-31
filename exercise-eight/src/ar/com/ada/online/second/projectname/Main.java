package ar.com.ada.online.second.projectname;
//Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
//en bicicleta, considerando que lleva una velocidad constante.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double time, kilometre, velocity;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la velocidad ");
        velocity = keyboard.nextDouble();
        System.out.println(" Ingrese la cantidad de km a recorrer: ");
        kilometre = keyboard.nextDouble();
        time = kilometre / velocity;
        System.out.println(" El ciclista tardará " + time+ " hs en recorrer " + kilometre + " kilómetros");





    }
}
