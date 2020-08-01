package ar.com.ada.online.second.projectname;

import java.util.Scanner;

//El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped por su
//estancia en una de sus habitaciones
public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int numberOfNights;
        double roomPrice;
        double totalPayment;

        System.out.println(" Ingrese número de noches  ");
        numberOfNights = Keyboard.nextInt();

        System.out.println(" Ingrese costo de habitación");
        roomPrice = Keyboard.nextDouble();
        totalPayment = numberOfNights* roomPrice;

        System.out.println(" Monto a cobrar es: " + totalPayment);
    }
}

