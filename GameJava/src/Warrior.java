public class Warrior extends Character {
    private int stamina; //Pendiente: random between 10-50, representing a resource
    // the warrior consumes to make an attack (Private member)
    private int strength; //Pendiente: random between 1-10, measuring how strong
    // the warrior attack is (Private member)


    //Constructor
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
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
    public void attack(Character enemy) {
        int battleMode = (Math.random() <= 0.5) ? 1 : 2;
        if (battleMode == 1 && getStamina() >= 5) {
            enemy.setHp(enemy.getHp() - getStrength());
            setStamina(getStamina() - 5);
            System.out.println("Heavy attack!");
        } else if (getStamina() >= 1) {
            enemy.setHp(enemy.getHp() - (getStrength() / 2));
            setStamina(getStamina() + 1);
            System.out.println("Weak attack!");
        } else setStamina(getStamina() + 2);
        System.out.println("Not enough stamina to perform attack. Stamina was increased to 2");
    }

}

