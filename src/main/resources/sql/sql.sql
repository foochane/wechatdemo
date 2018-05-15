create database wechatdemo;

use wechatdemo;

CREATE TABLE `tb_area`(
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) NOT NULL,
  `priority` int(2) NOT NULL DEFAULT '0',
  `create_time` DATETIME DEFAULT NULL,
  `last_edit_time` DATETIME DEFAULT  NULL ,
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `UK_AREA`(`area_name`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;