package com.example.fan.bookweb.network;

import com.example.fan.bookweb.models.Comment;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

/**
 * Created by FAN on 2015-09-21.
 */
public class CreateNewCommentRequest extends RetrofitSpiceRequest<Comment, APIInterface> {
	private Comment newComment;

	public CreateNewCommentRequest(Comment newComment) {
		super(Comment.class, APIInterface.class);
		this.newComment = newComment;
	}

	@Override
	public Comment loadDataFromNetwork() throws Exception {
		return getService().createNewComment(newComment);
	}
}
