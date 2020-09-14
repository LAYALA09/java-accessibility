package ar.com.ada.oop.zoo;



public class Hourse extends Animal {
    private String name;
    private Integer poewr = 0;


    ///contructor 1
    public Hourse() {

    }


    //contructor 2

    public Hourse(String breed, String name, Integer poewr) {
        super(breed);
        this.poewr = poewr;
        this.name = name;

    }

    //setters


    public void setName(String breed, String name, Integer poewr) {
        this.setBreed(breed);
        this.name = name;
        this.poewr = poewr;

          System.out.println("El caballo " + getName() + "de raza " + getBreed() + "tiene una fuerza de" + getPoewr() + "libras. ");
    }


    ///getters

    public String getName() {
        return name;
    }

    public Integer getPoewr() {
        return poewr;
    }





    @Override

    public String toString() {


            if (getName() == null) return "sin marca";
            return this.getBreed();

       // return "Es de raza " + getBreed()+ ", el caballo" + getName() + " y tiene una fuerza de " + getPoewr() + " libras. ";

    }

    }



