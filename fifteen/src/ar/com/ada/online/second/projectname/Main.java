package ar.com.ada.online.second.projectname;
 //*Se desea calcular la potencia eléctrica de circuito de la figura 1.6. Realice un diagrama
// de flujo y el pseudocódigo que representen el algoritmo para resolver el problema.
// Considere que: P = V*I y V = R*I.//*

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double voltage,intensity,resistance,power;

        System.out.println(" Ingrese la intensidad ");
        intensity = Keyboard.nextDouble();

        System.out.println(" Ingrese la resistencia");
        resistance = Keyboard.nextDouble();
        voltage= resistance + intensity;
        power= voltage + intensity;


        System.out.println(" La potencia del ciruito es " + power);
    }
}
