package org.ljc.api.ttt;

public interface GameV2 {
    Player get();
    GameV2 play(
        Player player,
        Position position);
}
