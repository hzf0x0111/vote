package com.example.vote.dao.mapper;

import com.example.vote.dao.dto.VoteLogDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    author：chenyao
    time: 2023/8/28
 */
@Repository
public interface VoteLogMapper {
    void insertVoteLog(VoteLogDto voteLogDto);

    List<VoteLogDto> queryAllLogsByProjectId(Integer projectId);
}
