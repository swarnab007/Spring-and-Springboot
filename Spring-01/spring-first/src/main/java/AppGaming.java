import game.GameRunner;
import game.MarioGame;
import game.PacmanGame;
import game.SuperContraGame;

public class AppGaming {
    public static void main(String[] args) {
        // var mariogame = new MarioGame();
        var game = new PacmanGame();
        // var supercontraGame = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
