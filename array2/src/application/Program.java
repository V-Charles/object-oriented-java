package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        // .length returns the total number of elements in the array
        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            // Adds the price of each product to the total sum
            // by calling the getter method
            sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;

        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}
