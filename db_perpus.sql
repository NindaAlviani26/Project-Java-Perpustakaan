/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.5.5-10.1.31-MariaDB : Database - belajar_bikin
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`belajar_bikin` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `belajar_bikin`;

/*Table structure for table `anggota` */

DROP TABLE IF EXISTS `anggota`;

CREATE TABLE `anggota` (
  `no` varchar(255) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `buku_dipinjam` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anggota` */

LOCK TABLES `anggota` WRITE;

insert  into `anggota`(`no`,`nama`,`jurusan`,`buku_dipinjam`,`alamat`) values ('1508','Ali Fahmi','Manajemen Informatika',NULL,'Desa Cijambu'),('26','Alviani Ninda','MI','Pisan','Banjar kota');

UNLOCK TABLES;

/*Table structure for table `buku` */

DROP TABLE IF EXISTS `buku`;

CREATE TABLE `buku` (
  `id` varchar(255) NOT NULL,
  `nama_buku` varchar(255) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `buku` */

LOCK TABLES `buku` WRITE;

insert  into `buku`(`id`,`nama_buku`,`kategori`) values ('26','The True Love Story','Romance');

UNLOCK TABLES;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

LOCK TABLES `login` WRITE;

insert  into `login`(`username`,`password`) values ('alviani','ninda');

UNLOCK TABLES;

/*Table structure for table `pinjaman` */

DROP TABLE IF EXISTS `pinjaman`;

CREATE TABLE `pinjaman` (
  `id_pinjaman` varchar(255) NOT NULL,
  `id_anggota` varchar(255) DEFAULT NULL,
  `id_buku` varchar(255) DEFAULT NULL,
  `tgl_pinjam` varchar(255) DEFAULT NULL,
  `tgl_kembali` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pinjaman`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pinjaman` */

LOCK TABLES `pinjaman` WRITE;

insert  into `pinjaman`(`id_pinjaman`,`id_anggota`,`id_buku`,`tgl_pinjam`,`tgl_kembali`) values ('2019',NULL,NULL,'2019-10-22','2019-10-17');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
