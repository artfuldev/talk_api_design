package org.ljc.api.ttt;


public interface Move {
    Player getPlayer();
    Position getPosition();
    GameV4 make();
}
