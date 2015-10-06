package com.example.fan.bookweb.network;

import android.support.v4.app.Fragment;

import com.octo.android.robospice.SpiceManager;

/**
 * Created by FAN on 2015-09-09.
 */
public class InternetFragment extends Fragment {

	protected SpiceManager spiceManager = new SpiceManager(APIService.class);


	@Override
	public void onStart() {
		super.onStart();
		spiceManager.start(getActivity());
	}

	@Override
	public void onStop() {
		if (spiceManager.isStarted()) {
			spiceManager.shouldStop();
		}
		super.onStop();
	}
}
