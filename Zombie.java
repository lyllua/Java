public class Zombie extends Mob {
    public Zombie(String name, int life, int damage) {
        super(name, life, damage);
    }

    @Override
    public void interactWithPlayer(Player player) {
        System.out.println("The zombie shoots arrows at the player " + getName() + " and causes " + getDamage() + " damage");
    }

    public String showInformation() {
        return "Zombie name: " + getName() + " Life: " + getLife() + " Damage: " + getDamage();
    }
}



