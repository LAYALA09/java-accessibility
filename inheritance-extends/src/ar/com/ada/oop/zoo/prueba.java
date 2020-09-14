package ar.com.ada.oop.zoo;

public class prueba {
    public static void main(String[] args) {
        Animal caso1 = new Animal("pitbull");
        Dog caso2 = new Dog(4,2,"pitbull");
        Hourse caso3 = new Hourse("pitbull", "renzo",  250);

        //caso3.getName();
        System.out.println("El caballo " + caso3.getName() + " de raza " + caso1.getBreed()  + " tiene una fuerza de " + caso3.getPoewr() + " libras. ");
        System.out.println("El perro tiene " + caso2.getLeg() + " patas, de edad"   + caso2.getAge()+ " años  y su raza es " + caso1.getBreed());
        System.out.println("El perro tiene " + caso2.getLeg() + " patas, de edad" + caso2.getAge()+ " años  y su raza es " + caso2.getBreed());


    }
}
