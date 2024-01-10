import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void roundPlayer1WinnerTest() {
        Player player1 = new Player(1, "Vasya", 23);
        Player player2 = new Player(2, "Petya", 11);

        Game game = new Game();
        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

}