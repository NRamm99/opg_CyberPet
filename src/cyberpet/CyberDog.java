package cyberpet;

public class CyberDog extends CyberPet {
    public CyberDog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": Woof! Woof");
    }

    @Override
    public void move() {
        System.out.println(name + ": The CyberDog runs energetically.");
    }

}
