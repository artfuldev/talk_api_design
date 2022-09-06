package ai.sahaj.ttt.console;

import ai.sahaj.ttt.core.*;
import ai.sahaj.ttt.v5.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(); // ignore
        game.show();
        Player player = game.getPlayer();
        Position position = Position.TopLeft;
        Undoable played = game.getMove(position).map(m -> m.make()).orElseThrow();
        played.show();
        Game undone = played.undo();
        undone.show();
    }
}
