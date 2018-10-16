package com.company;

import javax.naming.Name;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoceApp {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Invoce> myInvoce = new ArrayList<Invoce>();
        double total =0;
        double sumt = 0;
        double sum = 0;
        String userInput = "";
        Scanner in= new Scanner(System.in);

        do {
            //String userInput = "";
            System.out.println("Enter Item Name");
            String Item  = in.next();
            System.out.println("Enter a price");
            double price = in.nextDouble();
            System.out.println("Enter the quntity");
            int quantity = in.nextInt();
           // System.out.println("Enter total");
            total = quantity*price;
            myInvoce.add(new Invoce(Item, price, quantity, total));
            System.out.println("would you like to enter another Item Y(yes) or N(no):");
                 userInput = in.next();
        } while (!userInput.equalsIgnoreCase("no"));


        for (Invoce groInvoce : myInvoce) {
            System.out.println(groInvoce.getName() + "  \t" + groInvoce.getPrice() + "  \t " +
                    groInvoce.getQuntity() + "   \t " + groInvoce.total() +  " \t" );
           sumt += groInvoce.total();
        }
        System.out.println("GrandTotal : " + sumt);
        System.out.println( "Total Items: "  + myInvoce.size());
    }
}
