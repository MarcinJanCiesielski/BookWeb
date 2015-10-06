package com.example.fan.bookweb.network;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

/**
 * Created by FAN on 2015-09-09.
 */
public class APIService extends RetrofitGsonSpiceService {

	private final static String BASE_URL = "http://bookweb.ciolek.info/api/v1";

	@Override
	public void onCreate() {
		super.onCreate();
		addRetrofitInterface(APIInterface.class);
	}

	@Override
	protected String getServerUrl() {
		return BASE_URL;
	}

}

