package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
        String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
        int flag = 0, count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init(); // To Initialize button id
    }
    public void Init(){
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
    }

    public void Check(View view) {
        Button btnCurrent = (Button) view;

        if (btnCurrent.getText().toString().equals("")) {

            count++;

            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {
                btn1 = button1.getText().toString();
                btn2 = button2.getText().toString();
                btn3 = button3.getText().toString();
                btn4 = button4.getText().toString();
                btn5 = button5.getText().toString();
                btn6 = button6.getText().toString();
                btn7 = button7.getText().toString();
                btn8 = button8.getText().toString();
                btn9 = button9.getText().toString();

                if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn1, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn4.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn4, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn7, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn1, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn2, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn3, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn1, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.equals("")) {
                    Toast.makeText(this, "Winner Is : " + btn3, Toast.LENGTH_LONG).show();
                    RestartGame();
                } else if (count == 9) {
                    Toast.makeText(this, "The Game Is Drawn", Toast.LENGTH_LONG).show();
                    RestartGame();
                }
            }
        }
    }
    public void RestartGame(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                button1.setText("");button2.setText("");button3.setText("");
                button4.setText("");button5.setText("");button6.setText("");
                button7.setText("");button8.setText("");button9.setText("");
                flag = 0;
                count = 0;
            }
        },3000);
    }
}