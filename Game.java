public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Ly", 100);
        System.out.println(player1.showInformation());

        Mob skeleton1 = new Skeleton("Hard", 120, 20);
        System.out.println(skeleton1.showInformation());

        Mob zombie1 = new Zombie("Vic", 90, 10);
        System.out.println(zombie1.showInformation());

        skeleton1.interactWithPlayer(player1);
        zombie1.interactWithPlayer(player1);

        System.out.println(player1.showInformation());

        Dungeon dungeon1 = new Dungeon("Castle");
        dungeon1.addMob(skeleton1);
        dungeon1.addMob(zombie1);

        dungeon1.startCombat(player1);
        System.out.println(player1.showInformation());
    }
}

