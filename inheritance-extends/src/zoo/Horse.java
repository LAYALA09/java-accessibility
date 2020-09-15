package zoo;


import java.util.Objects;

public class Horse extends Animal {
    private String name;
    private Integer power;


    ///contructor 1
    public Horse() {

    }


    //contructor 2

    public Horse(String breed, String name, Integer poewr) {
        super(breed);
        this.power = poewr;
        this.name = name;

    }

    //setters


    public void setName(String breed, String name, Integer power) {
        this.setBreed(breed);
        this.name = name;
        this.power = power;


    }


    ///getters

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }


    //Override


    @Override


    public String toString() {


        return String.format("Horse: {breed = %s, name = %s, power = %s} ", getBreed(), this.name, this.power);


    }


    @Override


    public int hashCode() {


        return -30 * Objects.hash(name, power);


    }



    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;


        if (obj == null || this.getClass() != obj.getClass()) return false;


        Horse that = (Horse) obj;


        return name.equals(that.name) && power.equals(that.power);


    }
}


