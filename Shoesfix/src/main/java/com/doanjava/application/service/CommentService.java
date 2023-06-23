package com.doanjava.application.service;

import com.doanjava.application.entity.Comment;
import com.doanjava.application.model.request.CreateCommentPostRequest;
import com.doanjava.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest, long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
