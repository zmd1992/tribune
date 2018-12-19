create database tribune;
use tribune;
select * from user;
create table my_garden(
id int  not null auto_increment primary key comment '主键ID',
content varchar(255) comment '内容',
created_at datetime comment '创建时间',
created_id datetime comment '创建人ID'
);
