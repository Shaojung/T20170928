package com.example.teacher.t20170928;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("選單1");
        menu.add("選單2");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals("選單1"))
        {
            Toast.makeText(MainActivity.this, "選單一被按下", Toast.LENGTH_LONG).show();
        }
        if (item.getTitle().equals("選單2"))
        {
            Toast.makeText(MainActivity.this, "選單二被按下", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
