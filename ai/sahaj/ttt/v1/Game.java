package ai.sahaj.ttt.v1;

import java.util.Optional;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Optional<Player> playerAt(Position position);
    void play(Player player, Position position);
}
