# SSMWeb
SSM web site demo (IDEA 2019.2)

Repair some bugs

Original Article:
https://blog.csdn.net/khxu666/article/details/79851070

DataTable:

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 NOT NULL,
  `number` int(11) NOT NULL,
  `detail` varchar(200) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`paper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
