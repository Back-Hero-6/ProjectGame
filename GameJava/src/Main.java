import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Welcome to Battle 1 vs 1." + "\n" + "You have to choose the type and name of both Characters");

        Character character1 = createFirstCharacter();
        Character character2 = createSecondCharacter();
        battle(character1, character2);
    }

    private static Character createFirstCharacter() {
        Scanner sc = new Scanner((System.in));
        Character character1 = null;
        System.out.println("First create the Character 1");
        System.out.println("---------------");
        System.out.println("Character types available:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");
        System.out.println("[3] -> Exit Game");

        System.out.println("Choose the Character type: ");

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
                    int newStrength = new Random().nextInt(9) + 1;
                    character1 = new Warrior(newName, newHp, newStamina, newStrength);
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
                case 3: {
                    System.exit(1);
                }
                default: {
                    System.out.println("Select a correct Character type. Choose again.");
                    break;
                }
            }
        }
        return character1;
    }

    private static Character createSecondCharacter() {
        Scanner sc = new Scanner((System.in));
        Character character2 = null;
        System.out.println("---------------");
        System.out.println("Now create the second character");
        System.out.println("---------------");
        System.out.println("Character types available:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");
        System.out.println("[3] -> Exit Game");

        System.out.println("Choose the Character type: ");

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
                case 3: {
                    System.exit(1);
                }
                default: {
                    System.out.println("Select a correct Character type. Choose again");
                }
            }
        }
        return character2;

    }

    public static void battle(Character character1, Character character2) throws InterruptedException {
        int counter = 1;
        boolean winner;
        do {
            System.out.println("Round " + counter + " starting!" + "\n");
            character1.attack(character2);
            character2.attack(character1);
            System.out.println("Round " + counter + " finalized: " + "\n" + character1 + "\n" + character2 + "\n");
            System.out.println("------------------------");
            counter++;
            Thread.sleep(1000);
        } while (character1.isAlive() && character2.isAlive());

        if (character1.isAlive()) {
            System.out.println(character1.getName() + " wins!");
            System.out.println("------------------------");
            System.out.println("Game finalized: Choose new players or exit game");
        } else if (character2.isAlive()) {
            System.out.println(character2.getName() + " wins!");
            System.out.println("------------------------");
            System.out.println("Game finalized: Choose new players or exit game");
        } else {
            System.out.println("Draw!");
            System.out.println("------------------------");
            System.out.println("Game finalized: Choose new players or exit game");
            battle(createFirstCharacter(), createSecondCharacter());
        }
    }
}



