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
public class VoteProjectDto {

    Integer id;

    String title;

    Timestamp startTime;

    Timestamp endTime;

}
