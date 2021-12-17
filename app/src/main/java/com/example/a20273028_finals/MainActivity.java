package com.example.a20273028_finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText login_id;
    EditText login_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_id = findViewById(R.id.userid);
        login_pw = findViewById(R.id.userpw);
        button = (Button) findViewById(R.id.xlogin_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                loginCheck(view); }
        });
    }
    public void loginCheck(View view) {
        String id = login_id.getText().toString();
        String pw = login_pw.getText().toString();
        if(id.equals("20273028") && pw.equals("sew123")){
            Toast.makeText(this, id+ "님 로그인에 성공하였습니다.", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "아이디 또는 비밀번호가 잘못 입력 되었습니다.", Toast.LENGTH_LONG).show();
            login_id.setText("");
            login_pw.setText("");
        }
    }
}