package com.example.vote.dao.req;

import com.example.vote.dao.dto.VoteOptionDto;
import com.example.vote.dao.dto.VoteProjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
/*
    author：chenyao
    time: 2023/8/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertProjectReq {

    VoteProjectDto projectInfo;

    List<VoteOptionDto> options;
}
