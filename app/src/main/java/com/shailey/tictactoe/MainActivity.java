package com.shailey.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
// player 1:0 player 2:1 empty :2
int stepCounter = 0;
boolean gameActive=true;
int activePlayer = 0;
int gameState[] = {2,2,2,2,2,2,2,2,2};
int winningPositions[][]={{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6}};

public void dropIn(View view){

    ImageView counter = (ImageView) view;
    int tappedCounter = parseInt(counter.getTag().toString());

    if (gameState[tappedCounter]==2 && gameActive= true){



    }

    gameState[tappedCounter]=activePlayer;
    activePlayer=1;



}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
