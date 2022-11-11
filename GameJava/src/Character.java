public abstract class Character {
    private String id;
    private String name;
    private int hp; // Pendiente: random between 100-200 to warriors and 50-100 for wizards,
    // representing the health points (Private member)
    private boolean isAlive = true;

    // Constructor

    public Character(String name, int hp) {
        setName(name);
        setHp(hp);
    }


    //Getter & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
