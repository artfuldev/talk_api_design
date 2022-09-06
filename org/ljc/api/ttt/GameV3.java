package org.ljc.api.ttt;

public interface GameV3 {
    Player get();
    GameV3 play(Position position);
}
