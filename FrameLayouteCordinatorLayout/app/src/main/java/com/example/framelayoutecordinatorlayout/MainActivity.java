package com.example.framelayoutecordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout FrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout = findViewById(R.id.FrameCarregando);
      /*  FrameLayout.setVisibility(View.GONE);
    }

    public void abrir (View view){
        FrameLayout.setVisibility(view.VISIBLE);
        */


    }
}
