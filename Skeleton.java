public class Skeleton extends Mob {

    public Skeleton(String name, int life, int damage) {
        super(name, life, damage);
    }

    public String showInformation() {
        return "Skeleton name: " + getName() + " Life: " + getLife() + " Damage: " + getDamage();
    }

    public void interactWithPlayer(Player player) {
        System.out.println("The skeleton shoots arrows at the player " + getName() + " and causes " + getDamage() + " damage");
        player.receiveDamage(this.getDamage());
    }
}

