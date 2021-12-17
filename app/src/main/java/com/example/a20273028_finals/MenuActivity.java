package com.example.a20273028_finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button = (Button) findViewById(R.id.xlogout);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.xdesign);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });

    }

    public void OnclickedWeb(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://makenail.co.kr/product/list.html?cate_no=74"));
        startActivity(intent);
    }

    public void OnclickedContact(View v)
    {
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3361-9893"));
        startActivity(intent2);
    }
}