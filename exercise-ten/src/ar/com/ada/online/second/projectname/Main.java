package ar.com.ada.online.second.projectname;
//La CONAGUA requiere determinar el pago que debe realizar una persona por el total de
// metros cúbicos que consume de agua.
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    double costTotalConsum, TotalConsum, costcubicmeters;

    Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter water consumption");
        TotalConsum = keyboard.nextDouble();
        System.out.println(" Enter cost per cubic meter ");
        costcubicmeters = keyboard.nextDouble();
        costTotalConsum = TotalConsum * costcubicmeters;
        System.out.println("Call cost: " + costTotalConsum);
    }
}
