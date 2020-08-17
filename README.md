# xcx
1.招聘表

```mysql
create table recruitment(
	z_id int(11) not null auto_increment comment '招聘表主键id',
    z_title varchar(20) not null comment '招聘标题',
    z_type int(11) default null comment '招聘所属类型',
    z_content varchar(20000) default null comment '招聘内容',
    z_time timestamp default CURRENT_TIMESTAMP comment '招聘发布或修改时间',
    z_img varchar(1000) default null comment '招聘图片',
    z_owner int(12) not null default 1 comment '发布者',
    z_status int(2) default 1 comment '招聘状态,0为下线,1为有效',
    z_money double(8,2) not null comment '工资',
    primary key (z_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
-- 修改表名--
rename table recruitment to recruit;
-- 修改 招聘标题字段 -> 工作内容-- 
alter table recruit change z_title z_work_content varchar(500) default null comment '工作内容'; 

-- 修改 招聘内容 -> 岗位要求-- 
alter table recruit change z_content z_work_requirement varchar(50) default null comment '岗位要求'; 

-- 修改 发布者 -> 手机号-- 
alter table recruit change z_owner z_work_phone varchar(12) default null comment '手机号';

-- 修改  工资 -> 薪资-- 
alter table recruit change z_money z_work_salary varchar(20) default null comment '薪资'; 

-- 新增 邮箱字段 --
alter table recruit add column z_work_email varchar(30) default null comment '邮箱';

-- 新增 工作地址字段 --
alter table recruit add column z_work_address varchar(30) default null comment '工作地址';

-- 新增 工作时间字段 --
alter table recruit add column z_work_period varchar(30) default null comment '工作时间';

-- 删除图片地址字段--
alter table recruit drop column z_img;

-- 在test_table 表的 valid_status 字段之后，新增一个字段，设置对应的类型，长度，是否为null，默认值，注释
ALTER TABLE test_table ADD COLUMN `is_staff` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否是从业人员 0否 1是' AFTER `valid_status`;
-- 修改一个字段的类型
ALTER TABLE test_table MODIFY test_value VARCHAR(10) NOT NULL DEFAULT '' COMMENT '字段注释';
 
-- 修改一个字段的名称，此时要重新指定该字段的类型
ALTER TABLE test_table CHANGE test_value_old test_value_new VARCHAR(10) NOT NULL DEFAULT '' COMMENT '字段注释';
-- 删除test_table表的 test_value字段 
ALTER TABLE test_table DROP COLUMN test_value;
```

2.求职表

```mysql
create table job(
	q_id int(11) not null auto_increment comment '求职表主键id',
    q_title varchar(20) not null comment '求职标题',
    q_type int(11)  default null comment '求职所属类型',
    q_content varchar(20000) default null comment '求职内容',
    q_time timestamp default CURRENT_TIMESTAMP comment '求职发布或修改时间',
    q_img varchar(1000) default null comment '求职图片',
    q_owner int(12) not null default 1 comment '发布者',
    q_status int(2) default 1 comment '求职状态,0为下线,1为有效',
    q_money double(8,2) not null comment '工资',
    primary key (q_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
rename table job to find_job;

-- 修改 求职标题 -> 个人才能-- 
alter table find_job change q_title self_ability varchar(200) default null comment '个人才能'; 
-- 修改 求职内容 -> 预期薪资-- 
alter table find_job change q_content expected_salary varchar(30) default null comment '预期薪资'; 
-- 修改 求职图片 -> 邮箱-- 
alter table find_job change q_img self_email varchar(30) default null comment '邮箱'; 
-- 修改 发布者 -> 手机号码-- 
alter table find_job change q_owner self_phone varchar(12) default null comment '手机号码';
-- 修改 工资 -> 姓名-- 
alter table find_job change q_money self_name varchar(12) default null comment '姓名';
-- 新增 学历 --
alter table find_job add column edu_id int(11) default null comment '学历';

```

3.二手信息表

```mysql
 create table second_hand_car(
	car_id int(11) not null auto_increment comment '二手信息主键id',
    car_age varchar(20) not null comment '二手信车龄',
    car_type int(11) default null comment '二手信息所属类型',
    car_kilometre varchar(20) default null comment '二手已开公里数',
    car_phone varchar(20) default null comment '联系电话',
    car_people varchar(20) default null comment '联系人',
    car_time timestamp default CURRENT_TIMESTAMP comment '二手信息发布',
    car_img varchar(1000) default null comment '二手信息图片',
    car_status int(2) default 1 comment '二手信息状态,0为下线,1为有效',
    car_original_price varchar(20)  default null comment '原价',
    car_now_price varchar(20)  default null comment '原价',
    primary key (car_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
```

4.售房表

```mysql
create table second_hand_house(
    h_id int(11) not null auto_increment comment '售房主键id',
    h_address varchar(20) not null comment '房地段',
    h_phone varchar(20) default null comment '联系人手机',
    h_people varchar(20) default null comment '联系人',
    h_content varchar(30) default null comment '房子简介',
    h_time timestamp default CURRENT_TIMESTAMP comment '房发布或修改时间',
    h_img varchar(1000) default null comment '房图片',
    h_status int(2) default 1 comment '寻人启事状态,0为下线,1为有效',
    h_money varchar(10)  default null comment '房价',
    primary key (h_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

```

5.招聘和求职类型表

```mysql
create table work_type(
    work_type_id int(11) not null auto_increment comment '求职招聘类型',
    work_type_value varchar(20) default null comment '类型值',
    primary key(work_type_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
INSERT INTO `work_type` VALUES ('1', '兼职');
INSERT INTO `work_type` VALUES ('2', '文员');
INSERT INTO `work_type` VALUES ('3', '服务人员');
INSERT INTO `work_type` VALUES ('4', '技术人员');
INSERT INTO `work_type` VALUES ('4', '会计');
INSERT INTO `work_type` VALUES ('5', '司机');
INSERT INTO `work_type` VALUES ('6', '其他');
```

6.二手车类型表

```mysql
create table car_type(
    car_type_id int(11) not null auto_increment comment '求职招聘类型',
    car_type_value varchar(20) default null comment '类型值',
    primary key(car_type_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
INSERT INTO `car_type` VALUES ('1', '小轿车');
INSERT INTO `car_type` VALUES ('2', 'SVU');
INSERT INTO `car_type` VALUES ('3', '卡车');
INSERT INTO `car_type` VALUES ('4', '挖掘机');
INSERT INTO `car_type` VALUES ('5', '三轮/摩托/自行车');
INSERT INTO `car_type` VALUES ('6', '其他');
```

7.学历类型表

```mysql
create table education(
    edu_id int(11) not null auto_increment comment '学历类型',
    edu_value varchar(20) default null comment '学历值',
    primary key(edu_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
INSERT INTO `education` VALUES ('1', '博士');
INSERT INTO `education` VALUES ('2', '硕士');
INSERT INTO `education` VALUES ('3', '本科');
INSERT INTO `education` VALUES ('4', '高中');
INSERT INTO `education` VALUES ('5', '其他');
```

8.房子类型表

```mysql
create table house_type(
    hou_id int(11) not null auto_increment comment '房子类型',
    hop_value varchar(20) default null comment '房子值',
    primary key(edu_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;  
INSERT INTO `education` VALUES ('1', '精装');
INSERT INTO `education` VALUES ('2', '毛坯');
INSERT INTO `education` VALUES ('3', '100平以下');
INSERT INTO `education` VALUES ('4', '100-130平');
INSERT INTO `education` VALUES ('5', '130平以上');
```

