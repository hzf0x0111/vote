package com.example.vote.utils;

import java.io.Serializable;

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
public class RespVo<T> implements Serializable {

    private Integer code;

    private String desc;

    private T msg;
}