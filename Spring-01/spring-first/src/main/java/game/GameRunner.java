package game;

public class GameRunner {

    // Tight Coupling - We are changing code to switch games
    // MarioGame game;
    SuperContraGame game;
    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is running " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
