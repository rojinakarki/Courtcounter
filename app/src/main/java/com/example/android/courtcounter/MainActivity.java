package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView =(TextView)findViewById(R.id.text_scoreTeamA);
        scoreView.setText(String.valueOf((score)));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView =(TextView)findViewById(R.id.text_scoreTeamB);
        scoreView.setText(String.valueOf((score)));
    }

    public void display3PointA(View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void display2PointA(View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void displayFreeThrowA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void display3PointB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void display2PointB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void displayFreeThrowB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
