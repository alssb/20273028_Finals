package com.example.a20273028_finals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;

    ImageView backtabView;

    Button button;

    int imageIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        imageView = findViewById(R.id.xchristmas);
        imageView2 = findViewById(R.id.xmoonstar);
        imageView3 = findViewById(R.id.xpinkblue);
        imageView4 = findViewById(R.id.xchanel);
        imageView5 = findViewById(R.id.xhalloween);

        backtabView = findViewById(R.id.xbacktab);

        button = findViewById(R.id.xbutton1);
        button = findViewById(R.id.xbutton2);
        button = findViewById(R.id.xbutton3);
        button = findViewById(R.id.xbutton4);
        button = findViewById(R.id.xbutton5);

        backtabView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.xrv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        NailDesignAdapter adpater = new NailDesignAdapter();

        adpater.addItem(new NailDesign("① 크리스마스 네일"));
        adpater.addItem(new NailDesign("② 달&별 네일"));
        adpater.addItem(new NailDesign("③ 핑크&블루 네일"));
        adpater.addItem(new NailDesign("④ 힙한 샤넬 네일"));
        adpater.addItem(new NailDesign("⑤ 할로윈 네일"));

        recyclerView.setAdapter(adpater);
    }

    public void onButtonClicked(View view){
        changeImage();
    }
    public void onButtonClicked2(View view){
        changeImage2();
    }
    public void onButtonClicked3(View view){
        changeImage3();
    }
    public void onButtonClicked4(View view){
        changeImage4();
    }
    public void onButtonClicked5(View view){
        changeImage5();
    }

    private void changeImage(){
        imageIndex=0;
        if(imageIndex == 0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
    }
    private void changeImage2(){
        imageIndex=1;
        if(imageIndex == 1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
    }
    private void changeImage3(){
        imageIndex=2;
        if(imageIndex == 2){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
    }
    private void changeImage4(){
        imageIndex=3;
        if(imageIndex == 3){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
    }
    private void changeImage5(){
        imageIndex=4;
        if(imageIndex == 4){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }
    }
}