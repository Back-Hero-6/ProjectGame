import java.util.Random;

public class Wizard extends Character{
    private int mana; //Pendiente: random between 10-50, representing a
    // resource the wizard consumes to cast spells (Private member)
    private int intelligence; //Pendiente: random between 1-50, measuring how
    // strong the wizard spells are (Private member)

    //Constructor
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        setMana(mana);
        setIntelligence(intelligence);

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
    public void attack(Character enemy){
        enemy.setHp(enemy.getHp()-getIntelligence());
        //pendiente:  that will take a character as a parameter and
        // reduce that character’s health based on the intelligence of the wizard

        // public void attack(Character enemy) {
        //        int battleMode = (Math.random() <= 0.5) ? 1 : 2;
        //
        //        if (battleMode == 1 && getStamina() >= 5) {
        //                enemy.setHp(enemy.getHp() - getStrength());
        //                setStamina(getStamina() - 5);
        //        }
        //
        //        if (getStamina() >= 1) {
        //            enemy.setHp(enemy.getHp() - (getStrength() / 2));
        //            setStamina(getStamina() + 1);
        //
        //        } else setStamina(getStamina() + 2);
        //        //pendiente:  that will take a character as a parameter and// reduce that character’s health based on the strength of the attack.
        //    }
    }
}
