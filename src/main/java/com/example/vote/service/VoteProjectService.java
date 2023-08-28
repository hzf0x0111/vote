package com.example.vote.service;

import com.example.vote.dao.dto.VoteProjectDto;
import com.example.vote.dao.req.InsertProjectReq;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
public interface VoteProjectService {
    List<VoteProjectDto> queryAllProjects();

    void insertProject(InsertProjectReq insertProjectReq);
}
