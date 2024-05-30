import MineSweeper.Game;

public class Main {
    public static void main(String[] args) {
        Game MineSweeper = new Game("Easy");
        UIUX uiux = new UIUX();
        MineSweeper.click(5,5);
        uiux.showGameEasy(MineSweeper.cell);
    }
}