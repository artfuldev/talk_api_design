package ai.sahaj.ttt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ai.sahaj.ttt.core.*;
import ai.sahaj.ttt.v0.*;

public class Console {

    private static String asString(List<Position> positions, Game game) {
        return positions
            .stream()
            .map(position -> game.playerAt(position))
            .map(player -> player.map(Player::toString).orElse("_"))
            .collect(Collectors.joining(" "));
    }

    private static String asString(Game game) {
        return Arrays.asList(
            Arrays.asList(Position.TopLeft, Position.TopCenter, Position.TopRight),
            Arrays.asList(Position.MiddleLeft, Position.MiddleCenter, Position.MiddleRight),
            Arrays.asList(Position.BottomLeft, Position.BottomCenter, Position.BottomRight)
        ).stream()
        .map(row -> asString(row, game))
        .collect(Collectors.joining("\n"));
    }

    private static void print(Game game) {
        System.out.println("Current Player" + game.getPlayer());
        System.out.println("Game\n" + asString(game));
    }

    public static void main(String[] args) {
        Game game = new Game(); // ignore
        Player player = game.getPlayer();
        Position position = Position.TopLeft;
        game.play(player, position);
    }
}
