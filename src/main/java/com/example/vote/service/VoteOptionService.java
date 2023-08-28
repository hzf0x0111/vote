package com.example.vote.service;

import com.example.vote.dao.dto.VoteOptionDto;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
public interface VoteOptionService {
    List<VoteOptionDto> queryOptionsByProjectId(Integer projectId);
}
