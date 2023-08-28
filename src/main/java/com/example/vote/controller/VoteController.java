package com.example.vote.controller;

import com.example.vote.dao.dto.VoteLogDto;
import com.example.vote.dao.dto.VoteOptionDto;
import com.example.vote.dao.dto.VoteProjectDto;

import com.example.vote.dao.req.InsertProjectReq;
import com.example.vote.service.VoteLogService;
import com.example.vote.service.VoteOptionService;
import com.example.vote.service.VoteProjectService;
import com.example.vote.utils.RespCode;
import com.example.vote.utils.RespVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    author：chenyao
    time: 2023/8/28
 */
@RestController
@RequestMapping("/vote")
public class VoteController {
    @Autowired
    private VoteProjectService voteProjectService;

    @Autowired
    private VoteOptionService voteOptionService;

    @Autowired
    private VoteLogService voteLogService;
    @PostMapping("/queryAllProjects")
    public RespVo queryAllProjects() {
        List<VoteProjectDto> voteProjectDtoList = voteProjectService.queryAllProjects();
        return new RespVo(RespCode.Success.getCode(), RespCode.Success.getDesc(), voteProjectDtoList);
    }

//  requestbody example: {"projectInfo":{"title":"测试222"},"options":[{"optionName":"222_1"},{"optionName":"222_2"}]}
    @PostMapping("/insertProject")
    public RespVo insertProject(@RequestBody InsertProjectReq insertProjectReq) {
        voteProjectService.insertProject(insertProjectReq);
        return new RespVo(RespCode.Success.getCode(), RespCode.Success.getDesc(), null);
    }

    @PostMapping("/queryOptionsByProjectId")
    public RespVo queryOptionsByProjectId(@RequestParam Integer projectId) {
        List<VoteOptionDto> voteOptionDtoList = voteOptionService.queryOptionsByProjectId(projectId);
        return new RespVo(RespCode.Success.getCode(), RespCode.Success.getDesc(), voteOptionDtoList);
    }

    @PostMapping("/queryAllLogsByProjectId")
    public RespVo queryAllLogsByProjectId(@RequestParam Integer projectId) {
        List<VoteLogDto> voteLogDtoList = voteLogService.queryAllLogsByProjectId(projectId);
        return new RespVo(RespCode.Success.getCode(), RespCode.Success.getDesc(), voteLogDtoList);
    }

    @PostMapping("/insertVoteLog")
    public RespVo insertVoteLog(@RequestBody VoteLogDto voteLogDto) {
        voteLogService.insertVoteLog(voteLogDto);
        return new RespVo(RespCode.Success.getCode(), RespCode.Success.getDesc(), null);
    }

}
