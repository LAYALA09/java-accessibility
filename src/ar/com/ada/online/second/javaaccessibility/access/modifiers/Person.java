package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Person {
    public String name;
    public String lastName;
    public Integer age;


public void showAttributeValues(){
    System.out.println("Name: " + this.name);
    System.out.println("Last Name: " + this.lastName);
    System.out.println("Age = " + this.age);


}

}
