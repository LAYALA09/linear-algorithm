package ar.com.ada.online.second.projectname;
//Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
// sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los
// gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros
// gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de
// flujo y pseudocódigo que representen el algoritmo que determine el monto del cheque.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double numberOfDays, costHotel, costFood, dailyExpenses, TotalSpends;

        System.out.println("Enter number of days ");
        numberOfDays = Keyboard.nextDouble();

        System.out.println("Enter cost food ");
        costFood = Keyboard.nextDouble();

        System.out.println("Enter cost hotel ");
        costHotel = Keyboard.nextDouble();

        dailyExpenses = costFood + costHotel + 100;
        TotalSpends = numberOfDays * dailyExpenses;


        System.out.println("Total Spends " + TotalSpends);

    }
}
