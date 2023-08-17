DROP TABLE IF EXISTS `booking` CASCADE;
CREATE TABLE `user` (
    `bookingid` INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `adults` INTEGER NOT NULL,
    `cabin_type` VARCHAR(255),
    `children` INTEGER NOT NULL,
    `city_from` VARCHAR(255),
    `city_to` VARCHAR(255),
    `date_from` DATETIME(6),
    `date_to` DATETIME(6),
    `flight_from` VARCHAR(255),
    `flightid` INTEGER NOT NULL,
    `flight_to`VARCHAR(255),
    `return_or_not` BIT(1),
    `stopovers` INTEGER NOT NULL,
    `user_userid` INTEGER,
    UNIQUE (`user_userid`)
)