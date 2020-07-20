-- MySQL dump 10.13  Distrib 8.0.16, for Linux (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `s_1`
--

DROP TABLE IF EXISTS `s_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `s_1` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `mdtrt_evt_id` varchar(30) DEFAULT NULL COMMENT '就诊事件ID',
  `medcasno` varchar(30) DEFAULT NULL COMMENT '病案号',
  `prfs` varchar(50) DEFAULT NULL COMMENT '职业',
  `addr_prov_admdvs` varchar(6) DEFAULT NULL COMMENT '现住址-省（区、市）行政区划',
  `addr_city_admdvs` varchar(6) DEFAULT NULL COMMENT '现住址-市行政区划',
  `addr_coty_admdvs` varchar(6) DEFAULT NULL COMMENT '现住址-县行政区划',
  `detl_addr` varchar(200) DEFAULT NULL COMMENT '现住址-详细地址',
  `coner_name` varchar(50) DEFAULT NULL COMMENT '联系人姓名',
  `coner_rlts` varchar(20) DEFAULT NULL COMMENT '联系人关系',
  `coner_addr_prov_admdvs` varchar(6) DEFAULT NULL COMMENT '联系人住址-省（区、市）行政区划',
  `coner_addr_city_admdvs` varchar(6) DEFAULT NULL COMMENT '联系人住址-市行政区划',
  `coner_addr_coty_admdvs` varchar(6) DEFAULT NULL COMMENT '联系人住址-县行政区划',
  `coner_detl_addr` varchar(200) DEFAULT NULL COMMENT '联系人住址-详细地址',
  `coner_tel` varchar(20) DEFAULT NULL COMMENT '联系人电话',
  `nwb_adm_type` varchar(3) DEFAULT NULL COMMENT '新生儿入院类型',
  `nwb_bir_wt` decimal(8,2) DEFAULT NULL COMMENT '新生儿出生体重',
  `nwb_adm_wt` decimal(8,2) DEFAULT NULL COMMENT '新生儿入院体重',
  `dias_dept` varchar(50) DEFAULT NULL COMMENT '诊断科别',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_1`
--

LOCK TABLES `s_1` WRITE;
/*!40000 ALTER TABLE `s_1` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-19 20:17:41
