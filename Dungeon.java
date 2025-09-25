import java.util.ArrayList;

public class Dungeon {
    private String dungeonName;
    ArrayList<Mob> mobArray;

    public Dungeon(String dungeonName) {
        this.dungeonName = dungeonName;
        mobArray = new ArrayList<>();
    }

    public void addMob(Mob mob) {
        mobArray.add(mob);
    }

    public void startCombat(Player player) {
        for (Mob mob : mobArray) {
            mob.interactWithPlayer(player);
            player.receiveDamage(mob.getDamage());
        }
    }
}
