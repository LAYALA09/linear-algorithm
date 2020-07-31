package ar.com.ada.online.second.projectname;

// Determinar cuánto pagará finalmente una persona por un artículo equis, considerando
// que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
// descuento y el precio final).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double totalPrice, priceWithDescuent, price;
        final double desc = 20;
        final double IVA = 0.13;

        System.out.println(" Enter price: ");
        price = Keyboard.nextDouble();
        priceWithDescuent = price - (price * 0.2);
        System.out.println(" Price with discount: " + priceWithDescuent);


        totalPrice = priceWithDescuent + (price * IVA);

        System.out.println(" Price final with discount + IVA: " + totalPrice);
    }
}
