-- 用户表
CREATE table user(
  id BIGINT PRIMARY KEY COMMENT '主键',
  name VARCHAR(64) DEFAULT '' NOT NULL COMMENT '用户名',
  password VARCHAR(128) DEFAULT '' NOT NULL COMMENT '密码',
  gmt_create DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  gmt_update DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  UNIQUE idx_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4