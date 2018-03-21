package com.example.android.settlersofcatan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGreen = 0;
    int scorePurple = 0;
    int scoreRed = 0;
    int scoreBlue = 0;

    TextView green_score;
    TextView purple_score;
    TextView red_score;
    TextView blue_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        green_score = findViewById(R.id.green_score);
        purple_score = findViewById(R.id.purple_score);
        red_score = findViewById(R.id.red_score);
        blue_score = findViewById(R.id.blue_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("someVarA", scoreGreen);
        outState.putInt("someVarB", scorePurple);
        outState.putInt("someVarC", scoreRed);
        outState.putInt("someVarD", scoreBlue);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreGreen = savedInstanceState.getInt("someVarA");
        scorePurple = savedInstanceState.getInt("someVarB");
        scoreRed = savedInstanceState.getInt("someVarC");
        scoreBlue = savedInstanceState.getInt("someVarD");
        displayForGreen(scoreGreen);
        displayForPurple(scorePurple);
        displayForRed(scoreRed);
        displayForBlue(scoreBlue);
    }


    /**
     * Adds 1 settlement point for Green.
     */

    public void addOneSettlementForGreen(View v) {
        scoreGreen = scoreGreen + 1;
        displayForGreen(scoreGreen);
    }

    /**
     * Adds 2 city points for Green.
     */

    public void addTwoCityForGreen(View v) {
        scoreGreen = scoreGreen + 2;
        displayForGreen(scoreGreen);
    }

    /**
     * Adds 1 VP point for Green.
     */

    public void addOneVPForGreen(View v) {
        scoreGreen = scoreGreen + 1;
        displayForGreen(scoreGreen);
    }

    /**
     * Adds 1 largest army or road point for Green.
     */

    public void addOneArmyOrRoadForGreen(View v) {
        scoreGreen = scoreGreen + 1;
        displayForGreen(scoreGreen);
    }

    /**
     * Minus 1 largest army or road point for Green.
     */

    public void minusOneArmyOrRoadForGreen(View v) {
        scoreGreen = scoreGreen - 1;
        displayForGreen(scoreGreen);
    }


    /**
     * Adds 1 settlement points for Purple.
     */

    public void addOneSettlementForPurple(View v) {
        scorePurple = scorePurple + 1;
        displayForPurple(scorePurple);
    }

    /**
     * Adds 2 city points for Purple.
     */

    public void addTwoCityForPurple(View v) {
        scorePurple = scorePurple + 2;
        displayForPurple(scorePurple);
    }

    /**
     * Adds 1 VP point for Purple.
     */

    public void addOneVPForPurple(View v) {
        scorePurple = scorePurple + 1;
        displayForPurple(scorePurple);
    }

    /**
     * Adds 1 largest army or road point for Purple.
     */

    public void addOneArmyOrRoadForPurple(View v) {
        scorePurple = scorePurple + 1;
        displayForPurple(scorePurple);
    }

    /**
     * Minus 1 largest army or road point for Purple.
     */

    public void minusOneArmyOrRoadForPurple(View v) {
        scorePurple = scorePurple - 1;
        displayForPurple(scorePurple);
    }

    /**
     * Adds 1 settlement points for Red.
     */

    public void addOneSettlementForRed(View v) {
        scoreRed = scoreRed + 1;
        displayForRed(scoreRed);
    }

    /**
     * Adds 2 city points for Red.
     */

    public void addTwoCityForRed(View v) {
        scoreRed = scoreRed + 2;
        displayForRed(scoreRed);
    }

    /**
     * Adds 1 VP point for Red.
     */

    public void addOneVPForRed(View v) {
        scoreRed = scoreRed + 1;
        displayForRed(scoreRed);
    }

    /**
     * Adds 1 largest army or road point for Red.
     */

    public void addOneArmyOrRoadForRed(View v) {
        scoreRed = scoreRed + 1;
        displayForRed(scoreRed);
    }

    /**
     * Minus 1 largest army or road point for Red.
     */

    public void minusOneArmyOrRoadForRed(View v) {
        scoreRed = scoreRed - 1;
        displayForRed(scoreRed);
    }

    /**
     * Adds 1 settlement points for Blue.
     */

    public void addOneSettlementForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 2 city points for Blue.
     */

    public void addTwoCityForBlue(View v) {
        scoreBlue = scoreBlue + 2;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 1 VP point for Blue.
     */

    public void addOneVPForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 1 largest army or road point for Blue.
     */

    public void addOneArmyOrRoadForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Minus 1 largest army or road point for Blue.
     */

    public void minusOneArmyOrRoadForBlue(View v) {
        scoreBlue = scoreBlue - 1;
        displayForBlue(scoreBlue);
    }

    public void resetScore(View v) {
        scoreGreen = 0;
        scorePurple = 0;
        scoreRed = 0;
        scoreBlue = 0;
        displayForGreen(scoreGreen);
        displayForPurple(scorePurple);
        displayForRed(scoreRed);
        displayForBlue(scoreBlue);
    }

    /**
     * Displays the given score for Green.
     */
    public void displayForGreen(int score) {
        green_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Purple.
     */
    public void displayForPurple(int score) {
        purple_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Red.
     */
    public void displayForRed(int score) {
        red_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Blue.
     */
    public void displayForBlue(int score) {
        blue_score.setText(String.valueOf(score));
    }

}
