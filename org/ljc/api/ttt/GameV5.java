package org.ljc.api.ttt;
import java.util.Map;

public interface GameV5 {
    Player getPlayer();
    Map<Position, MoveV2> getMoves();
//  same as
//  Optional<MoveV2> getMove(Position position);
}
