package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    0-x;
//    1-O;
//    2-Null;
    int activePlayer = 0;
    int []gameState={2,2,2,2,2,2,2,2,2}

    public void playTap(View view) {
    }
}