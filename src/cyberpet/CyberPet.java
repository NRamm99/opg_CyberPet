package cyberpet;

public abstract class CyberPet {
    String name;

    protected CyberPet(String name) {
        this.name = name;
    }

    public abstract void speak();

    public abstract void move();

    public void charge() {
        System.out.println("Charging battery...");
    }
}
