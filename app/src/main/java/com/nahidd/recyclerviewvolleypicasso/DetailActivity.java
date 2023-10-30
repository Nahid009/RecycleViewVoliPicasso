package com.nahidd.recyclerviewvolleypicasso;

import static com.nahidd.recyclerviewvolleypicasso.MainActivity.EXTRA_CREATOR;
import static com.nahidd.recyclerviewvolleypicasso.MainActivity.EXTRA_LIKES;
import static com.nahidd.recyclerviewvolleypicasso.MainActivity.EXTRA_URL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        String likeCount = intent.getStringExtra(EXTRA_LIKES);

        ImageView imageView = findViewById(R.id.imageViewDetail);
        TextView textViewCreator = findViewById(R.id.textViewCreatorDetail);
        TextView textViewLikes = findViewById(R.id.textViewLikeDetail);


        Picasso.get()
                .load(imageUrl)
                .into(imageView);

        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " +likeCount);

    }
}