package com.example.vote.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
    author：chenyao
    time: 2023/8/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class VoteOptionDto {
    int id;
    int projectId;
    String optionName;
}
