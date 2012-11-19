package com.example.tes.push;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;

public class Hello extends Activity {
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        ShowToast("Hello Gays");
    }
    private void ShowToast(String pesan){
    	Toast.makeText(Hello.this, pesan, Toast.LENGTH_SHORT).show();
    }
}
