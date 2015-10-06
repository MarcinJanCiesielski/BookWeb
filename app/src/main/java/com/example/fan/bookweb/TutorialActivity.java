package com.example.fan.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by FAN on 2015-09-06.
 */
public class TutorialActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.example.fan.bookweb.R.layout.activity_tutorial);
	}

	public void onNextClick(View view) {
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
	}
}
