package com.example.vote.service;

import com.example.vote.dao.dto.VoteLogDto;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
public interface VoteLogService {

    void insertVoteLog(VoteLogDto voteLogDto);

    List<VoteLogDto> queryAllLogsByProjectId(Integer projectId);
}
