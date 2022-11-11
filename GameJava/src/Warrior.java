import java.util.Random;

public class Warrior extends Character{
    private int stamina; //Pendiente: random between 10-50, representing a resource
    // the warrior consumes to make an attack (Private member)
    private int strength; //Pendiente: random between 1-10, measuring how strong
    // the warrior attack is (Private member)


    //Constructor
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        strength= new Random().nextInt(9)+1;
        hp=new Random().nextInt(100)+100;
    }

    //Getters & Setters
    //Revisar getters y setters segun condiciones como el Random

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //Function Attack
    public void attack(Character character){
        //pendiente:  that will take a character as a parameter and
        // reduce that character’s health based on the strength of the attack.
    }
}
