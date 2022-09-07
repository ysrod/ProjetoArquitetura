package exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Register register = new Register();

        int quantity = input.nextInt();

        register.makeLineItem(quantity);


        register.print();

    }

}
