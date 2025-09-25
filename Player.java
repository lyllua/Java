public class Player {
    private String playerName;
    private int playerLife;

    public Player(String playerName, int playerLife) {
        this.playerName = playerName;
        this.playerLife = playerLife;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerLife() {
        return playerLife;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerLife(int playerLife) {
        this.playerLife = playerLife;
    }

    public String showInformation() {
        return "Player name: " + this.playerName + " Life: " + this.playerLife;
    }

    public void receiveDamage(int amount) {
        this.playerLife = this.playerLife - amount;
    }
}
