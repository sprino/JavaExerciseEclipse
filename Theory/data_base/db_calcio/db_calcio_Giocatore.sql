-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: db_calcio
-- ------------------------------------------------------
-- Server version	8.0.11

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
-- Table structure for table `Giocatore`
--

DROP TABLE IF EXISTS `Giocatore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Giocatore` (
  `Tesserino` varchar(45) NOT NULL,
  `NomeSquadra` varchar(45) NOT NULL,
  `Cognome` varchar(45) NOT NULL,
  `Ruolo` varchar(45) DEFAULT NULL,
  `Numero` int(11) DEFAULT NULL,
  PRIMARY KEY (`Tesserino`),
  KEY `Nome_idx` (`NomeSquadra`),
  CONSTRAINT `fk_Nome` FOREIGN KEY (`NomeSquadra`) REFERENCES `squadra` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Giocatore`
--

LOCK TABLES `Giocatore` WRITE;
/*!40000 ALTER TABLE `Giocatore` DISABLE KEYS */;
INSERT INTO `Giocatore` VALUES ('JV111IT123456789','Juventus','Gianluigi Buffon','Portiere',1),('JV222IT123456789','Juventus','Giorgio Chiellini','Difensore',3),('JV333IT123456789','Juventus','Sami Kedira','Centrocampista',6),('NA000IT123456789','Napoli','Pepe Reina','Portiere',25),('NA111IT123456789','Napoli','Rafael','Portiere',1),('NA222IT123456789','Napoli','Vlad Chiriches','Difensore Centrale',21),('NA333IT123456789','Napoli','Mário Rui','Terzino Sinistro',6),('NA444IT123456789','Napoli','Jorginho','Mediano',8),('NA555IT123456789','Napoli','Marek Hamsik','Centrale',17),('NA666IT123456789','Napoli','Allan','Centrale',5);
/*!40000 ALTER TABLE `Giocatore` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-08 16:16:58
