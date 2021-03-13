package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SaveInfo;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public EditText uername;
    public EditText password;
    public EditText password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        uername = (EditText) findViewById(R.id.editTextTextPersonName2);//获得信息//
        password=(EditText) findViewById(R.id.editTextTextPassword);
        password2=(EditText) findViewById(R.id.editTextTextPassword2);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        button2.setOnClickListener(new Registerbutton());
        button3.setOnClickListener(new Registerbutton());
    }
    public class Registerbutton implements View.OnClickListener{
        public void onClick(View v){
            String name=uername.getText().toString().trim();//将信息化为string类型//
            String pass=password.getText().toString().trim();
            String passlength[]=pass.split("");//用于判断密码长度//
            String pass2=password2.getText().toString().trim();
            switch (v.getId()){
                case R.id.button2://判断能否注册 信息输入格式//
                    if(name.toString().equals("")||pass.toString().equals("")){
                        Toast.makeText(MainActivity2.this,"各项不能为空",Toast.LENGTH_LONG).show();
                    }
                    else if (passlength.length<6){
                        Toast.makeText(MainActivity2.this,"密码过短，请重新输入",Toast.LENGTH_LONG).show();
                    }
                    else{
                        if(pass.toString().equals(pass2)){
                            Toast.makeText(MainActivity2.this,"注册成功，请返回登录",Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(MainActivity2.this,"两次输入密码不一致",Toast.LENGTH_LONG).show();
                        }
                    }
                    break;
                case R.id.button3://返回登录界面//
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}