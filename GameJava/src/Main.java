import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to Battle 1 vs 1. \nYou have to choose the type and name of both Characters");

        createFirstCharacter();
        createSecondCharacter();

    }

    private static Character createFirstCharacter() {
        Scanner sc = new Scanner((System.in));
        Character character1 = null;
        System.out.println("First create the Character 1");
        System.out.println("----- ---------");
        System.out.println("Classes available:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");

        System.out.println("Choose the class: ");

        int options1 = 1;

        while (options1 != 0) {
            options1 = sc.nextInt();
            switch (options1) {
                case 1: {

                    System.out.println("You have chosen the warrior 1 ");
                    System.out.println("----- ---------");
                    System.out.println("Give the warrior 1 a name");

                    String newName = sc.next();
                    int newHp = new Random().nextInt(100) + 100;
                    int newStamina = new Random().nextInt(49) + 10;
                    int newStrenght = new Random().nextInt(9) + 1;
                    character1 = new Warrior(newName, newHp, newStamina, newStrenght);
                    options1 = 0;
                    return character1;
                }
                case 2: {

                    System.out.println("You have chosen the wizard 1 ");
                    System.out.println("----- ---------");
                    System.out.println("Give the wizard 1 a name");

                    String newName = sc.next();
                    int newHp = new Random().nextInt(50) + 50;
                    int newMana = new Random().nextInt(40) + 10;
                    int newIntelligence = new Random().nextInt(49) + 10;
                    character1 = new Wizard(newName, newHp, newMana, newIntelligence);
                    options1 = 0;
                    return character1;
                }
                default: {
                    System.out.println("select a correct class. Chose again");
                    break;
                }
            }
        }
        return character1;
    }

    private static Character createSecondCharacter() {
        Scanner sc = new Scanner((System.in));
        Character character2 = null;
        System.out.println("Now create the second character");
        System.out.println("----- ---------");
        System.out.println("Classes available:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");

        System.out.println("Choose the class: ");

        int options2 = 1;

        while (options2 != 0) {
            options2 = sc.nextInt();
            switch (options2) {
                case 1: {

                    System.out.println("You have chosen the warrior 2");
                    System.out.println("----- ---------");
                    System.out.println("Give the warrior 2 a name");

                    String newName = sc.next();
                    int newHp = new Random().nextInt(100) + 100;
                    int newStamina = new Random().nextInt(49) + 10;
                    int newStrenght = new Random().nextInt(9) + 1;
                    character2 = new Warrior(newName, newHp, newStamina, newStrenght);
                    options2 = 0;
                    return character2;

                }
                case 2: {

                    System.out.println("You have chosen the wizard 2 ");
                    System.out.println("----- ---------");
                    System.out.println("Give the wizard 2 a name ");

                    String newName = sc.next();
                    int newHp = new Random().nextInt(50) + 50;
                    int newMana = new Random().nextInt(40) + 10;
                    int newIntelligence = new Random().nextInt(49) + 10;
                    character2 = new Wizard(newName, newHp, newMana, newIntelligence);
                    options2 = 0;
                    return character2;
                }
                default: {
                    System.out.println("select a correct class");
                }
            }
        }
        return character2;

    }
}
