package com.example.newsaggregator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

    String title, content, desc, image, url;
    private TextView titleTV, contentTV, subtitleTV;
    private ImageView newsIV;
    private Button ReadNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        title = getIntent().getStringExtra("title");
        content = getIntent().getStringExtra("content");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");
        titleTV = findViewById(R.id.TVtitle);
        contentTV = findViewById(R.id.TVcontent);
        subtitleTV = findViewById(R.id.TVsubtitle);
        newsIV = findViewById(R.id.IVNews);
        ReadNews = findViewById(R.id.ReadNews);
        titleTV.setText(title);
        subtitleTV.setText(desc);
        contentTV.setText(content);
        Picasso.get().load(image).into(newsIV);
        ReadNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        };
    }
