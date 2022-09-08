package ai.sahaj.ttt.v4;

import java.util.Optional;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Optional<Player> playerAt(Position position);
    Optional<Move> getMoveAt(Position position);
}
