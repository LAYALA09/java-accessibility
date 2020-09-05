package ar.com.ada.online.second.javaaccessibility;

import ar.com.ada.online.second.javaaccessibility.access.modifiers.Person;


public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Liliana";
        p1.lastName = "Rigazzi";
        p1.age = 50;

        p1.showAttributeValues();


    }
}
