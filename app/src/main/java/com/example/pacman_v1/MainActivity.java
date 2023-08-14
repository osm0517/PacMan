package com.example.pacman_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    findViewById는 이름에서 알 수 있듯이 이름을 사용해서 요소를 가져옴
    
//    R은 android studio에서 resource에 접근하는 클래스
//    ex) R.id -> resource 중에서 id에 접근한다는 말
    Button startButton;
    Button scoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.main_start);
        scoreButton = findViewById(R.id.main_score);

//        화면이 구성되면서 listener를 등록해서 사용할 수 있도록 함.
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);

                startActivity(intent);
            }
        });

        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);

                startActivity(intent);
            }
        });
    }
}