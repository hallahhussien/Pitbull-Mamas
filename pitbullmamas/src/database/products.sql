CREATE TABLE `products` (
  `productId` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) NOT NULL,
  `productType` varchar(45) DEFAULT NULL,
  `productDescription` varchar(300) DEFAULT NULL,
  `productLink` varchar(300) DEFAULT NULL,
  `productPrice` decimal(6,2) NOT NULL,
  `productImage` mediumblob,
  `favorited` varchar(5) NOT NULL DEFAULT 'NO',
  `featured` varchar(5) NOT NULL DEFAULT 'NO',
  PRIMARY KEY (`productId`)
) 
