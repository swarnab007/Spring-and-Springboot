package game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Go into a Hole");
    }
    public void left() {
        System.out.println("Go Back");
    }
    public void right() {
        System.out.println("Accelarate");
    }
}
