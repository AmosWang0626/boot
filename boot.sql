-- ----------------------------
-- 创建数据库并设置字符集
-- ----------------------------
CREATE DATABASE boot CHARACTER SET utf8 COLLATE utf8_general_ci;;

-- ----------------------------
-- 选中boot数据库
-- ----------------------------
USE boot;

-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 以下分别对应不同分支的SQL !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

-- --------------------------------------------------------------------------------------------------------------------------------------------
-- ********************************************************************************************************************************************
-------------***  分支 MASTER SQL   ***-----------------
-------------*** 功能：基础boot功能 ***-----------------

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `NAME` varchar(128) DEFAULT NULL COMMENT '用户名',
  `AGE` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `PHONE_NO` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '地址',
  `IDENTITY_NO` varchar(18) DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

INSERT INTO `user` VALUES ('1', '啦啦啦', '18', '18937128888', '上海市黄浦区西藏南路', '411388199909299999');

-- ********************************************************************************************************************************************
-- --------------------------------------------------------------------------------------------------------------------------------------------
-- ********************************************************************************************************************************************
-------------***   分支 DEVELOP-PAGE SQL    ***-----------------
-------------***   功能：增加分页实现       ***-----------------

DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `APPLY_NO` varchar(128) NOT NULL COMMENT '订单编号',
  `USER_ID` varchar(64) NOT NULL COMMENT '用户编号',
  `APPLY_AMT` decimal(18,2) DEFAULT NULL COMMENT '交易金额',
  `APPLY_TIME` datetime DEFAULT NULL COMMENT '交易时间',
  `APPLY_TYPE` varchar(20) DEFAULT NULL COMMENT '订单类型',
  `APPLY_STATUS` varchar(20) DEFAULT NULL COMMENT '订单状态',
  `REASON` varchar(200) DEFAULT NULL COMMENT '订单备注',
  `IP` varchar(64) DEFAULT NULL COMMENT 'IP',
  `CITY` varchar(64) DEFAULT NULL COMMENT '交易城市',
  `LOCATION` varchar(200) DEFAULT NULL COMMENT '交易详细地址',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`),
  KEY `inx_apply_no` (`APPLY_NO`),
  KEY `inx_user_id` (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `USER_ID` varchar(64) NOT NULL COMMENT '用户编号',
  `NAME` varchar(128) DEFAULT NULL COMMENT '用户名',
  `AGE` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `PHONE_NO` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '地址',
  `IDENTITY_NO` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`),
  KEY `INX_USER_ID` (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 插入数据只需要执行项目中的测试方法即可
-- ********************************************************************************************************************************************
-- --------------------------------------------------------------------------------------------------------------------------------------------