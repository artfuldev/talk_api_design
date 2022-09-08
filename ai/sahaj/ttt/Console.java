package ai.sahaj.ttt;

import ai.sahaj.ttt.core.*;
import ai.sahaj.ttt.v1.*;

public class Console {
    public static void main(String[] args) {
        Game game = new Game(); // ignore
        game.show();
        Player player = game.getPlayer();
        Position position = Position.TopLeft;
        game.play(player, position);
    }
}
