package scenario2;


import java.util.ArrayList;
import java.util.List;


class Compare {
    /**
     * I think we all remember that feeling when the result of some long-awaited
     * event is finally known. The feelings and thoughts you have at that moment are
     * definitely worth noting down and comparing.
     * Your task is to determine if a person correctly guessed the results of a number of matches.
     * You are given two arrays of scores and guesses of equal length, where each index shows a match.
     * Return an array of the same length denoting how far off each guess was. If they have guessed correctly,
     * the value is 0, and if not, the value is the absolute difference between the guess and the score.
     */
    public static List<Integer> compare(List<Integer> game, List<Integer> guess) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < game.size(); i++) {
            result.add(Math.abs(game.get(i) - guess.get(i)));
        }
        return result;
    }


}