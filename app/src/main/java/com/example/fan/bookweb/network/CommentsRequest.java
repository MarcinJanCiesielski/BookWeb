package com.example.fan.bookweb.network;

import com.example.fan.bookweb.models.Comment;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

/**
 * Created by FAN on 2015-09-09.
 */
public class CommentsRequest extends RetrofitSpiceRequest<Comment.List,APIInterface> {

	public CommentsRequest() {
		super(Comment.List.class, APIInterface.class);
	}

	@Override
	public Comment.List loadDataFromNetwork() throws Exception {
		return getService().comments();
	}
}
