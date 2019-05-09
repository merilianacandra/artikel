package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class artikel_detail extends AppCompatActivity {
    private TextView tvtitle, tvdescribtion, tvcategory, tvtgl;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_detail);

        tvtitle = findViewById(R.id.txtittle);
        tvdescribtion = findViewById(R.id.txtDesc);
        tvcategory = findViewById(R.id.txtCat);
        tvtgl = findViewById(R.id.txttgl);
        img = findViewById(R.id.artikelthumbnail);

        //Receive Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Category = intent.getExtras().getString("Category");
        String Tgl = intent.getExtras().getString("Tgl");
        int image = intent.getExtras().getInt("Thumbnail");

        //

        tvtitle.setText(Title);
        tvdescribtion.setText(Description);
        tvcategory.setText(Category);
        tvtgl.setText(Tgl);
        img.setImageResource(image);

    }
}
