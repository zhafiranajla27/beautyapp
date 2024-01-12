package com.example.beautyapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.beautyapp.R

class MainActivity : AppCompatActivity() {
    var Button introBtn;
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var introBtn=findViewById(R.id.introBtn)
         introBtn.setOnClick(View.OnClickLister){
            @Override
            public void setOnClick(View v)
             val setOnClickListener = null
             @Override
            public void OnClickListener(View v){
                startActivity(Intent(MainActivity.this.MainActivity.Class));
            }
             )};
    }
}