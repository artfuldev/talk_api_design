package org.ljc.api.ttt;

public interface Game {
    Player get();
    void Play(
        Player player,
        Position position);
}
