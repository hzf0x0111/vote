package com.example.vote.service.impl;

import com.example.vote.dao.dto.VoteLogDto;
import com.example.vote.dao.mapper.VoteLogMapper;
import com.example.vote.service.VoteLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Service
public class VoteLogServiceImpl implements VoteLogService {
    @Autowired
    VoteLogMapper voteLogMapper;

    public void insertVoteLog(VoteLogDto voteLogDto){
        voteLogMapper.insertVoteLog(voteLogDto);
    }

    public List<VoteLogDto> queryAllLogsByProjectId(Integer projectId){
        return voteLogMapper.queryAllLogsByProjectId(projectId);
    }
}
