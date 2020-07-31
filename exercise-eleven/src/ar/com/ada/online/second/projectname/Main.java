package ar.com.ada.online.second.projectname;

import java.util.Scanner;

//La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
//persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW).
public class Main {

    public static void main(String[] args) {
        double costConsumekilowatts, consumekilowatts, kilowatts;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter kilowatts");
        kilowatts = keyboard.nextDouble();
        System.out.println(" Enter consumption of kilowatts ");
        consumekilowatts = keyboard.nextDouble();

        costConsumekilowatts = consumekilowatts * kilowatts;
        System.out.println("Call cost: " + costConsumekilowatts);
    }
}
