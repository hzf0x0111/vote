package com.example.vote.service.impl;

import com.example.vote.dao.dto.VoteOptionDto;
import com.example.vote.dao.dto.VoteProjectDto;
import com.example.vote.dao.mapper.VoteOptionMapper;
import com.example.vote.dao.mapper.VoteProjectMapper;
import com.example.vote.dao.req.InsertProjectReq;
import com.example.vote.service.VoteProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Service
public class VoteProjectServiceImpl implements VoteProjectService {
    @Autowired
    private VoteProjectMapper voteProjectMapper;
    @Autowired
    private VoteOptionMapper voteOptionMapper;

    public List<VoteProjectDto> queryAllProjects() {
        return voteProjectMapper.queryAllProjects();
    }

    @Transactional
    public void insertProject(InsertProjectReq insertProjectReq) {
        VoteProjectDto projectDto = insertProjectReq.getProjectInfo();
        List<VoteOptionDto> voteOptionDtoList = insertProjectReq.getOptions();
        voteProjectMapper.insertProject(projectDto);
        voteOptionDtoList.forEach(option -> {
            option.setProjectId(projectDto.getId());
        });
        voteOptionMapper.insertOptions(voteOptionDtoList);
    }
}
