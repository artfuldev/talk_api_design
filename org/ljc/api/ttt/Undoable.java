package org.ljc.api.ttt;


public interface Undoable extends GameV5 {
    GameV5 undo();
}
