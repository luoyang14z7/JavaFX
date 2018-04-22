-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: javatest
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bingsha`
--

DROP TABLE IF EXISTS `bingsha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bingsha` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingsha`
--

LOCK TABLES `bingsha` WRITE;
/*!40000 ALTER TABLE `bingsha` DISABLE KEYS */;
INSERT INTO `bingsha` VALUES (1,'抹茶鲜奶思慕雪',13),(2,'可可鲜奶思慕雪',12),(3,'芒果鲜奶思慕雪',12),(4,'红豆鲜奶思慕雪',12),(5,'超级芒果百乐冰',11),(6,'和风抹茶百乐冰',12),(7,'可可牛奶百乐冰',12),(8,'红豆牛奶百乐冰',11);
/*!40000 ALTER TABLE `bingsha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kafei`
--

DROP TABLE IF EXISTS `kafei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kafei` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kafei`
--

LOCK TABLES `kafei` WRITE;
/*!40000 ALTER TABLE `kafei` DISABLE KEYS */;
INSERT INTO `kafei` VALUES (1,'努瓦拉红茶拿铁',13),(2,'和风抹茶拿铁',15),(3,'可可芭蕾拿铁',15),(4,'现磨咖啡拿铁',15),(5,'特调现磨咖啡',10),(6,'特调云朵咖啡',14),(7,'经典美式咖啡',12);
/*!40000 ALTER TABLE `kafei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kucun`
--

DROP TABLE IF EXISTS `kucun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kucun` (
  `name` varchar(20) DEFAULT NULL,
  `num` int(10) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kucun`
--

LOCK TABLES `kucun` WRITE;
/*!40000 ALTER TABLE `kucun` DISABLE KEYS */;
INSERT INTO `kucun` VALUES ('波霸',1,'2018-03-15 03:33:10',1),('芝士',2,'2018-03-15 03:33:10',2),('努瓦拉红茶',22,'2018-03-15 03:33:10',3),('四季春茶',7,'2018-03-15 03:33:10',4),('柠檬',12,'2018-03-15 03:33:10',5),('金桔',11,'2018-03-15 03:33:10',6),('牛奶',1,'2018-03-15 03:33:10',7),('红豆',1,'2018-03-15 03:33:10',8),('果糖',1,'2018-03-15 03:33:10',9);
/*!40000 ALTER TABLE `kucun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naicha`
--

DROP TABLE IF EXISTS `naicha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `naicha` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naicha`
--

LOCK TABLES `naicha` WRITE;
/*!40000 ALTER TABLE `naicha` DISABLE KEYS */;
INSERT INTO `naicha` VALUES (1,'努瓦拉醇香奶茶',9),(2,'四季春奶绿',9),(3,'黄金波霸奶茶',9),(4,'红豆乌龙奶茶',9),(5,'招牌小芋圆奶茶',9),(6,'海盐芝士奶茶',12),(7,'全套奶茶',9),(8,'红豆奶茶',9),(9,'椰果奶茶',9),(10,'布丁奶茶',9);
/*!40000 ALTER TABLE `naicha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `naishuang`
--

DROP TABLE IF EXISTS `naishuang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `naishuang` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `naishuang`
--

LOCK TABLES `naishuang` WRITE;
/*!40000 ALTER TABLE `naishuang` DISABLE KEYS */;
INSERT INTO `naishuang` VALUES (1,'芝士·白桃乌龙',15),(2,'芝士·和风抹茶',14),(3,'芝士·轻乌龙',14),(4,'芝士·茉莉绿妍',14),(5,'芝士·四季春',13),(6,'芝士·荔枝乌龙',14),(7,'芝士·醇香可可',14),(8,'1/2の诱惑',20);
/*!40000 ALTER TABLE `naishuang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoporder`
--

DROP TABLE IF EXISTS `shoporder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoporder` (
  `oid` int(20) NOT NULL AUTO_INCREMENT,
  `opayname` varchar(100) DEFAULT NULL,
  `opre` int(20) DEFAULT NULL,
  `opaydate` date DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoporder`
--

LOCK TABLES `shoporder` WRITE;
/*!40000 ALTER TABLE `shoporder` DISABLE KEYS */;
INSERT INTO `shoporder` VALUES (1,'赠饮',0,'2018-03-07'),(2,'微信付款',30,'2018-03-14'),(3,'微信付款',90,'2018-03-14'),(4,'微信付款',42,'2018-03-15'),(5,'支付宝付款',14,'2018-03-15'),(6,'大众点评',20,'2018-03-15'),(7,'美团',34,'2018-03-15'),(8,'团购',34,'2018-03-15'),(9,'团购',24,'2018-03-15'),(10,'支付宝付款',47,'2018-03-15'),(11,'现金付款',30,'2018-03-15'),(12,'现金付款',15,'2018-03-15'),(13,'支付宝付款',30,'2018-03-15'),(14,'支付宝付款',18,'2018-03-15'),(15,'现金付款',105,'2018-03-15'),(16,'大众点评',84,'2018-03-15'),(17,'团购',124,'2018-03-15'),(18,'大众点评',107,'2018-03-15'),(19,'微信付款',95,'2018-03-15'),(20,'支付宝付款',99,'2018-03-15');
/*!40000 ALTER TABLE `shoporder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoporderlist`
--

DROP TABLE IF EXISTS `shoporderlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoporderlist` (
  `oshopname` varchar(100) DEFAULT NULL,
  `oshopnum` int(10) DEFAULT NULL,
  `oshopdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoporderlist`
--

LOCK TABLES `shoporderlist` WRITE;
/*!40000 ALTER TABLE `shoporderlist` DISABLE KEYS */;
INSERT INTO `shoporderlist` VALUES ('芝士·和风抹茶',1,'2018-03-07'),('海盐芝士奶茶',1,'2018-03-07'),('黄桃班戟',1,'2018-03-07'),('芝士·白桃乌龙',1,'2018-03-14'),('多芒小丸子',1,'2018-03-14'),('芝士·和风抹茶',1,'2018-03-15'),('芝士·荔枝乌龙',1,'2018-03-15'),('芝士·轻乌龙',1,'2018-03-15'),('芝士·荔枝乌龙',1,'2018-03-15'),('1/2の诱惑',1,'2018-03-15'),('芝士·茉莉绿妍',1,'2018-03-15'),('1/2の诱惑',1,'2018-03-15'),('1/2の诱惑',1,'2018-03-15'),('芝士·醇香可可',1,'2018-03-15'),('红豆鲜奶思慕雪',1,'2018-03-15'),('芒果鲜奶思慕雪',1,'2018-03-15'),('红豆牛奶百乐冰',1,'2018-03-15'),('可可鲜奶思慕雪',1,'2018-03-15'),('冰柠檬·红茶',1,'2018-03-15'),('金桔柠檬水果茶',1,'2018-03-15'),('波霸轻乌龙',1,'2018-03-15'),('冰柠檬·红茶',1,'2018-03-15'),('鲜桔柠檬汁',1,'2018-03-15'),('芝士·白桃乌龙',1,'2018-03-15'),('芝士·白桃乌龙',1,'2018-03-15'),('芝士·白桃乌龙',1,'2018-03-15'),('努瓦拉醇香奶茶',1,'2018-03-15'),('努瓦拉醇香奶茶',1,'2018-03-15'),('努瓦拉醇香奶茶',1,'2018-03-15'),('海盐芝士奶茶',1,'2018-03-15'),('四季春奶绿',1,'2018-03-15'),('黄金波霸奶茶',1,'2018-03-15'),('全套奶茶',1,'2018-03-15'),('红豆奶茶',1,'2018-03-15'),('红豆乌龙奶茶',1,'2018-03-15'),('布丁奶茶',1,'2018-03-15'),('海盐芝士奶茶',1,'2018-03-15'),('招牌小芋圆奶茶',1,'2018-03-15'),('椰果奶茶',1,'2018-03-15'),('红豆奶茶',1,'2018-03-15'),('布丁奶茶',1,'2018-03-15'),('海盐芝士奶茶',1,'2018-03-15'),('全套奶茶',1,'2018-03-15'),('红豆乌龙奶茶',1,'2018-03-15'),('黄金波霸奶茶',1,'2018-03-15'),('四季春奶绿',1,'2018-03-15'),('招牌小芋圆奶茶',1,'2018-03-15'),('椰果奶茶',1,'2018-03-15'),('鲜桔柠檬汁',1,'2018-03-15'),('冰柠檬·红茶',1,'2018-03-15'),('冰柠檬·四季春',1,'2018-03-15'),('波霸轻乌龙',1,'2018-03-15'),('蜂蜜柚子水果茶',1,'2018-03-15'),('桃乐柚柚水果茶',1,'2018-03-15'),('金桔柠檬水果茶',1,'2018-03-15'),('百香凤梨水果茶',1,'2018-03-15'),('鲜榨一颗柠檬',1,'2018-03-15'),('满满红柚四季春',1,'2018-03-15'),('和风抹茶拿铁',1,'2018-03-15'),('可可芭蕾拿铁',1,'2018-03-15'),('现磨咖啡拿铁',1,'2018-03-15'),('经典美式咖啡',1,'2018-03-15'),('特调云朵咖啡',1,'2018-03-15'),('努瓦拉红茶拿铁',1,'2018-03-15'),('特调现磨咖啡',1,'2018-03-15'),('努瓦拉红茶拿铁',1,'2018-03-15'),('抹茶鲜奶思慕雪',1,'2018-03-15'),('可可鲜奶思慕雪',1,'2018-03-15'),('芒果鲜奶思慕雪',1,'2018-03-15'),('红豆鲜奶思慕雪',1,'2018-03-15'),('红豆牛奶百乐冰',1,'2018-03-15'),('可可牛奶百乐冰',1,'2018-03-15'),('和风抹茶百乐冰',1,'2018-03-15'),('超级芒果百乐冰',1,'2018-03-15'),('杨枝甘露',1,'2018-03-15'),('多芒小丸子',1,'2018-03-15'),('榴莲巧克力千层',1,'2018-03-15'),('多芒红豆捞',1,'2018-03-15'),('榴莲蜜月',1,'2018-03-15'),('黄桃班戟',1,'2018-03-15');
/*!40000 ALTER TABLE `shoporderlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shuiguo`
--

DROP TABLE IF EXISTS `shuiguo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shuiguo` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shuiguo`
--

LOCK TABLES `shuiguo` WRITE;
/*!40000 ALTER TABLE `shuiguo` DISABLE KEYS */;
INSERT INTO `shuiguo` VALUES (1,'鲜桔柠檬汁',9),(2,'冰柠檬·红茶',11),(3,'冰柠檬·四季春',11),(4,'波霸轻乌龙',10),(5,'百香凤梨水果茶',14),(6,'金桔柠檬水果茶',13),(7,'桃乐柚柚水果茶',14),(8,'蜂蜜柚子水果茶',13),(9,'鲜榨一颗柠檬',14),(10,'满满红柚四季春',15);
/*!40000 ALTER TABLE `shuiguo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tianpin`
--

DROP TABLE IF EXISTS `tianpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tianpin` (
  `shopid` int(11) DEFAULT NULL,
  `shopname` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tianpin`
--

LOCK TABLES `tianpin` WRITE;
/*!40000 ALTER TABLE `tianpin` DISABLE KEYS */;
INSERT INTO `tianpin` VALUES (1,'杨枝甘露',15),(2,'多芒小丸子',15),(3,'多芒红豆捞',12),(4,'榴莲蜜月',19),(5,'黄桃班戟',10),(6,'榴莲巧克力千层',28);
/*!40000 ALTER TABLE `tianpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `job` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin','123','店长',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 11:40:05
