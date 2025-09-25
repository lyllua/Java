public abstract class Mob {
    private String name = new String();
    private int life;
    private int damage;

    public Mob(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }

    public void setName() {
        this.name = name;
    }

    public void setLife() {
        this.life = life;
    }

    public void setDamage() {
        this.damage = damage;
    }

    public String showInformation() {
        return "Name: " + this.name + " Life: " + this.life + " Damage: " + this.damage;
    }

    abstract void interactWithPlayer(Player player);
}
