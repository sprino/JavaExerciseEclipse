-- MySQL dump 10.13  Distrib 5.7.22, for macos10.13 (x86_64)
--
-- Host: localhost    Database: DB-Impiegati
-- ------------------------------------------------------
-- Server version	5.7.22

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
-- Table structure for table `Dipartimento`
--

DROP TABLE IF EXISTS `Dipartimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Dipartimento` (
  `Nome` varchar(25) NOT NULL,
  `Indirizzo` varchar(25) DEFAULT NULL,
  `Citta` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Nome`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dipartimento`
--

LOCK TABLES `Dipartimento` WRITE;
/*!40000 ALTER TABLE `Dipartimento` DISABLE KEYS */;
INSERT INTO `Dipartimento` VALUES ('Amministrazione','Via Tito Livio','Milano'),('Direzione','Via Tito Livio','Milano'),('Distribuzione','Via Segre','Roma'),('Produzione','Piazza Lavater','Torino'),('Ricerca','Via Morone','Milano'),('Sviluppo','Via Roma','Napoli');
/*!40000 ALTER TABLE `Dipartimento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Impiegato`
--

DROP TABLE IF EXISTS `Impiegato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Impiegato` (
  `ID_Imp` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(25) DEFAULT NULL,
  `Cognome` varchar(25) DEFAULT NULL,
  `Dipartimento` varchar(25) DEFAULT NULL,
  `Ufficio` int(11) DEFAULT NULL,
  `Stipendio` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Imp`),
  KEY `fk_Dipartimento_idx` (`Dipartimento`),
  CONSTRAINT `fk_Dipartimento` FOREIGN KEY (`Dipartimento`) REFERENCES `Dipartimento` (`Nome`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Impiegato`
--

LOCK TABLES `Impiegato` WRITE;
/*!40000 ALTER TABLE `Impiegato` DISABLE KEYS */;
INSERT INTO `Impiegato` VALUES (1,'Mario','Rossi','Amministrazione',10,45),(2,'Carlo','Bianchi','Produzione',20,36),(3,'Giuseppe','Verdi','Amministrazione',20,40),(4,'Franco','Neri','Distribuzione',16,45),(5,'Carlo','Rossi','Direzione',14,80),(6,'Lorenzo','Lanzi','Direzione',7,73);
/*!40000 ALTER TABLE `Impiegato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `v_anagrafica`
--

DROP TABLE IF EXISTS `v_anagrafica`;
/*!50001 DROP VIEW IF EXISTS `v_anagrafica`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `v_anagrafica` AS SELECT 
 1 AS `nome`,
 1 AS `cognome`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `v_minstipendio`
--

DROP TABLE IF EXISTS `v_minstipendio`;
/*!50001 DROP VIEW IF EXISTS `v_minstipendio`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `v_minstipendio` AS SELECT 
 1 AS `Dipartimento`,
 1 AS `Stipendio`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `v_anagrafica`
--

/*!50001 DROP VIEW IF EXISTS `v_anagrafica`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_anagrafica` AS select `impiegato`.`Nome` AS `nome`,`impiegato`.`Cognome` AS `cognome` from `impiegato` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_minstipendio`
--

/*!50001 DROP VIEW IF EXISTS `v_minstipendio`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_minstipendio` AS select `impiegato`.`Dipartimento` AS `Dipartimento`,min(`impiegato`.`Stipendio`) AS `Stipendio` from `impiegato` group by `impiegato`.`Dipartimento` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-31  9:44:16
