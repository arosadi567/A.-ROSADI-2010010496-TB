-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2023 at 03:39 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `info_wisata`
--

-- --------------------------------------------------------

--
-- Table structure for table `objek_wisata`
--

CREATE TABLE `objek_wisata` (
  `id_wisata` int(11) NOT NULL,
  `nama_wisata` varchar(255) NOT NULL,
  `kota` varchar(25) NOT NULL,
  `harga_tiket` decimal(10,0) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `objek_wisata`
--

INSERT INTO `objek_wisata` (`id_wisata`, `nama_wisata`, `kota`, `harga_tiket`, `tanggal`, `keterangan`) VALUES
(2023001, 'Pantai bali', 'Bali', '100000', '2023-01-22', 'Public'),
(2023002, 'Candi prambanan', 'Jawa tengah', '100000', '2023-02-11', 'Public'),
(2023003, 'Kaliadem', 'Yogyakarta', '100000', '2023-02-21', 'Privat'),
(2023004, 'Pulau padar', 'NTT', '120000', '2023-03-13', 'Privat'),
(2023005, 'Geopark ciletuh', 'Banyuangi', '80000', '2023-07-12', 'Privat'),
(2023006, 'Pulau cinta', 'Gorontalo', '90000', '2023-09-08', 'privat'),
(2023007, 'Raja ampat', 'Pappua barat', '100000', '2023-09-14', 'Public'),
(2023008, 'Situ gunung', 'Sukabumi', '70000', '2023-03-12', 'Public'),
(2023009, 'Goa jomblang', 'Yogyakarta', '120000', '2023-12-11', 'Privat'),
(2023010, 'Bunaken', 'Sulawesi utara', '100000', '2023-01-14', 'Privat'),
(2023011, 'Candi brobudur', 'Jawa', '15000', '2023-08-11', 'public'),
(2023012, 'Gunung indah', 'jawa', '150000', '2023-01-09', 'public');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_wisata` int(11) NOT NULL,
  `nama_pelanggan` varchar(25) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `umur` int(11) NOT NULL,
  `no_telpon` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_wisata`, `nama_pelanggan`, `alamat`, `umur`, `no_telpon`) VALUES
(2023001, 'A. Rosadi', 'Jl. Persada', 22, '082251515879'),
(2023002, 'Indra firmawan', 'Jl. Mawar', 21, '08336576555');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `objek_wisata`
--
ALTER TABLE `objek_wisata`
  ADD PRIMARY KEY (`id_wisata`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_wisata`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `objek_wisata`
--
ALTER TABLE `objek_wisata`
  MODIFY `id_wisata` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2023013;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_ibfk_1` FOREIGN KEY (`id_wisata`) REFERENCES `objek_wisata` (`id_wisata`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
