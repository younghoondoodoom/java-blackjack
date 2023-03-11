package domain.vo;

import domain.type.Result;
import java.util.List;

public class Profit {

    private static final int NUMBER_TO_MULTIPLE_DEALER_PROFIT = -1;
    private final double value;

    private Profit(final double value) {
        this.value = value;
    }


    public static Profit blackJackVictory(final Batting batting) {
        return new Profit(batting.getValue() * Result.BLACKJACK_VICTORY.getRate());
    }

    public static Profit victory(final Batting batting) {
        return new Profit(batting.getValue() * Result.VICTORY.getRate());
    }

    public static Profit defeat(final Batting batting) {
        return new Profit(batting.getValue() * Result.DEFEAT.getRate());
    }

    public static Profit draw() {
        return new Profit(Result.DRAW.getRate());
    }

    public static Profit makeDealerProfitFrom(final List<Profit> playerProfits) {
        double sum = playerProfits.stream()
            .mapToDouble(Profit::getValue)
            .sum();
        return new Profit(sum * NUMBER_TO_MULTIPLE_DEALER_PROFIT);
    }

    public double getValue() {
        return value;
    }
}
