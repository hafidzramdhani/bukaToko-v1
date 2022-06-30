package com.splash.sc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashJava extends AppCompatActivity {
	
	ImageView splashAnim;
	LinearLayout linearAnim;
	Animation anim;
	private int waktu_loading = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_layout);
		
		/* Linear Anim */
		linearAnim = findViewById(R.id.splashLayout);
		anim = AnimationUtils.loadAnimation(this,R.anim.fade_in_layout);
		linearAnim.startAnimation(anim);
		/* Logo Anim */
		splashAnim = findViewById(R.id.bukatokoIcon);
		anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
		splashAnim.startAnimation(anim);
		
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent splash = new Intent(SplashJava.this,MainActivity.class);
				startActivity(splash);
				finish();
			}
		}, waktu_loading);
		
	}
}