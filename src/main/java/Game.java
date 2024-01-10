import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> playersList = new ArrayList<>();

    public void register(Player player) {
        playersList.add(player);
    }
}
