create database if not exists uts default character set utf8;

use uts;

CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL,
  `nama` varchar(32) NOT NULL,
  `deskripsi` varchar(200) NOT NULL,
  `kategori` varchar(256) NOT NULL,
  `pabrikan` varchar(32) NOT NULL,
  `berat` double NOT NULL,
  `harga` int NOT NULL,
  `tahun_produksi` int NOT NULL,
  `jumlah_stok` int NOT NULL,
  `kondisi` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `nama`, `deskripsi`, `kategori`, `pabrikan`, `berat`, `harga`, `tahun_produksi`, `jumlah_stok`, `kondisi`) VALUES 
(1, 'MacBook Pro', 'Laptop terbaik di dunia', 'Laptop', 'Apple', 1.2, 20000000, 2015, 10, 'Baru'),
(2, 'Lenovo','Laptop terbaik kedua di dunia', 'Laptop', 'Lenovo', 2, 15000000, 2012, 20, 'Baru'),
(3, 'Xiaomi 4', 'Handphone murah yang cukup bagus', 'Handphone', 'Xiaomi', 0.2, 3000000, 2015, 100, 'Baru'),
(4, 'Samsung S60', 'Handphone mid-end', 'Handphone', 'Samsung', 0.2, 1500000, 2011, 2, 'Bekas'),
(5, 'XPS 15', 'Laptop 15-inch untuk bekerja', 'Laptop', 'Dell', 2, 16500000, 2017, 25, 'Baru');

--
-- Indexes for table `product`
--
--
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);
--

ALTER TABLE `product`
MODIFY `id` int NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;

