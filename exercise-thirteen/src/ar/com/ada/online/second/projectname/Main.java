package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    //Determinar cuánto dinero ahorra una persona en un año si considera que cada semana
    //ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
   // sueldo).

    public static void main(String[] args) {
        double weeklysavings,monthlysavings,annualsavings,msalay;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter salary" );
        msalay= keyboard.nextDouble();
        weeklysavings=msalay*0.15;
        monthlysavings=weeklysavings*4;
        annualsavings=monthlysavings*12;
        System.out.print("Annual savings is: "  + annualsavings);
    }
}
