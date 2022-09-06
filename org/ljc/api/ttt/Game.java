package org.ljc.api.ttt;

public interface Game {
    Player get();
    void play(
        Player player,
        Position position);
}
