package com.example.drawingapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DrawingView drawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = findViewById(R.id.drawingView);
    }

    public void redColor(View view) {
        drawingView.setColor(Color.RED);
    }

    public void greenColor(View view) {
        drawingView.setColor(Color.GREEN);
    }

    public void blueColor(View view) {
        drawingView.setColor(Color.BLUE);
    }

    public void clearCanvas(View view) {
        drawingView.clearCanvas();
    }

    public void undo(View view) {
        drawingView.undo();
    }
}
