package ai.sahaj.ttt.v3;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Game play(Position position);
    void show();
}
