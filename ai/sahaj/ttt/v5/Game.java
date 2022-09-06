package ai.sahaj.ttt.v5;

import java.util.Optional;
import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Optional<Move> getMove(Position position);
    void show();
}
