-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: luk_rent
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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_category` varchar(255) NOT NULL,
  `book_format` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `id_book_class` bigint(20) DEFAULT NULL,
  `id_book_properties` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKghaj68ib23db6bq72p059t6qg` (`id_book_class`),
  KEY `FKs47kk8o5fncv4j7r86gv1v75e` (`id_book_properties`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_class`
--

DROP TABLE IF EXISTS `book_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_class`
--

LOCK TABLES `book_class` WRITE;
/*!40000 ALTER TABLE `book_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_properties`
--

DROP TABLE IF EXISTS `book_properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book_properties` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(255) NOT NULL,
  `author_surname` varchar(255) NOT NULL,
  `production_year` date NOT NULL,
  `publishing_house` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_properties`
--

LOCK TABLES `book_properties` WRITE;
/*!40000 ALTER TABLE `book_properties` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_user`
--

DROP TABLE IF EXISTS `log_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `log_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `id_user` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh1a03w46o0kg4myvmh4o9yqd` (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_user`
--

LOCK TABLES `log_user` WRITE;
/*!40000 ALTER TABLE `log_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `log_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_book`
--

DROP TABLE IF EXISTS `reservation_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservation_book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `reserved_from` datetime NOT NULL,
  `reserved_to` datetime NOT NULL,
  `id_book` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqb13g4n8pwbyvbchpp4s83y4f` (`id_book`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_book`
--

LOCK TABLES `reservation_book` WRITE;
/*!40000 ALTER TABLE `reservation_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-25  9:38:08
