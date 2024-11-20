import Oops.Shapes;

public class Dog  {

    String Name;
    String Breed;
    public Dog(String Name,String Breed ){
        this.Name=Name;
        this.Breed=Breed;
    }

    public Dog() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.Name= "sam";
        dog1.Breed="golden retriver";
        Dog dog2= new Dog();
        dog2.Name="raju";
        dog2.Breed="bull dog";
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
        dog1.setBreed("labrador");
        System.out.println(dog1.getName() + " is now  a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");

    }
}
