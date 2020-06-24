USE `ssd`;
DROP TABLE IF EXISTS `scheduled_course`;
CREATE TABLE `scheduled_course` (
                              `id` int(11) NOT NULL AUTO_INCREMENT,
                              `name` varchar(30) DEFAULT NULL,
                              `day` int(10) DEFAULT NULL,
                              `classroomID` varchar(10) DEFAULT NULL,
                              `teacher` varchar(10) DEFAULT NULL,
                              `time_num` int(10) DEFAULT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

#
# Data for table "classroom_"
#

INSERT INTO `scheduled_course` VALUES (1,'数据库原理',3,'西1_209','张三',1),(2,'计算机网络',2,'西1_209','张三',2),(3,'软件工程',4,'西2_212','张三',3),(4,'控制原理',2,'东四_209','张三',6),(5,'环境科学',2,'农生环_实验楼','张三',5),(6,'数据库原理',3,'西1_212','李四',1),(7,'数据库原理',3,'西1_215','王五',1),(8,'数据库原理',3,'西1_217','刘六',1);
