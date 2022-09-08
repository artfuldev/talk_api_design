package ai.sahaj.ttt.v0;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    void play(Player player, Position position);
}
