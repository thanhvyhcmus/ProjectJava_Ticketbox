CREATE DATABASE `ticketbox1`;
CREATE TABLE `ticketbox1`.`user` (
  `id` VARCHAR(5) NOT NULL,
  `fullname` VARCHAR(45) NULL,
  `dob` DATETIME NULL,
  `username` VARCHAR(15) NOT NULL,
  `password` VARCHAR(10) NOT NULL,
  `phone` VARCHAR(10) NULL,
  `point` INT NULL DEFAULT 0,
  `favouriteGenre` VARCHAR(20) NULL,
  `isadmin` BIT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`) VALUES ('10000', 'Nguyen Ngoc An', '1999/12/22', 'nnan', '22121995', '0345889111', '22', 'Comedy, Action');
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`) VALUES ('11111', 'Nguyen Vu Lan Ngoc', '2000/10/26', 'nvlngoc', '12345', '0987654789', '111', 'Fiction, Romantic');
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`) VALUES ('12342', 'Dang Quang Loc', '2000/1/1', 'dqloc', '12345', '0916238789', '111', 'Drama');
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `point`, `favouriteGenre`) VALUES ('11122', 'Nguyen Van Anh', '2001/2/2', 'nvanh', '12345', '0346789012', '234', 'Comedy, Drama');
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `isadmin`) VALUES ('88888', 'Nguyen Thi Thuy Linh', '1999/12/22', 'nttlinh', '22121999', '0345881011',1);
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `isadmin`) VALUES ('55555', 'Nguyen Pham Thanh Vy', '2000/10/26', 'nptvy', '12345', '0245678234',1);
INSERT INTO `ticketbox1`.`user` (`id`, `fullname`, `dob`, `username`, `password`, `phone`, `isadmin`) VALUES ('56789', 'Dang Minh Hoang Long', '2000/1/1', 'dmhlong', '12345', '0345234567',1);

CREATE TABLE `ticketbox1`.`film` (
  `id` VARCHAR(5) NOT NULL,
  `title` VARCHAR(45) NULL,
  `description` VARCHAR(500) NULL,
  `duration` INT NULL,
  `genre` VARCHAR(30) NULL,
  `director` VARCHAR(45) NULL,
  `Cast` VARCHAR(50) NULL,
  `releasedate` DATETIME NULL,
  `language` VARCHAR(20) NULL,
  `linkFilm` VARCHAR(30) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `releasedate`, `language`, `linkFilm`) VALUES ('10001', 'doraemon', 'Nobita hatches two new dinosaurs, named Kyu and Myu, via the Time Cloth. Nobita nurtures and takes care of these dinosaurs, to prove to his friends that he can find a real dinosaur. Once the dinosaurs are of age, Nobita shows them to Shizuka, Gian, and Suneo.', '118', 'Animation', 'Kazuaki Imai', '2020/11/25', 'Vienamese. English', '/images/doraemon.jpg');
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `Cast`, `releasedate`, `language`, `linkFilm`) VALUES ('10002', 'saigonintherain', 'Saigon In the Rain is a story about love & dreams of young people from all over the world who find each other in Saigon and then get lost in the middle of Saigon. And you? Can I meet my ‘youthfulness’ in the first rain of the season?', '105', 'Romance', 'Le Minh Hoang', 'Avin Lu, Ho Thu Anh', '2020/11/20', 'Vietnamese', '/images/saigonintherain.jpg');
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `Cast`, `releasedate`, `language`, `linkFilm`) VALUES ('10003', 'thewitches', 'Based on the book by Roald Dahl, The Witches is a story about a little boy and his kindly grandmother thwart the efforts of a coven of witches to rid Britain of children by turning them into mice.', '94', 'Adventure, Comedy, Family', 'Robert Zemeckis', 'Anne Hathaway, Octavia Spencer', '2020/12/01', 'English, Vietnamese', '/images/thewitches.gif');
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `Cast`, `releasedate`, `language`, `linkFilm`) VALUES ('10004', 'soul', 'A musician who has lost his passion for music is transported out of his body and must find his way back with the help of an infant soul learning about herself.', '100', 'Adventure, Animation', 'Pete Docter', 'Tina Fey, Jamie Foxx', '2020/12/12', 'English, Vietnamese', '/images/soul.jpg');
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `Cast`, `releasedate`, `language`, `linkFilm`) VALUES ('10005', 'wonderwoman', 'Fast forward to the 1980s as Wonder Woman’s next big screen adventure finds her facing two all-new foes: Max Lord and The Cheetah, while reuniting with her past love Steve Trevor.', '120', 'Action, Fantasy', 'Patty Jenkins', 'Gal Gadot, Chris Pine', '2020/12/20', 'English, Vietnamese', '/images/wonderwoman.gif');
INSERT INTO `ticketbox1`.`film` (`id`, `title`, `description`, `duration`, `genre`, `director`, `Cast`, `releasedate`, `language`, `linkFilm`) VALUES ('10006', 'pawn', 'Du-seok (SUNG Dong Il) and Jong-bae (KIM Hiewon) are tough-rough private loan sharks who chase down a debtor to collect but end up taking Seung-yi (PARK Soi), a 9-year-old girl, as a pawn. “What does pawn mean?” Without even knowing what it means, Seung-yi becomes a pawn due to her mother’s misfortunes.', '113', 'Comedy, Drama', 'Kang Dae Kyu', 'Sung Dong Il, Ha Ji Won', '2020/12/15', 'English', '/images/pawn.jpg');

CREATE TABLE `ticketbox1`.`theater` (
  `id` VARCHAR(5) NOT NULL,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10001', 'CGV Su Van Hanh', '123 Su Van Hanh Street, District 10, Ho Chi Minh City');
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10002', 'Galaxy Cinema', '1987 Ba Thang Hai, District Thu Duc, Ho Chi Minh City');
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10004', 'Lotte Cinema', '56 Nguyen Van Cu Street, District 5, Ho Chi Minh City');
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10003', 'Meganet', '875 Nguyen Tri Phuong Street, District 3, Ho Chi Minh City');
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10005', 'CGV Hung Vuong', '198 Hung Vuong Street, District 1, Ho Chi Minh City');
INSERT INTO `ticketbox1`.`theater` (`id`, `name`, `address`) VALUES ('10006', 'Lotte Nowzone', '1975 Dien Bien Phu Street, District 2, Ho Chi Minh City');

CREATE TABLE `ticketbox1`.`showtime` (
  `id` VARCHAR(5) NOT NULL,
  `idtheater` VARCHAR(5) NULL,
  `idfilm` VARCHAR(5) NULL,
  `starttime` VARCHAR(10) NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`idtheater`) REFERENCES `ticketbox1`.`theater` (id),
  FOREIGN KEY (`idfilm`) REFERENCES `ticketbox1`.`film` (id));
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30000', '10001', '10005', '8pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30001', '10002', '10005', '6pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30002', '10001', '10002', '8am');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30003', '10003', '10002', '10am');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30004', '10004', '10004', '7pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30005', '10004', '10003', '10pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30006', '10005', '10004', '2pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30007', '10001', '10004', '1:30pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30008', '10004', '10001', '3pm');
INSERT INTO `ticketbox1`.`showtime` (`id`, `idtheater`, `idfilm`, `starttime`) VALUES ('30009', '10002', '10005', '3pm');

CREATE TABLE `ticketbox1`.`seatsofshowtime` (
  `idshowtime` VARCHAR(5) NOT NULL,
  `idrow` INT NOT NULL,
  `idcolumn` INT NOT NULL,
  `status` VARCHAR(5) NULL,
  `ticketprice` INT NULL default 50000,
  PRIMARY KEY (`idshowtime`,`idrow`,`idcolumn`),
  FOREIGN KEY (`idshowtime`) REFERENCES `ticketbox1`.`showtime` (id),
  FOREIGN KEY (`status`) REFERENCES `ticketbox1`.`user` (id));
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES ('30001', '0', '0', '40000');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES ('30001', '2', '0', '40000');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES ('30001', '1', '0', '40000');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES ('30001', '3', '0', '60000');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`, `ticketprice`) VALUES ('30001', '4', '0', '60000');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`) VALUES ('30001', '5', '0');
INSERT INTO `ticketbox1`.`seatsofshowtime` (`idshowtime`, `idrow`, `idcolumn`) VALUES ('30001', '6', '0');

