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
        int battleMode = (Math.random() <= 0.5) ? 1 : 2;
        if (battleMode == 1 && getMana() >= 5) {
            enemy.setHp(enemy.getHp()-getIntelligence());
            setMana(getMana() - 5);
            System.out.println("Fireball!");
        } else if (getMana() >= 1) {
            enemy.setHp(enemy.getHp() - (getMana() / 2)); //check if it is really Mana/2 or only -2hp points.
            setMana(getMana() + 1);
            System.out.println("Staff hit!");
        } else setMana(getMana() + 2);
        System.out.println("Not enough mana to perform attack. Mana was increased to 2");
    }
}

