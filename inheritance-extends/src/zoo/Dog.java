package zoo;


import java.util.Objects;

public class Dog extends Animal {//subclase de Animal
    private Integer legs;
    private Integer age;

    //contructor 1
    public Dog() {

    }

    //constructor 2
    public Dog(Integer legs, Integer age, String breed) {
        super(breed);
        this.age = age;
        this.legs = legs;


    }

    //setters

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLeg(Integer legs) {
        this.legs = legs;
    }

    //getters

    public Integer getAge() {
        return age;
    }

    public Integer getLeg() {
        return legs;
    }

    //Override


    @Override


    public String toString() {


        return String.format("Dog: {breed = %s, legs = %s, age = %s} ", getBreed(), this.legs, this.age);


    }


    @Override


    public int hashCode() {


        return -20 * Objects.hash(legs, age);


    }


    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;


        if (obj == null || this.getClass() != obj.getClass()) return false;


        Dog that = (Dog) obj;


        return legs.equals(that.legs) && age.equals(that.age);


    }
}


