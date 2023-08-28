package com.example.vote.service.impl;

import com.example.vote.dao.dto.VoteOptionDto;
import com.example.vote.dao.mapper.VoteOptionMapper;
import com.example.vote.service.VoteOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Service
public class VoteOptionServiceImpl implements VoteOptionService {
    @Autowired
    private VoteOptionMapper voteOptionMapper;

    public List<VoteOptionDto> queryOptionsByProjectId(Integer projectId) {
        return voteOptionMapper.queryOptionsByProjectId(projectId);
    }
}
