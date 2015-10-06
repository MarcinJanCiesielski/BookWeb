package com.example.fan.bookweb.network;

import com.example.fan.bookweb.models.Comment;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by FAN on 2015-09-09.
 */
public interface APIInterface {
	@GET("/comments")
	Comment.List comments();

	@POST("/comments")
	Comment createNewComment(@Body Comment newComment);
}


