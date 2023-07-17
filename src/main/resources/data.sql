
/*!80016 DEFAULT ENCRYPTION='N' */;

-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: dube
-- ------------------------------------------------------
-- Server version	8.0.29 /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `name` varchar(40) NOT NULL,
                            `username` varchar(20) NOT NULL,
                            `role` varchar(20) NOT NULL,
                            `salary` int NOT NULL,
                            `birthday` date NOT NULL,
                            `national_id` varchar(15) NOT NULL,
                            `phone_number` varchar(12) DEFAULT NULL,
                            `email` varchar(50) DEFAULT NULL,
                            `bhxh` varchar(20) DEFAULT NULL,
                            `mst` varchar(20) DEFAULT NULL,
                            `onboard_date` date NOT NULL,
                            `quit_date` date DEFAULT NULL,
                            `probation_rate` decimal(4, 0) DEFAULT NULL,
                            `bank` varchar(20) DEFAULT NULL,
                            `account_number` varchar(20) DEFAULT NULL,
                            `hr` varchar(30) DEFAULT NULL,
                            `note` varchar(200) DEFAULT NULL,
                            `status` varchar(20) NOT NULL,
                            `project_id` int DEFAULT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;
;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
;
DROP TABLE IF EXISTS `employee_timesheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_timesheet` (
                                      `employee_id` int NOT NULL,
                                      `timesheet_id` varchar(255) NOT NULL,
                                      `total_working_hours` int NOT NULL,
                                      `total_ot_hours` int NOT NULL,
                                      `total_mandays` int NOT NULL,
                                      `status` varchar(25) NOT NULL,
                                      `updated_by` varchar(45) DEFAULT NULL,
                                      `updated_time` datetime DEFAULT NULL,
                                      `approved_by` varchar(45) DEFAULT NULL,
                                      `approved_time` datetime DEFAULT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;
;
/*!40000 ALTER TABLE `employee_timesheet` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_timesheet` ENABLE KEYS */;
;
DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `name` varchar(30) DEFAULT NULL,
                           `description` varchar(255) DEFAULT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;
;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
;
DROP TABLE IF EXISTS `timesheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `timesheet` (
                             `id` varchar(255) NOT NULL,
                             `month` date NOT NULL,
                             `total_working_day` int NOT NULL,
                             `weekend_date` varchar(100) NOT NULL,
                             `holiday_date` varchar(150) DEFAULT NULL,
                             `status` varchar(25) NOT NULL,
                             `created_by` varchar(45) NOT NULL,
                             `updated_by` varchar(45) DEFAULT NULL,
                             `updated_time` datetime NOT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;
;
/*!40000 ALTER TABLE `timesheet` DISABLE KEYS */;
/*!40000 ALTER TABLE `timesheet` ENABLE KEYS */;
;
DROP TABLE IF EXISTS `work_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `work_log` (
                            `id` varchar(255) NOT NULL,
                            `timesheet_id` varchar(255) NOT NULL,
                            `employee_id` int NOT NULL,
                            `day_in_month` int NOT NULL,
                            `working_hours` int NOT NULL,
                            `ot_hours` int NOT NULL,
                            `note` varchar(255) DEFAULT NULL
);
/*!40101 SET character_set_client = @saved_cs_client */;
;
/*!40000 ALTER TABLE `work_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `work_log` ENABLE KEYS */;
;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
