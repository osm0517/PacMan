package com.example.pacman_v1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class PlayActivity extends AppCompatActivity {

    int x;
    int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

    }

    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                x = (int) event.getX();
                y = (int) event.getY();
                System.out.print(x);
                System.out.print(',');
                System.out.println(y);
                break;
            case MotionEvent.ACTION_UP:
                //손가락을 화면에서 뗄 때 할 일
                break;
            case MotionEvent.ACTION_CANCEL:
                // 터치가 취소될 때 할 일
                break;
            default:
                break;
        }
        return true;
    }
}