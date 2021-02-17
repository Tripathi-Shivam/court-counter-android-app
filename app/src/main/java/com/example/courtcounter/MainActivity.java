package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    public void displayForTeamA(int score){
        TextView tv =(TextView) findViewById(R.id.team_a_throw);
        tv.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }
    public void addOneForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamB(int score){
        TextView tv =(TextView) findViewById(R.id.team_b_throw);
        tv.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);
    }
    public void addTwoForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }
    public void addOneForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    public void resetScore(View v){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
}