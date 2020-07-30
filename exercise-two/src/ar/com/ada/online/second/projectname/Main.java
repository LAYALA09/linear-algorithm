package ar.com.ada.online.second.projectname;
//Una empresa importadora desea determinar cuántos dólares puede adquirir con equis
//cantidad de dinero mexicano

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double dollarAmount;
	double amountOfMexicanPesos;
	final double dollarPrice = 22.20;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de pesos mexicanos: ");
        amountOfMexicanPesos = keyboard.nextDouble();
        dollarAmount = amountOfMexicanPesos / dollarPrice;
        System.out.println("Usted puede adquirir: " + dollarAmount);
    }
}
