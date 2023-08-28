package com.example.vote.dao.mapper;

import com.example.vote.dao.dto.VoteProjectDto;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Repository
public interface VoteProjectMapper {
    List<VoteProjectDto> queryAllProjects();

    void insertProject(VoteProjectDto projectDto);
}
