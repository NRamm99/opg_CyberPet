package cyberpet;

public class CyberCat extends CyberPet {
    public CyberCat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": Meow! Meow");
    }

    @Override
    public void move() {
        System.out.println(name + ": The CyberCat moves gracefully.");
    }

}
