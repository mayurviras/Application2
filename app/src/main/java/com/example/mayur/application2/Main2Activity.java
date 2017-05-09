package com.example.mayur.application2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void method(View view)
    {
        startActivity(new Intent(this,Main2Activity.class));
    }
    private void method1()
    {
      startActivity(new Intent(this,Main2Activity.class));
        Toast.makeText(this,"add Toast",Toast.LENGTH_LONG).show();
    }


}
