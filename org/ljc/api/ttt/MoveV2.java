package org.ljc.api.ttt;


public interface MoveV2 {
    Player getPlayer();
    Position getPosition();
    Undoable make();
}
