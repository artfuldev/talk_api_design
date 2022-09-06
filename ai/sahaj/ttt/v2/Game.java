package ai.sahaj.ttt.v2;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Game play(Player player, Position position);
    void show();
}
