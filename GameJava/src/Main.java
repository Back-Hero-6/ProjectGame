import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        Character character1;
        Character character2;

        System.out.println("Bienvenido al Battle 1 vs 1. \nA continuación escoge el nombre y tipo de jugadores que se van a enfrentar a muerte.");

        System.out.println("First create the Cacharacter 1");
        System.out.println("----- ---------");
        System.out.println("Classes availible:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");

        System.out.println("Choose the class: ");

        int options1 = 0;
        options1 = sc.nextInt();

        switch (options1){
            case 1:{

                System.out.println("You have chosen the warrior ");
                System.out.println("----- ---------");
                System.out.println("Give the warrior a name");

                String newName = sc.next();
                int newHp = new Random().nextInt(100)+100;
                int newStamina = new Random().nextInt(49)+10;
                int newStrenght = new Random().nextInt(9)+1;
                character1 = new Warrior(newName, newHp, newStamina, newStrenght);

                sc.close();
            }
            case 2:{

                System.out.println("You have chosen the wizard ");
                System.out.println("----- ---------");
                System.out.println("Give the wizard a name");

                String newName = sc.next();
                int newHp = new Random().nextInt(50)+50;
                int newMana = new Random().nextInt(40)+10;
                int newIntelligence = new Random().nextInt(49)+10;
                character1 = new Wizard(newName, newHp, newMana, newIntelligence);

                sc.close();
            }
            default:{
                System.out.println("select a correct class");
            }
        }

        System.out.println("Now create the second character");
        System.out.println("----- ---------");
        System.out.println("Classes availible:");
        System.out.println("[1] -> Warrior");
        System.out.println("[2] -> Wizard");

        System.out.println("Choose the class: ");

        int options2 = 0;
        options2 = sc.nextInt();

        switch (options2){
            case 1:{

                System.out.println("You have chosen the warrior ");
                System.out.println("----- ---------");
                System.out.println("Give the warrior a name");

                String newName = sc.next();
                int newHp = new Random().nextInt(100)+100;
                int newStamina = new Random().nextInt(49)+10;
                int newStrenght = new Random().nextInt(9)+1;
                character2 = new Warrior(newName, newHp, newStamina, newStrenght);

                sc.close();
            }
            case 2:{

                System.out.println("You have chosen the wizard ");
                System.out.println("----- ---------");
                System.out.println("Give the wizard a name");

                String newName = sc.next();
                int newHp = new Random().nextInt(50)+50;
                int newMana = new Random().nextInt(40)+10;
                int newIntelligence = new Random().nextInt(49)+10;
                character2 = new Wizard(newName, newHp, newMana, newIntelligence);

                sc.close();
            }
            default:{
                System.out.println("select a correct class");
            }
        }
    }
}
