CREATE DATABASE  IF NOT EXISTS `inventorysystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `inventorysystem`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: inventorysystem
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `airconditioner`
--

DROP TABLE IF EXISTS `airconditioner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `airconditioner` (
  `ItemID` char(5) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `Price` decimal(7,2) DEFAULT NULL,
  `brand` varchar(25) DEFAULT NULL,
  `voltage` int(11) DEFAULT NULL,
  `capacity` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airconditioner`
--

LOCK TABLES `airconditioner` WRITE;
/*!40000 ALTER TABLE `airconditioner` DISABLE KEYS */;
INSERT INTO `airconditioner` VALUES ('AC123','Cooler',50000.00,'Singer Electronis',230,1050.00);
/*!40000 ALTER TABLE `airconditioner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chair`
--

DROP TABLE IF EXISTS `chair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `chair` (
  `ItemId` char(5) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `Value` decimal(7,2) DEFAULT NULL,
  `Material` varchar(25) DEFAULT NULL,
  `Type` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chair`
--

LOCK TABLES `chair` WRITE;
/*!40000 ALTER TABLE `chair` DISABLE KEYS */;
INSERT INTO `chair` VALUES ('CR123','Lecturer chair',5000.00,'Cusion','Rotating');
/*!40000 ALTER TABLE `chair` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `computer`
--

DROP TABLE IF EXISTS `computer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `computer` (
  `ItemID` char(5) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `Price` decimal(8,2) DEFAULT NULL,
  `brand` varchar(25) DEFAULT NULL,
  `voltage` int(11) DEFAULT NULL,
  `processor` varchar(25) DEFAULT NULL,
  `Ram` int(11) DEFAULT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computer`
--

LOCK TABLES `computer` WRITE;
/*!40000 ALTER TABLE `computer` DISABLE KEYS */;
INSERT INTO `computer` VALUES ('PC123','RoG',175000.00,'Asus',230,'Intel i7',16),('PC125','Macbook Air',150000.00,'Apple',230,'Intel i5',12);
/*!40000 ALTER TABLE `computer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabledetails`
--

DROP TABLE IF EXISTS `tabledetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tabledetails` (
  `ItemId` char(5) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `Value` decimal(7,2) DEFAULT NULL,
  `Material` varchar(20) DEFAULT NULL,
  `Drawer` int(11) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabledetails`
--

LOCK TABLES `tabledetails` WRITE;
/*!40000 ALTER TABLE `tabledetails` DISABLE KEYS */;
INSERT INTO `tabledetails` VALUES ('TB123','Lecturer Table',10000.00,'Wood',3);
/*!40000 ALTER TABLE `tabledetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Required user credential for the System
CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON inventorysystem.* TO 'newuser'@'localhost' WITH GRANT OPTION;

-- Dump completed on 2022-03-28 17:38:15
