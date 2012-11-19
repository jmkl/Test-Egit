package com.example.tes.push;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Hello extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
}
