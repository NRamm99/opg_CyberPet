import java.util.ArrayList;

import cyberpet.CyberDog;
import cyberpet.CyberPet;

public class Main {
    static ArrayList<CyberPet> pets = new ArrayList<>();

    public static void main(String[] args) {
        pets.add(new CyberDog("Rex"));
        pets.add(new cyberpet.CyberCat("Whiskers"));

        clearConsole();
        for (CyberPet pet : pets) {
            pet.speak();
            pet.move();
            pet.charge();
            System.out.println();
        }
    }

    private static void clearConsole() {
        for (int i = 0; i < 20; ++i)
            System.out.println();
    }
}