package com.suhun.dbacess0809;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText cname, ctel, cbirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        result = findViewById(R.id.resultLog);
        cname = findViewById(R.id.name);
        ctel = findViewById(R.id.tel);
        cbirthday = findViewById(R.id.birthday);
    }

    public void queryFun(View view){

    }

    public void insertFun(View view){

    }

    public void delFun(View view){

    }
}