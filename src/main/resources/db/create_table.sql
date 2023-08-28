create schema if not exists mysql;
create table if not exists vote.t_vote_project
(
    id         int          not null auto_increment comment '主键',
    title      varchar(255) null comment '投票标题',
    start_time timestamp     null comment '开始时间',
    end_time   timestamp     null comment '结束时间',
    constraint t_vote_project_id_pk
        primary key (id)
);
create table if not exists vote.t_vote_options
(
    id          int          not null auto_increment comment '选项主键',
    project_id  int          null comment '项目id',
    option_name varchar(255) null comment '选项名称',
    constraint t_vote_options_id_pk
        primary key (id),
    constraint t_vote_options_t_vote_project_null_fk
        foreign key (project_id) references vote.t_vote_project (id)
);
create table if not exists vote.t_vote_log
(
    id         int          not null auto_increment comment '主键',
    user_name  varchar(255) null comment '用户名',
    project_id int          null comment '项目id',
    option_id  int          null comment '选项id',
    vote_time  timestamp     null comment '投票时间',
    constraint t_vote_log_id_pk
        primary key (id),
    constraint `unique user`
        unique (user_name, project_id),
    constraint t_vote_log_t_vote_options_null_fk
        foreign key (option_id) references vote.t_vote_options (id),
    constraint t_vote_log_t_vote_project_null_fk
        foreign key (project_id) references vote.t_vote_project (id)
);