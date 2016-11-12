package com.example.yongjin.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title"; //그냥 유니크하게 만들면됨

    public static final String EXERCISE_WEIGHT = "Weight Lifting";
    public static final String EXCERCISE_YOGA = "Yoga";
    public static final String EXCERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.YogaBtn);
        RelativeLayout cardBtn = (RelativeLayout) findViewById(R.id.CardBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localDetailActivity(MainActivity.EXERCISE_WEIGHT);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localDetailActivity(MainActivity.EXCERCISE_YOGA);
            }
        });

        cardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localDetailActivity(MainActivity.EXCERCISE_CARDIO);
            }
        });
    }

    private void localDetailActivity(String exerciseTitle) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);

    }
}
