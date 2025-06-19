import game.GameRunner;
import game.MarioGame;
import game.SuperContraGame;

public class AppGaming {
    public static void main(String[] args) {
        // var mariogame = new MarioGame();

        var supercontraGame = new SuperContraGame();
        var gameRunner = new GameRunner(supercontraGame);

        gameRunner.run();
    }
}
