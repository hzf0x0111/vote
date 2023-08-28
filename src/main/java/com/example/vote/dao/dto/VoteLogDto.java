package com.example.vote.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
/*
    author：chenyao
    time: 2023/8/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteLogDto {
    int id;
    int projectId;
    int optionId;
    String userName;
    Timestamp voteTime;
}
