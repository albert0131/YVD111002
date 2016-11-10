package com.example.user.yvd111002;

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

        menu.add("設定");
        menu.add("關於我們");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().toString().equals("設定"))
        {
            Toast.makeText(MainActivity.this, "按下設定", Toast.LENGTH_SHORT).show();
        }
        if (item.getTitle().toString().equals("關於我們"))
        {
            Toast.makeText(MainActivity.this, "按下關於我們", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
