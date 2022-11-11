import java.util.Random;

public class Wizard extends Character{
    private int mana; //Pendiente: random between 10-50, representing a
    // resource the wizard consumes to cast spells (Private member)
    private int intelligence; //Pendiente: random between 1-50, measuring how
    // strong the wizard spells are (Private member)

    //Constructor
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        mana=hp=new Random().nextInt(40)+10;
        setIntelligence(intelligence);
        hp=new Random().nextInt(50)+50;
    }

    //Getters & Setters

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Function Attack
    public void attack(Character character){
        //pendiente:  that will take a character as a parameter and
        // reduce that character’s health based on the strength of the attack.
    }
}
