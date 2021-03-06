SET FOREIGN_KEY_CHECKS=0;

-- 用户表
DROP TABLE IF EXISTS ry_user;
CREATE TABLE ry_user (
  userid	VARCHAR(32) NOT NULL COMMENT	'用户ID',
  username	VARCHAR(50) NOT NULL COMMENT	'用户名',
  password	VARCHAR(100) NOT NULL COMMENT	'密码',
  pre_logintime DATETIME DEFAULT NULL COMMENT	'上次登录时间',
  ipadress	VARCHAR(20) DEFAULT NULL COMMENT	'IP地址',
  available	INT(1) DEFAULT 0 NOT NULL COMMENT '可用状态',
  PRIMARY KEY (userid)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户表';

insert into ry_user values(UUID(),'admin','1','2017-3-13','192.168.1.22','1');

-- 角色表
DROP TABLE IF EXISTS ry_role;
CREATE TABLE ry_role (
  roleid	VARCHAR(32) NOT NULL COMMENT	'角色ID',
  rolename	VARCHAR(50) NOT NULL COMMENT	'角色名',
  PRIMARY KEY (roleid)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '角色表';

-- 人员角色表
DROP TABLE IF EXISTS ry_userrole;
CREATE TABLE ry_userrole (
  userid	VARCHAR(32) NOT NULL COMMENT	'用户ID',
  roleid	VARCHAR(32) NOT NULL COMMENT	'角色ID'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户角色表';

-- 权限表
DROP TABLE IF EXISTS ry_permission;
CREATE TABLE ry_permission (
  per_id	VARCHAR(32) NOT NULL COMMENT	'权限ID',
  per_name	VARCHAR(50) DEFAULT NULL COMMENT	'权限名',
  per_sjname	VARCHAR(32) DEFAULT NULL COMMENT	'所属上级权限ID',
  PRIMARY KEY (per_id)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '权限表';

-- 角色权限表
DROP TABLE IF EXISTS ry_roleper;
CREATE TABLE ry_roleper (
  userid	VARCHAR(32) NOT NULL COMMENT	'用户ID',
  roleid	VARCHAR(32) NOT NULL COMMENT	'角色ID'
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '角色权限表';