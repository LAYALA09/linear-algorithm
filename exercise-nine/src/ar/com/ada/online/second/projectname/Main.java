package ar.com.ada.online.second.projectname;

import java.util.Scanner;

//Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
//el tiempo que dura la llamada y en el costo por minuto
public class Main {

    public static void main(String[] args) {
        double costCall, costMinute, time;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter time");
        time = keyboard.nextDouble();
        System.out.println(" Enter cost per minute ");
        costMinute = keyboard.nextDouble();
        costCall = time * costMinute;
        System.out.println("Call cost: " + costCall);

    }
}
