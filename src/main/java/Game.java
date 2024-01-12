import java.util.HashMap;

public class Game {
    HashMap<String, Player> playerHashMap = new HashMap<>();

    public void register(String name, Player player) {
        playerHashMap.put(name, player);
    }

    public Player findByName(String name) {
        if (playerHashMap.containsKey(name)) {
            return playerHashMap.get(name);
        } else
            return null;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        } else if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }


}
