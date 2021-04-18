-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2021 at 04:11 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `challengeapi`
--

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `id` bigint(20) NOT NULL,
  `area` double NOT NULL,
  `capital` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `region` varchar(50) NOT NULL,
  `subregion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`id`, `area`, `capital`, `name`, `region`, `subregion`) VALUES
(1, 855213, 'Maputo', 'Mozambique', 'sul', 'sul'),
(2, 45589, 'Luanda', 'Angola', 'sul', 'sul'),
(3, 1455987, 'Lisboa', 'Portugal', 'sul', 'sul'),
(4, 12447856, 'Londres', 'Inglaterra', 'sul', 'sul'),
(5, 12548, 'Buenos Aires', 'Argentina', 'sul', 'sul'),
(6, 147895, 'Bokota', 'Colombia', 'sul', 'sul'),
(7, 455698, 'Madrid', 'Espanha', 'sul', 'sul'),
(8, 1255698, 'Berlim', 'Alemanha', 'sul', 'sul'),
(9, 1455269, 'Nairobi', 'Kenia', 'sul', 'sul'),
(10, 22323, 'Toquio', 'China', 'sul', 'sul'),
(11, 2255487, 'Denver', 'Colorado', 'sul', 'sul'),
(12, 44455879, 'Helsinqui', 'Helsinqui', 'sul', 'sul'),
(13, 5566987, 'Oslo', 'Noroega', 'sul', 'sul'),
(14, 5566987, 'New York', 'Estados Unidos da America', 'sul', 'sul'),
(16, 5466639, 'Roma', 'Italia', 'Norte', 'sul');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_hs6grar8947iypypoi4wwjvc5` (`capital`),
  ADD UNIQUE KEY `UK_llidyp77h6xkeokpbmoy710d4` (`name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
