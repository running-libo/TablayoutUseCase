package com.example.tablayoutusecase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.tablayoutusecase.defaultuse.MainActivity;
import com.example.tablayoutusecase.setstyle.SetStyleActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void defaultUse(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void fieldvalue(View view){
        startActivity(new Intent(this,SetStyleActivity.class));
    }

}
