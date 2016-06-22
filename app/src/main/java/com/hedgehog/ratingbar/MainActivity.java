package com.hedgehog.ratingbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingbar);
        mRatingBar.setStarEmptyDrawable(getResources().getDrawable(R.mipmap.star_empty));
        mRatingBar.setStarHalfDrawable(getResources().getDrawable(R.mipmap.star_half));
        mRatingBar.setStarFillDrawable(getResources().getDrawable(R.mipmap.star_full));
        mRatingBar.setStarCount(5);
        mRatingBar.setStar(2.5f);
        mRatingBar.halfStar(true);
        mRatingBar.setmClickable(true);
//        mRatingBar.setStarImageSize(30f);
//        mRatingBar.setStarImageWidth(120f);
//        mRatingBar.setStarImageHeight(60f);
//        mRatingBar.setImagePadding(35);
        mRatingBar.setOnRatingChangeListener(
                new RatingBar.OnRatingChangeListener() {
                    @Override
                    public void onRatingChange(float RatingCount) {
                        Toast.makeText(MainActivity.this, "the fill star is" + RatingCount, Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}
