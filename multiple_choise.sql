/*
 Navicat Premium Data Transfer

 Source Server         : mrloiho
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : multiple_choise

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 25/04/2020 16:02:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account_admin
-- ----------------------------
DROP TABLE IF EXISTS `account_admin`;
CREATE TABLE `account_admin`  (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_admin
-- ----------------------------
INSERT INTO `account_admin` VALUES (1, 'admin1', '1234');
INSERT INTO `account_admin` VALUES (2, 'admin2', '1234');
INSERT INTO `account_admin` VALUES (3, 'admin3', '1234');

-- ----------------------------
-- Table structure for account_user
-- ----------------------------
DROP TABLE IF EXISTS `account_user`;
CREATE TABLE `account_user`  (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_user
-- ----------------------------
INSERT INTO `account_user` VALUES (1, 'mrloiho', '1234', NULL);
INSERT INTO `account_user` VALUES (2, 'lychonoc', '1234', NULL);
INSERT INTO `account_user` VALUES (3, 'user1', '1234', NULL);
INSERT INTO `account_user` VALUES (4, 'user2', '1234', NULL);
INSERT INTO `account_user` VALUES (5, 'name', 'pass', NULL);
INSERT INTO `account_user` VALUES (6, 'name1', 'pass1', 'email1');
INSERT INTO `account_user` VALUES (7, 'name123', 'pass123', 'email123');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `quantityQuestion` int(15) NULL DEFAULT NULL,
  `idQues` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES (1, 'Kiểm tra 1', 4, '1;2;3;4');
INSERT INTO `exam` VALUES (2, 'Kiểm tra 2', 2, '3;4');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `optionA` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionB` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionC` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `optionD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idQuestion`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES (1, 'Hội Duy Tân do Phan Bội Châu thành lập (1924) chủ trương', 'Thành lập nước Cộng hòa Dân quốc Việt Nam', 'Thiết lập chính thể Cộng hòa Dân chủ', 'Thiết lập chính thể quân chủ lập hiến.', 'Khôi phục chế độ quân chủ chuyên chế.', 'A');
INSERT INTO `question` VALUES (2, 'Hội Duy Tân do Phan Bội Châu thành lập (1924) chủ trương', 'Thành lập nước Cộng hòa Dân quốc Việt Nam', 'Thiết lập chính thể Cộng hòa Dân chủ', 'Thiết lập chính thể quân chủ lập hiến.', 'Khôi phục chế độ quân chủ chuyên chế.', 'B');
INSERT INTO `question` VALUES (3, 'Quốc gia đầu tiên phóng thành công tàu vũ trụ có người lái bay vòng quanh Trái Đất là?', 'Liên Xô', 'Mỹ', 'Việt Nam ', 'Trung Quốc', 'C');
INSERT INTO `question` VALUES (4, 'Đâu là nước 3 lần đánh tan quân Mông Nguyên?', 'Việt Nam', 'Đại Việt', 'Đông Lào', 'Đại Ngu', 'B');

SET FOREIGN_KEY_CHECKS = 1;
