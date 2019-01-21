package Streams;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
       /* double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : BoardGame.GAMES) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);*/

        Stream<BoardGame> stream1 = BoardGame.GAMES
                .stream()
                .filter(g -> g.name.contains("a"))
                .sorted((a, b) -> (int) (100 * (b.rating - a.rating)));
        BoardGame winner = stream1.findFirst().get();
        System.out.println(winner.name);


    }
}
