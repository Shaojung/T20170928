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
        menu.add(0, 1, 0, "選單一");
        menu.add(0, 2, 0, "選單二");
        return super.onCreateOptionsMenu(menu);
    }

    // abcdabc

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == 1)
        {
            Toast.makeText(MainActivity.this, "選單一被按下", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == 2)
        {
            Toast.makeText(MainActivity.this, "選單二被按下", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
