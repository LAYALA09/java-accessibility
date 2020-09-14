package ar.com.ada.oop.zoo;

public class Dog extends Animal {//subclase de Animal
    private Integer leg=0;
    private Integer age=0;
//contructor 1
    public Dog() {

    }
 //constructor 2
    public Dog(Integer leg, Integer age, String breed) {
        super(breed);
        this.age = age;
        this.leg = leg;


    }

    //setters

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    //getters

    public Integer getAge() {
        return age;
    }

    public Integer getLeg() {
        return leg;
    }

    @Override
    public void setBreed(String breed) {
        super.setBreed(breed);
    }

    @Override
    public String getBreed() {
        return super.getBreed();
    }
}
