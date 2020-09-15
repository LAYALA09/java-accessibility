package ar.com.ada.oop;

import zoo.Dog;
import zoo.Horse;

public class App {

    public static void main(String[] args) {

        Dog caso1 = new Dog(4, 6, "pug");
        Dog caso2 = new Dog(4, 2, "pitbull");


        Horse caso3 = new Horse("arabe", "renzo", 50);
        Horse caso4 = new Horse("andaluz", "azabache", 250);

//toString, hashCode, equals


        System.out.println("toString: " + caso1);


        System.out.println("toString: " + caso2);


        System.out.println("toString: " + caso3);


        System.out.println("toString: " + caso4 + "\n");


        System.out.println("First dog hashCode: " + caso1.hashCode());


        System.out.println("Second dog hashCode: " + caso2.hashCode());


        System.out.println("First horse hashCode: " + caso3.hashCode());


        System.out.println("Second horse hashCode: " + caso4.hashCode());


        System.out.printf("\nSe comprara si %s es igual a %s " +


                "\n Result =  %s\n", caso1, caso2, caso1.equals(caso2));


        System.out.printf("\nSe comprara si %s es igual a %s " +


                "\n Result =  %s\n", caso1, caso3, caso1.equals(caso3));


        System.out.printf("\nSe comprara si %s es igual a %s " +


                "\n Result =  %s\n", caso3, caso4, caso3.equals(caso4));
        System.out.printf("\nSe comprara si %s es igual a %s " +


                "\n Result =  %s\n", caso1, caso1, caso1.equals(caso1));


    }
}

