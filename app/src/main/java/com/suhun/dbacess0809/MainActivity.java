package com.suhun.dbacess0809;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText cname, ctel, cbirthday;
    private MyDBHelper myDBHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        myDBHelper = new MyDBHelper(this, "suhunDB", null, 1);
        db = myDBHelper.getWritableDatabase();
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