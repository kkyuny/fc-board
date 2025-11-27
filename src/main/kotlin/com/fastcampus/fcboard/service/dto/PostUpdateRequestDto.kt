package com.fastcampus.fcboard.service.dto

import com.fastcampus.fcboard.domain.Post

data class PostUpdateRequestDto(
    val title: String,
    val content: String,
    val updatedBy: String,
)
