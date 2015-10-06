package com.example.fan.bookweb.network;

import android.support.v7.app.ActionBarActivity;

import com.octo.android.robospice.SpiceManager;

/**
 * Created by FAN on 2015-09-09.
 */
public class InternetActivity extends ActionBarActivity {
	protected SpiceManager spiceManager = new SpiceManager(APIService.class);


	@Override
	protected void onStart() {
		super.onStart();
		spiceManager.start(this);
	}

	@Override
	protected void onStop() {
		spiceManager.shouldStop();
		super.onStop();
	}

}
