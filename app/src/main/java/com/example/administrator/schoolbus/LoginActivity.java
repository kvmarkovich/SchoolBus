package com.example.administrator.schoolbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }
//        btn1=(Button)findViewById(R.id.login_btn_login);
//        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
//        btn2=(Button)findViewById(R.id.login_btn_register);
//        btn2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
//                startActivity(intent);
//            }
//        });
//        mChangepwdText = (TextView) findViewById(R.id.login_text_change_pwd);
//        mChangepwdText.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(LoginActivity.this,ResetpwdActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
}