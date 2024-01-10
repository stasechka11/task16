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

    @Test
    public void roundPlayer2WinnerTest() {
        Player player1 = new Player(3, "Anya", 1);
        Player player2 = new Player(4, "Olya", 5);

        Game game = new Game();
        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundDrawGameTest() {
        Player player1 = new Player(5, "Anton", 122);
        Player player2 = new Player(6, "Kostia", 122);

        Game game = new Game();
        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round(player1.getName(), player2.getName());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundPlayer1NotRegisteredTest() {
        Player player1 = new Player(10, "Angelina", 23);
        Player player2 = new Player(11, "Valeria", 55);

        Game game = new Game();
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(player1.getName(), player2.getName());
        });
    }

    @Test
    public void roundPlayer2NotRegisteredTest() {
        Player player1 = new Player(12, "Petr", 230);
        Player player2 = new Player(13, "Mark", 34);

        Game game = new Game();
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(player1.getName(), player2.getName());
        });
    }
}