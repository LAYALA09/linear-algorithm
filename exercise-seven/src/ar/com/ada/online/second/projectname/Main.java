package ar.com.ada.online.second.projectname;
import java.util.Scanner;

public class Main {
    //La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
   // boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por kilómetro

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double kilometrPorRecorrer, costoPorKilometro, totalPorRecorrer;

        System.out.println(" Ingresar kilometro por recorrer ");
        kilometrPorRecorrer = Keyboard.nextDouble();

        System.out.println(" Ingresar costo por recorrer ");
        costoPorKilometro = Keyboard.nextDouble();

        totalPorRecorrer = kilometrPorRecorrer * costoPorKilometro  ;
        System.out.println(" El costo del pasaje " + totalPorRecorrer);


    }
}
