package com.plavsic.instagram.post.dto.comment;

import java.time.LocalDateTime;

public record CreatedCommentResponse(Long id, LocalDateTime createdAt) {
}
