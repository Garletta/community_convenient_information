/*
 Navicat MySQL Data Transfer

 Source Server         : 数据库
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : community-information

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 19/12/2018 10:00:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for resident
-- ----------------------------
DROP TABLE IF EXISTS `resident`;
CREATE TABLE `resident`  (
  `residentId` int(8) NOT NULL,
  `residentName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `residentAddress` varchar(55) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residentTelphone` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`residentId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resident
-- ----------------------------
INSERT INTO `resident` VALUES (1, '王五', '花园小区', 888888);
INSERT INTO `resident` VALUES (2, '李三', '天天小区', 666666);

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source`  (
  `sourceId` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源号',
  `sourceName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `fitNum` int(11) NOT NULL,
  `openTime` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '全天',
  PRIMARY KEY (`sourceId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '社区资源' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES (1, '健身房', 100, '8.00-23.00');
INSERT INTO `source` VALUES (2, '浴室', 50, '13.00-22.00');
INSERT INTO `source` VALUES (3, '网吧', 70, '全天');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` int(8) NOT NULL,
  `userName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `isManager` int(8) NOT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin', 1);
INSERT INTO `user` VALUES (2, 'youke', 'youke', 0);

SET FOREIGN_KEY_CHECKS = 1;
