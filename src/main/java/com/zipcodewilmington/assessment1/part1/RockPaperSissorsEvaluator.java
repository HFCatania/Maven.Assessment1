package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String result = "";
        if (handSign == ROCK){
            result = PAPER;
        } else if (handSign == PAPER){
            result = SCISSOR;
        } else if (handSign == SCISSOR){
            result = ROCK;
        }
        return result;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result = "";
        if (handSign == ROCK){
            result = SCISSOR;
        } else if (handSign == SCISSOR){
            result = PAPER;
        } else if (handSign == PAPER){
            result = ROCK;
        }
        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String result = "";
        if(handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "paper"){
            result = "paper";
        } else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "scissor"){
            result = "scissor";
        } else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "rock"){
            result = "rock";
        } else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "rock"){
            result = "paper";
        } else if(handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "scissor"){
            result = "rock";
        } else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "paper"){
            result = "scissor";
        }
        return result;
    }
}
