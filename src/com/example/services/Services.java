package com.example.services;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Services extends Activity{
Button buttonStart, buttonStop;
int status = 1;

@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);

	buttonStart = (Button) findViewById(R.id.buttonStart);
	buttonStart.setOnClickListener(new OnClickListener() {         
        @Override
        public void onClick(View view) {
            // TODO Auto-generated method stub
            if(status == 1){
            status=0;
            startService(new Intent(Services.this,MusicService.class));
            }else{
            status=1;
            stopService(new Intent(Services.this,MusicService.class)); 
            } 
        }
	});
	}
}