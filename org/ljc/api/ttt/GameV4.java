package org.ljc.api.ttt;
import java.util.Map;

public interface GameV4 {
    Player getPlayer();
    Map<Position, Move> getMoves();
//  same as
//  Optional<Move> getMove(Position position);
}
