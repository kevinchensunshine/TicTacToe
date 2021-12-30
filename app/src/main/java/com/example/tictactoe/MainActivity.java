package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public int[] space = new int[2];
    public String turn;
    private int state;
    private TextView tv1;
    private char[][] board = new char[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button start = findViewById(R.id.start);
        start.setEnabled(false);
        state = 0;
        turn = "X";
        tv1 = (TextView)findViewById(R.id.name);
        tv1.setText("Welcome to Tic Tac Toe! It is Currently X's Turn");
        final Button button = findViewById(R.id.one);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setEnabled(false);
                button.setText(turn);
                space[0] = 0;
                space[1] = 0;
                board[0][0] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button2 = findViewById(R.id.two);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.setEnabled(false);
                button2.setText(turn);
                space[0] = 0;
                space[1] = 1;
                board[0][1] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button3 = findViewById(R.id.three);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button3.setEnabled(false);
                button3.setText(turn);
                space[0] = 0;
                space[1] = 2;
                board[0][2] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button4 = findViewById(R.id.four);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button4.setEnabled(false);
                button4.setText(turn);
                space[0] = 1;
                space[1] = 0;
                board[1][0] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button5 = findViewById(R.id.five);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button5.setEnabled(false);
                button5.setText(turn);
                space[0] = 1;
                space[1] = 1;
                board[1][1] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button6 = findViewById(R.id.six);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button6.setEnabled(false);
                button6.setText(turn);
                space[0] = 1;
                space[1] = 2;
                board[1][2] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button7 = findViewById(R.id.seven);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button7.setEnabled(false);
                button7.setText(turn);
                space[0] = 2;
                space[1] = 0;
                board[2][0] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button8 = findViewById(R.id.eight);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button8.setEnabled(false);
                button8.setText(turn);
                space[0] = 2;
                space[1] = 1;
                board[2][1] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
        final Button button9 = findViewById(R.id.nine);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button9.setEnabled(false);
                button9.setText(turn);
                space[0] = 2;
                space[1] = 2;
                board[2][2] = turn.charAt(0);
                state++;
                if (state % 2 == 0) {
                    tv1.setText("X");
                } else {
                    tv1.setText("O");
                }
                if (hasWon()) {
                    tv1.setText(turn + " Won! Tap anywhere to replay!");
                    startOver();
                }
                currentTurn();
            }
        });
    }
    public boolean hasWon() {
        for (int i = 0; i < 3; i++) {
            if (board[space[0]][i] != turn.charAt(0)) {
                break;
            } else if (i == 2) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[i][space[1]] != turn.charAt(0)) {
                break;
            } else if (i == 2) {
                return true;
            }
        }
        if (space[0] == space[1]) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != turn.charAt(0)) {
                    break;
                } else if (i == 2) {
                    return true;
                }
            }
        }

        if (space[0] + space[1] ==  2){
            for (int i = 0; i < 3; i++) {
                if (board[i][2 - i] != turn.charAt(0)) {
                    break;
                } else if (i == 2) {
                    return true;
                }
            }
        }
        if (state >= 9 || state % 9 == 0) {
            tv1.setText("It is a draw! Tap anywhere to replay!");
        }
        return false;
    }
    public String currentTurn() {
        if (turn.equals("O")) {
            turn = "X";
            return turn;
        } else {
            turn = "O";
            return turn;
        }
    }
    public void startOver() {
        final Button start = findViewById(R.id.start);
        start.setEnabled(true);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                start.setEnabled(false);
                recreate();
            }
        });
    }
}
