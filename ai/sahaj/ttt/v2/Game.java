package ai.sahaj.ttt.v2;

import java.util.Optional;

import ai.sahaj.ttt.core.*;

public interface Game {
    Player getPlayer();
    Optional<Player> playerAt(Position position);
    Game play(Player player, Position position);
}
