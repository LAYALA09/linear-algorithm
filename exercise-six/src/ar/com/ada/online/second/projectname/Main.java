package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {
   // Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el
    //diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
    //Recuerde que por Pitágoras se tiene que: C A B .

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double legA,hypotenuse,legB;

        System.out.println(" Enter leg A ");
        legA = Keyboard.nextDouble();

        System.out.println(" Enter leg B ");
        legB = Keyboard.nextDouble();


        hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        System.out.println(" The result is: " + hypotenuse);



    }
}
