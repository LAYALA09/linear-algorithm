package ar.com.ada.online.second.projectname;
//Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
  //utilizan.Considere que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double priceHour, amountHours,result;

        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Indique el precio de cada hora del estacionamiento: ");
        priceHour = Keyboard.nextDouble();

        System.out.print("Indique cantidad de horas en el estacionamiento: ");
        amountHours = Keyboard.nextDouble();

        result = priceHour * amountHours;
        System.out.print("El costo del estacionamiento es : " + result);

    }
}
