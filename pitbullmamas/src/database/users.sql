CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `email` varchar(60) NOT NULL,
  `password` varchar(35) NOT NULL,
  `location` varchar(45) DEFAULT NULL,
  `image` blob,
  `role` varchar(5) NOT NULL DEFAULT 'user',
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userId_UNIQUE` (`userId`)
) 

