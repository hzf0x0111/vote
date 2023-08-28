package com.example.vote.dao.mapper;


import com.example.vote.dao.dto.VoteOptionDto;
import com.example.vote.dao.dto.VoteProjectDto;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Repository
public interface VoteOptionMapper {
    void insertOptions(List<VoteOptionDto> voteOptionDtoList);

    List<VoteOptionDto> queryOptionsByProjectId(Integer projectId);
}
