-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: store_system_managerment
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id customer` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `date of birth` date NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(500) NOT NULL,
  `number phone` char(11) NOT NULL,
  `customer category` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `customer category` (`customer category`),
  CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`customer category`) REFERENCES `customer category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (2,'1911061362','Nguyễn Minh Nhật','2001-08-24','Nam','Lâm Đồng','0383420578',1),(3,'1911061234','Quách Quang Minh','2001-12-12','Nam','Cà Mau','0123456789',2),(4,'1911061362','Võ Thanh Thông','2001-01-01','Nam','Bến Tre','0987654321',3),(6,'1911068923','Trương Ngọc Huyền','1998-07-23','Nữ','Bình Thạnh, TP. Hồ Chí Minh','0123896254',1),(7,'1911820622','Quách Trà Mi','2000-06-21','Nữ','Bình Định','0854682331',2),(8,'1911086323','Anh Tuấn','1996-03-13','Nam','Bình Thạnh','0168923456',3);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer category`
--

DROP TABLE IF EXISTS `customer category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `note` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer category`
--

LOCK TABLES `customer category` WRITE;
/*!40000 ALTER TABLE `customer category` DISABLE KEYS */;
INSERT INTO `customer category` VALUES (1,'V.I.P','Giảm 10%'),(2,'Sinh viên','Giảm 5%'),(3,'Thường','Giảm 0%');
/*!40000 ALTER TABLE `customer category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distributor`
--

DROP TABLE IF EXISTS `distributor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `distributor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id distributor` varchar(50) NOT NULL,
  `name` varchar(150) NOT NULL,
  `address` varchar(500) NOT NULL,
  `number phone` char(11) NOT NULL,
  `email` char(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distributor`
--

LOCK TABLES `distributor` WRITE;
/*!40000 ALTER TABLE `distributor` DISABLE KEYS */;
INSERT INTO `distributor` VALUES (1,'9200384KGVN','Công Ty CP Đầu Tư K&G Việt Nam','Tầng 11, Khối A, Tòa nhà Sông Đà, Đ. Phạm Hùng, P. Mỹ Đình 1, Q. Nam Từ Liêm, Hà Nội','02437880111','cs@kgvietnam.com'),(2,'57890034STTMS','Shop Thỏa Thích Mua Sắm','76/9 Trần Bá Giao, P. 5, Q. Gò Vấp, Tp. Hồ Chí Minh','0902635169','thoathichmuasamshop@gmail.com'),(3,'EE803362PTSG','Quần Áo Phật Tử Sài Gòn','Số 58, Đường Đông Hưng Thuận 26, KP. 3A, P. Đông Hưng Thuận, Tp. Hồ Chí Minh','0848348456','quanaophattusaigon@gmail.com'),(4,'608902PDNB20','Công Ty Cổ Phần May Phú Thịnh - Nhà Bè','13A, Tống Văn Trân, Phường 5, Quận 11 Tp. Hồ Chí Minh','02838650561','mayphudinhnhabe@gmail.com'),(5,'ZS770273ZS','Zin Shop','108A11 Nguyễn Quý Đức, Quận Thanh Xuân, Hà Nội','01698328028','tranduyen0392@gmail.com'),(6,'003472MM013NT','May Mặc Nhàn Thanh - Công Ty TNHH Sản Xuất Thương Mại Và Dịch Vụ Nhàn Thanh','Số 48, Ngõ 123, Đ. Hoàng Quốc Việt, Q. Cầu Giấy, Hà Nội','0966994641','nhannunakids@gmail.com'),(7,'206CP66781HAZ','Công Ty CP HAZZA','94 Chu Văn An, P. 26, Q. Bình Thạnh, Tp. Hồ Chí Minh','02866828974','info@ananas.vn'),(8,'DE008365VINA','Công Ty TNHH Thương Mại Dịch Vụ Delta Vina','2/28/3 Đường TMT12, P. Trung Mỹ Tây, Q. 12, Tp. Hồ Chí Minh','0909324068','maymacdelta@gmail.com'),(9,'QC23567THAIVNXK','Hiền Libra Shop - Kho sỉ quần áo Thái QC VNXK','842/1/140 Nguyễn Kiệm, Phường 3, Quận Gò Vấp, Tp. Hồ Chí Minh','0933678018','levubds88@gmail.com'),(10,'003582V3CNEL','Công Ty TNHH 3 Vchannel','43/64/22, Khu Phố 1, Vườn Lài, P. An Phú Đông, Q. 12, Tp. Hồ Chí Minh','0908210884','info@3vchannel.net'),(11,'830069SXTMTISA','T.I.S.A - Công Ty TNHH Sản Xuất & Thương Mại T.I.S.A','235/3 Nghĩa Phát, P. 6, Q. Tân Bình, Tp. Hồ Chí Minh','02838643196','ti.sa@info.vn'),(12,'990333871DA','Duy Anh - Công Ty TNHH Thời Trang & Mỹ Phẩm Duy Anh','Rex Arcade, 4-6 Lê Lợi, P. Bến Nghé, Q. 1 Tp. Hồ Chí Minh','02838274972','sonle@duyanh.com'),(13,'0093GG4710DONY','Xưởng Gia Công Hàng Thời Trang - Công Ty TNHH May Mặc Dony','1F Quách Điêu, ấp 3, Xã Vĩnh Lộc A, Huyện Bình Chánh, Tp. Hồ Chí Minh','0938842123','info@dony.vn'),(14,'PC0092AJUMMA370','Thời Trang Trung Niên AJUMMA - Công Ty TNHH Vải Sợi Giang Nam','Số 123, Đường CN11, P. Sơn Kỳ, Q. Tân Phú, Tp. Hồ Chí Minh','0946761599','info.giangnam@gmail.com'),(15,'90338410TNCMPNY','May Mặc Trường Nam - Công Ty TNHH Sản Xuất TMDV Trường Nam','63/12 Đỗ Nhuận, P. Sơn Kỳ, Q. Tân Phú, Tp. Hồ Chí Minh','0978550644','truongnamconpany@gmail.com'),(16,'00812083CCXN','Thời Trang Nam Cao Cấp Xung Nga','Xóm 4, Cống Kè Baza, Xã Ninh Hiệp, Huyện Gia Lâm, Hà Nội','0968226666','xungnga@gmail.com'),(17,'109983EGMVN','May Mặc Esquel - Công Ty TNHH Esquel Garment Manufacturing Việt Nam','Số 9, Đường Số 5, KCN Việt Nam - Singapore, TP. Thuận An, Bình Dương','02743757629','info@esquel.com'),(18,'6530LS7903','Thời Trang Linh San - Công Ty TNHH Thiết Kế Thời Trang Linh San','553 & 553A Nguyễn Trãi, P. 7 , Q. 5, Tp. Hồ Chí Minh','02866602090','lisalam7979@gmail.com'),(19,'QT772308TTTC','Quà Tặng Thành Công - Công Ty TNHH Quà Tặng Thời Trang Thành Công','68 Nguyễn Huệ, P. Bến Nghé, Q. 1, Tp. Hồ Chí Minh','0835130333','quatangthanhcong@gmail.com'),(20,'PIGO8802190','PIGOFASHION - Cửa Hàng Thời Trang Nam Cao Cấp','341/26 Lạc Long Quân, P. 5, Q. 11, Tp. Hồ Chí Minh','0916058080','pigofashionvn@gmail.com'),(21,'DEV2022NNTEAM','Thời trang Shop NN Team','Bình Chánh, Tp. HCM','0382699057','nnteam@gmail.com');
/*!40000 ALTER TABLE `distributor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id employee` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `id position` int(11) NOT NULL,
  `date of birth` date NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `number phone` char(11) NOT NULL,
  `email` char(50) NOT NULL,
  `salary` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id position` (`id position`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`id position`) REFERENCES `position` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (15,'QL001002300','Nguyễn Minh Nhật',2,'2001-08-24','Nam','Bình Chánh, TP. Hồ Chí Minh','0383420578','nhatnguyenktz119@gmail.com',15000000),(16,'BV002234511','Võ Thanh Thông',5,'2001-01-01','Nam','Thủ Đức, TP. Hồ Chí Minh','02285528888','thanhthong@gmail.com',5000000),(17,'BH121221211','Quách Minh',3,'2001-12-12','Nữ','Cà Mau','0834669921','quangminhcm2001@gmail.com',100000000),(18,'KH088523777','Phi Hoàng',4,'2001-06-01','Nam','Đồng Nai','0330101011','phihoang@gmail.com',7000000),(20,'QL03384256','Nhựt Khang',2,'2001-12-01','Nam','Vĩnh Long','0329974246','khangdev20@gmail.com',12000000),(21,'KH05558334','Đỗ Phương Nam',4,'2001-01-01','Nam','Thái Bình','08792335733','phuongnam@gmail.com',10000000),(22,'BH084463322','Nguyễn Minh Hạo',3,'2001-12-23','Nữ','Bình Tân, TP. HCM','0168223890','haobede@gmail.com',8500000),(23,'BH0023556423','Phu Nhì Nam',3,'1999-03-15','Nam','Tp. HCM','0985443286','nhinam@gmail.com',7800000),(24,'BH0034666','Minh Tuân',3,'2000-09-05','Nam','Gò Vấp, TP. HCM','0233865473','minhtuan@gmail.com',9000000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id customer` int(11) NOT NULL,
  `id employee` int(11) NOT NULL,
  `creation date` date NOT NULL,
  `total amount` bigint(20) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id customer` (`id customer`),
  KEY `id employee` (`id employee`),
  CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`id customer`) REFERENCES `customer` (`id`),
  CONSTRAINT `invoice_ibfk_3` FOREIGN KEY (`id employee`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (2,2,17,'2022-04-23',1520000,NULL),(3,2,17,'2022-04-23',1079000,NULL),(4,2,17,'2022-04-23',1149000,NULL),(5,2,17,'2022-04-23',1078000,NULL),(6,2,17,'2022-04-23',1080000,NULL),(7,2,17,'2022-04-23',505000,NULL),(8,2,17,'2022-04-23',730000,NULL),(9,2,17,'2022-04-23',729000,NULL),(10,2,17,'2022-04-23',840000,NULL),(11,2,17,'2022-04-23',800000,NULL),(12,2,17,'2022-04-23',4587000,NULL),(13,2,17,'2022-04-23',2400000,NULL),(14,2,17,'2022-04-23',800000,NULL),(15,2,17,'2022-04-23',350000,NULL),(16,2,17,'2022-04-23',380000,NULL),(17,2,17,'2022-04-23',349000,NULL),(18,2,17,'2022-04-23',420000,NULL),(19,2,17,'2022-04-23',380000,NULL),(20,2,17,'2022-04-23',350000,NULL),(21,2,17,'2022-05-25',1520000,NULL),(22,2,17,'2022-04-25',1047000,NULL),(23,2,17,'2022-04-26',700000,NULL),(24,8,24,'2022-05-15',1110000,NULL);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice details`
--

DROP TABLE IF EXISTS `invoice details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id invoice` int(11) NOT NULL,
  `id product` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id invoice` (`id invoice`),
  CONSTRAINT `invoice details_ibfk_1` FOREIGN KEY (`id invoice`) REFERENCES `invoice` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice details`
--

LOCK TABLES `invoice details` WRITE;
/*!40000 ALTER TABLE `invoice details` DISABLE KEYS */;
INSERT INTO `invoice details` VALUES (2,4,3,3,NULL),(3,5,2,3,NULL),(4,6,2,3,NULL),(5,6,0,0,NULL),(6,9,2,2,NULL),(7,11,2,2,NULL),(8,12,4,12,NULL),(9,13,2,6,NULL),(10,14,2,2,NULL),(11,15,1,1,NULL),(12,17,1,1,NULL),(13,18,1,1,NULL),(14,19,1,1,NULL),(15,20,1,1,NULL),(16,21,1,4,NULL),(17,22,1,3,NULL),(18,23,1,2,NULL),(19,24,2,3,NULL);
/*!40000 ALTER TABLE `invoice details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manufacturer`
--

DROP TABLE IF EXISTS `manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manufacturer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id manufacturer` char(50) NOT NULL,
  `name` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manufacturer`
--

LOCK TABLES `manufacturer` WRITE;
/*!40000 ALTER TABLE `manufacturer` DISABLE KEYS */;
INSERT INTO `manufacturer` VALUES (1,'100200ANN','Xưởng May Quần Áo ANN'),(9,'101500GARMEX','Công ty cổ phần sản xuất thương mại may Sài Gòn'),(10,'100900VT','Tổng công ty cổ phần may Việt Tiến'),(12,'100700TSSP','Công ty Thái Sơn SP'),(13,'100300HANSAE','Công ty TNHH HANSAE Việt Nam'),(14,'100800PP','Tổng công ty cổ phần Phong Phú'),(25,'100400GD','Công ty cổ phần dệt may Gia Định'),(26,'10003255FEUNI','Công Ty TNHH Thời Trang Felegant Uniform'),(27,'10062003CNTBD','Công Ty TNHH Công Nghiệp Dệt May Thái Bình Dương'),(29,'100032COL','Công Ty Cổ Phần Thời Trang Coloury'),(30,'1004235BNS','Công Ty TNHH Bảo Nguyệt Safety'),(31,'100930046GARICO','Công Ty TNHH Sản Xuất Thương Mại GARICO'),(32,'10003900MODAVN','Công Ty TNHH Moda Việt Nam'),(33,'1010029UNIPVN','Công Ty TNHH Quốc Tế UNI-PRO Việt Nam'),(34,'100325888MACVN','Công Ty TNHH Mascot Việt Nam'),(36,'100086NMN','Công ty TNHH 1 TV NN Team');
/*!40000 ALTER TABLE `manufacturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` VALUES (1,'Quản trị viên'),(2,'Quản lý'),(3,'Nhập kho'),(4,'Bán hàng');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id position` char(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (2,'QL1000','Quản lý'),(3,'BH0100','Nhân viên bán hàng'),(4,'KH0010','Nhân viên kho hàng'),(5,'BV0001','Bảo vệ');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id product` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `id product category` int(11) NOT NULL,
  `id manufacturer` int(11) NOT NULL,
  `size` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `import price` int(11) NOT NULL,
  `export price` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id product category` (`id product category`),
  KEY `id manufacturer` (`id manufacturer`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`id product category`) REFERENCES `product category` (`id`),
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`id manufacturer`) REFERENCES `manufacturer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'010010QTUHAS34','The Funky Bear',1,10,'M,L','Đen',10,250000,420000),(4,'010054FSNNYA8A','Mende - Flash',4,1,'L, XL','Trắng',15,245000,380000),(5,'01007773GSC02','Mende - Blue Cloud',4,1,'L, XL, XXL','Xanh, Trắng',10,210000,350000),(6,'0102900OSGSM1','Feaer Denim Form Suông',4,30,'M, L , XL','Đen, Vàng',30,230000,349000),(7,'010555326888','Local Brand ASF',4,27,'X, XL, XXL','Đen, Đen đỏ',20,360000,480000);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product category`
--

DROP TABLE IF EXISTS `product category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id product category` char(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product category`
--

LOCK TABLES `product category` WRITE;
/*!40000 ALTER TABLE `product category` DISABLE KEYS */;
INSERT INTO `product category` VALUES (1,'AO00200101','Áo dài tay'),(4,'AO00200202','Áo ngắn tay'),(5,'AO00200404','Áo kẻ'),(6,'AO00300105','Áo khoác'),(7,'AO00100909','Áo hai dây'),(9,'AO00600702','Áo hoodie'),(10,'AO00300606','Áo vest'),(11,'QU00500402','Quần jean'),(12,'QU00100208','Quần short'),(13,'QU00100903','Quần ống suông'),(15,'QU00700400','Quần bó'),(16,'QU00300201','Quần thể thao');
/*!40000 ALTER TABLE `product category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product details`
--

DROP TABLE IF EXISTS `product details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id product` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product details`
--

LOCK TABLES `product details` WRITE;
/*!40000 ALTER TABLE `product details` DISABLE KEYS */;
INSERT INTO `product details` VALUES (1,'010054FSNNYA8A','Mende - Flash',2,760000),(2,'01007773GSC02','Mende - Blue Cloud',1,350000);
/*!40000 ALTER TABLE `product details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product invoice details`
--

DROP TABLE IF EXISTS `product invoice details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product invoice details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id invoice` int(11) NOT NULL,
  `id product details` int(11) NOT NULL,
  `total amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product invoice details`
--

LOCK TABLES `product invoice details` WRITE;
/*!40000 ALTER TABLE `product invoice details` DISABLE KEYS */;
INSERT INTO `product invoice details` VALUES (1,24,2,1110000);
/*!40000 ALTER TABLE `product invoice details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receiving transaction`
--

DROP TABLE IF EXISTS `receiving transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receiving transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id employee` int(11) NOT NULL,
  `id distributor` int(11) NOT NULL,
  `total amount` bigint(20) NOT NULL,
  `transaction date` date NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id employee` (`id employee`),
  KEY `id distributor` (`id distributor`),
  CONSTRAINT `receiving transaction_ibfk_1` FOREIGN KEY (`id employee`) REFERENCES `employee` (`id`),
  CONSTRAINT `receiving transaction_ibfk_2` FOREIGN KEY (`id distributor`) REFERENCES `distributor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receiving transaction`
--

LOCK TABLES `receiving transaction` WRITE;
/*!40000 ALTER TABLE `receiving transaction` DISABLE KEYS */;
INSERT INTO `receiving transaction` VALUES (4,18,17,5250000,'2022-04-25',NULL),(5,18,15,7200000,'2022-05-15',NULL);
/*!40000 ALTER TABLE `receiving transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receiving transaction details`
--

DROP TABLE IF EXISTS `receiving transaction details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receiving transaction details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id receiving transaction` int(11) NOT NULL,
  `id product` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id product` (`id product`),
  KEY `id receiving transaction` (`id receiving transaction`),
  CONSTRAINT `receiving transaction details_ibfk_1` FOREIGN KEY (`id product`) REFERENCES `product` (`id`),
  CONSTRAINT `receiving transaction details_ibfk_2` FOREIGN KEY (`id receiving transaction`) REFERENCES `receiving transaction` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receiving transaction details`
--

LOCK TABLES `receiving transaction details` WRITE;
/*!40000 ALTER TABLE `receiving transaction details` DISABLE KEYS */;
INSERT INTO `receiving transaction details` VALUES (2,4,5,25,NULL),(3,5,7,20,NULL);
/*!40000 ALTER TABLE `receiving transaction details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `id employee` int(11) NOT NULL,
  `permission` int(11) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `id employee` (`id employee`),
  KEY `permission` (`permission`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`id employee`) REFERENCES `employee` (`id`),
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`permission`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('admin','admin',15,1),('khangdev','khangdev20',20,2),('minhhao','haobede',22,4),('minhpro','minh123',17,4),('minhtuan','tuan123',24,4),('nhatnguyen','nhat',15,2),('nhinam','nam123',23,4),('phihoang','hoang123',18,3),('phuongnam','nam123',21,3);
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

-- Dump completed on 2022-05-26 11:08:56
