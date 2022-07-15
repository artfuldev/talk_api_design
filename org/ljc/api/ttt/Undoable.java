package org.ljc.api.ttt;


public interface Undoable extends GameV4 {
    GameV4 undo();
}
