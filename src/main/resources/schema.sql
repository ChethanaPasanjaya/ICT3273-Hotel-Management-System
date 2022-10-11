-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2022 at 07:16 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET
SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET
time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_1`
--

DELIMITER
$$
--
-- Procedures
--
CREATE
DEFINER=`root`@`localhost` PROCEDURE `annual_not_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
where YEAR (pay_date)= YEAR (now()) and paid =0;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `annual_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
where YEAR (pay_date)= YEAR (now()) and paid =1;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `annual_profit` ()
BEGIN
SELECT customer_name as Customer_name, paid as Paid, amount as Amount
FROM all_transaction
where YEAR (pay_date)= YEAR (now());

END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `annual_profit_sum` ()
BEGIN
SELECT sum(amount) as Amount
FROM all_transaction
where YEAR (pay_date)= YEAR (now());
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `bill` (IN `cus_id` VARCHAR(100), IN `bill_date` DATE)
BEGIN
select transaction_type as Bill_type, amount as Amount
from all_transaction
where customer_id = cus_id
  and pay_date = bill_date;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `daily_profit_sum` ()
BEGIN

SELECT sum(amount) as Amount
FROM all_transaction
WHERE day (pay_date)= day (curdate());
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `monthly_not_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
where MONTH (pay_date)= MONTH (now()) and paid = 0;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `monthly_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
where MONTH (pay_date)= MONTH (now()) and paid = 1;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `monthly_profit` ()
BEGIN
SELECT customer_name as Customer_name, paid as Paid, amount as Amount
FROM all_transaction
where MONTH (pay_date)= MONTH (now());
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `monthly_profit_sum` ()
BEGIN
SELECT sum(amount) as Amount
FROM all_transaction
where MONTH (pay_date)= MONTH (now());
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `showOrder` (IN `ord_id` INT)
BEGIN

SELECT meals.meal_name,
       meals.price,
       order_meals.order_id,
       order_meals.meal_id,
       order_meals.quantity,
       order_meals.quantity * meals.price AS category_price
FROM orders
         LEFT JOIN order_meals ON order_meals.order_id = orders.order_id
         LEFT JOIN meals ON order_meals.meal_id = meals.meal_id
WHERE order_meals.order_id = ord_id;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `today_not_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
WHERE day (pay_date)= day (curdate()) and paid =0;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `today_paid` ()
BEGIN
SELECT customer_name as Customer_name, amount as Amount
FROM all_transaction
WHERE day (pay_date)= day (curdate()) and paid =1;
END$$

CREATE
DEFINER=`root`@`localhost` PROCEDURE `today_profit` ()
BEGIN
SELECT customer_name as Customer_name, paid as Paid, amount as Amount
FROM all_transaction
WHERE day (pay_date)= day (curdate());
END$$

--
-- Functions
--
CREATE
DEFINER=`root`@`localhost` FUNCTION `check_room_available` (`room_type` VARCHAR(30), `room_qty` INT) RETURNS VARCHAR(20) CHARSET utf8mb4
BEGIN
    DECLARE
quantity int;
    DECLARE
result varchar(20);
select qty
into quantity
from hotel_management_sys.room_type
where variety = room_type;
IF
quantity >= room_qty THEN
		SET result = 'avaiable';
ELSE
		SET result = 'unavaiable';
END IF;

RETURN (result);
END$$

CREATE
DEFINER=`root`@`localhost` FUNCTION `choose_room_type` (`room_type` VARCHAR(30)) RETURNS VARCHAR(20) CHARSET utf8mb4
BEGIN
    DECLARE
result varchar(20);

select variety
into result
from hotel_1.room_type
where variety = room_type;

RETURN (result);
END$$

CREATE
DEFINER=`root`@`localhost` FUNCTION `orderPrice` (`orderId` INT) RETURNS INT(11)
BEGIN
    declare
category_price float;
SELECT sum(order_meals.quantity * meals.price)
into category_price
FROM orders
         LEFT JOIN order_meals ON order_meals.order_id = orders.order_id
         LEFT JOIN meals ON order_meals.meal_id = meals.meal_id
WHERE order_meals.order_id = orderId;

UPDATE orders
SET price = category_price
WHERE order_id = orderId;

RETURN category_price;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `all_transaction`
--

CREATE TABLE `all_transaction`
(
    `transaction_id`   int(11) NOT NULL,
    `employee_id`      int(11) NOT NULL,
    `customer_id`      int(11) NOT NULL,
    `customer_name`    varchar(100) NOT NULL,
    `transaction_type` varchar(45)  NOT NULL,
    `amount`           double       NOT NULL,
    `paid`             tinyint(4) NOT NULL,
    `pay_date`         date         NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `all_transaction`
--

INSERT INTO `all_transaction` (`transaction_id`, `employee_id`, `customer_id`, `customer_name`, `transaction_type`,
                               `amount`, `paid`, `pay_date`)
VALUES (1, 8, 5, '', 'pool', 9000, 1, '2022-10-08'),
       (2, 8, 1, '', 'booking', 17500, 0, '2022-10-08'),
       (3, 8, 2, '', 'food', 8000, 1, '2022-10-06'),
       (4, 8, 3, '', 'booking', 10000, 0, '2022-10-05'),
       (5, 8, 4, '', 'booking', 12000, 1, '2022-10-05');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking`
(
    `booking_id`   int(11) NOT NULL,
    `customer_id`  int(11) DEFAULT NULL,
    `room_type`    int(11) DEFAULT NULL,
    `booking_date` date NOT NULL,
    `period`       int(11) NOT NULL,
    `room_qty`     int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Triggers `booking`
--
DELIMITER
$
CREATE TRIGGER after_booking
    after INSERT
    ON booking

    FOR EACH ROW
BEGIN
    declare room_types int;
  declare booking int;
    declare customer int;
    declare start_date date;
    declare end_date date;
    declare days int;
    declare room_prices double;
    declare roomqty int;
    declare room_num varchar(10);
    declare final double;

    SELECT booking_id, customer_id, room_type, booking_date, period, room_qty
    INTO booking,customer,room_types,start_date,days,roomqty
    FROM hotel_1.booking
    WHERE booking_id = new.booking_id;

    select price
    into room_prices
    from hotel_1.room_type
    where type_id = room_types;

    select room_number
    into room_num
    from hotel_1.room_numbers
    where booked = 0
      AND type_id = room_types LIMIT 1;

    set final=roomqty*room_prices;

  set end_date= DATE_ADD(start_date, INTERVAL days day);

    INSERT INTO hotel_1.room_booking(booking_id, depature_date, arrival_date, qty, room_no, room_price, total,
                                     customer_id)
    values (booking, end_date, start_date, roomqty, room_num, room_prices, final, customer);

    END$

    DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

    CREATE TABLE `customer`
    (
        `customer_id`    int(11) NOT NULL,
        `customer_name`  varchar(100) NOT NULL,
        `customer_mail`  varchar(100) NOT NULL,
        `customer_phone` varchar(15)  NOT NULL,
        `customer_nic`   varchar(20)  NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    --
-- Dumping data for table `customer`
--

    INSERT INTO `customer` (`customer_id`, `customer_name`, `customer_mail`, `customer_phone`, `customer_nic`)
    VALUES (11, 'gayanga', 'gayanga@gmail.com', '0716754234', '981234567v'),
           (12, 'vinod', 'vinod@gmail.com', '0766754234', '981344567v'),
           (13, 'chetana', 'chetanan@gmail.com', '0716754534', '985434567v'),
           (14, 'mudeesha', 'mudeesha@gmail.com', '0756754234', '981278567v'),
           (15, 'amanda', 'amanda@gmail.com', '0726754234', '981231267v'),
           (16, 'pramod', 'pramod@gmail.com', '0716754234', '981288567v'),
           (17, 'dishan', 'dishan@gmail.com', '0766754234', '981564567v'),
           (18, 'tarindu', 'taridu@gmail.com', '0716754534', '985435667v'),
           (19, 'ravidu', 'ravidu@gmail.com', '0756754234', '981278545v'),
           (20, 'nimal', 'nimal@gmail.com', '0726754234', '981231269v');

    -- --------------------------------------------------------

--
-- Table structure for table `employee`
--

    CREATE TABLE `employee`
    (
        `employee_id`       int(11) NOT NULL,
        `employee_name`     varchar(100) NOT NULL,
        `employee_address`  varchar(100) NOT NULL,
        `employee_mail`     varchar(50)  NOT NULL,
        `employee_password` varchar(50)  NOT NULL,
        `employee_phone`    varchar(15)  NOT NULL,
        `job_id`            int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    --
-- Dumping data for table `employee`
--

    INSERT INTO `employee` (`employee_id`, `employee_name`, `employee_address`, `employee_mail`, `employee_password`,
                            `employee_phone`, `job_id`)
    VALUES (7, 'kamal', 'matara', 'kamal@gmail.com', '1234', '0716754234', 12),
           (8, 'nimal', 'matara', 'nimal@gmail.com', '1234', '0766754234', 8),
           (9, 'sunil', 'galle', 'suniln@gmail.com', '1234', '0716754534', 9),
           (10, 'kasun', 'matara', 'kasun@gmail.com', '1234', '0756754234', 10),
           (11, 'vimal', 'galle', 'vimal@gmail.com', '1234', '0726754234', 11);

    -- --------------------------------------------------------

--
-- Table structure for table `employee_pool`
--

    CREATE TABLE `employee_pool`
    (
        `employee_id`      int(11) NOT NULL,
        `date`             date NOT NULL,
        `pool_id`          int(11) DEFAULT NULL,
        `employee_pool_id` int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `employee_restaurant`
--

    CREATE TABLE `employee_restaurant`
    (
        `employee_id`            int(11) NOT NULL,
        `restaurant_id`          int(11) NOT NULL,
        `date`                   date DEFAULT NULL,
        `employee_restaurant_id` int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `employee_room`
--

    CREATE TABLE `employee_room`
    (
        `employee_id`      int(11) NOT NULL,
        `room_no`          int(11) NOT NULL,
        `date`             date NOT NULL,
        `employee_room_id` int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `job_roles`
--

    CREATE TABLE `job_roles`
    (
        `job_id` int(11) NOT NULL,
        `roles`  varchar(45) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    --
-- Dumping data for table `job_roles`
--

    INSERT INTO `job_roles` (`job_id`, `roles`)
    VALUES (7, 'Manager'),
           (8, 'cashiyer'),
           (9, 'chef'),
           (10, 'veters'),
           (11, 'room_boy'),
           (12, 'cleaner');

    -- --------------------------------------------------------

--
-- Stand-in structure for view `mealmenu`
-- (See below for the actual view)
--
    CREATE TABLE `mealmenu`
    (
        `meal_name` varchar(100),
        `price`     double
    );

    -- --------------------------------------------------------

--
-- Table structure for table `meals`
--

    CREATE TABLE `meals`
    (
        `meal_id`   int(11) NOT NULL,
        `meal_name` varchar(100) DEFAULT NULL,
        `price`     double       DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `orders`
--

    CREATE TABLE `orders`
    (
        `order_id`    int(11) NOT NULL,
        `customer_id` int(11) DEFAULT NULL,
        `price`       double DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `order_meals`
--

    CREATE TABLE `order_meals`
    (
        `order_id`      int(11) DEFAULT NULL,
        `meal_id`       int(11) DEFAULT NULL,
        `employee_id`   int(11) DEFAULT NULL,
        `quantity`      int(11) DEFAULT NULL,
        `created_at`    timestamp NOT NULL DEFAULT current_timestamp(),
        `updated_at`    timestamp NOT NULL DEFAULT current_timestamp(),
        `order_meal_id` int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `pool`
--

    CREATE TABLE `pool`
    (
        `pool_id`     int(11) NOT NULL,
        `pool_name`   varchar(45) NOT NULL,
        `pool_status` varchar(45) NOT NULL,
        `pool_prices` int(10) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `pool_transaction`
--

    CREATE TABLE `pool_transaction`
    (
        `id`            int(11) NOT NULL,
        `custemer_name` varchar(100) DEFAULT NULL,
        `price`         double       DEFAULT NULL,
        `date`          date         DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

    CREATE TABLE `restaurant`
    (
        `restaurant_id` int(11) NOT NULL,
        `res_name`      varchar(45) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `room_booking`
--

    CREATE TABLE `room_booking`
    (
        `booking_id`    int(11) NOT NULL,
        `depature_date` date        NOT NULL,
        `arrival_date`  date        NOT NULL,
        `qty`           int(11) NOT NULL,
        `room_no`       varchar(10) NOT NULL,
        `room_price`    double      NOT NULL,
        `total`         int(11) NOT NULL,
        `customer_id`   int(11) NOT NULL,
        `rb_id`         int(11) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    -- --------------------------------------------------------

--
-- Table structure for table `room_numbers`
--

    CREATE TABLE `room_numbers`
    (
        `room_number` varchar(10) NOT NULL,
        `booked`      tinyint(4) NOT NULL,
        `type_id`     varchar(45) DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    --
-- Dumping data for table `room_numbers`
--

    INSERT INTO `room_numbers` (`room_number`, `booked`, `type_id`)
    VALUES ('', 0, ''),
           ('101', 0, '1'),
           ('102', 0, '1'),
           ('103', 0, '1'),
           ('104', 0, '1'),
           ('105', 0, '1'),
           ('106', 0, '2'),
           ('107', 0, '2'),
           ('108', 0, '2'),
           ('109', 0, '2'),
           ('110', 0, '2'),
           ('111', 0, '3'),
           ('112', 0, '3'),
           ('113', 0, '3'),
           ('114', 0, '3'),
           ('115', 0, '3'),
           ('116', 0, '4'),
           ('117', 0, '4'),
           ('118', 0, '4'),
           ('119', 0, '4'),
           ('120', 0, '4'),
           ('121', 0, '5'),
           ('122', 0, '5'),
           ('123', 0, '5'),
           ('124', 0, '5'),
           ('125', 0, '5');

    -- --------------------------------------------------------

--
-- Stand-in structure for view `room_prices`
-- (See below for the actual view)
--
    CREATE TABLE `room_prices`
    (
        `variety` varchar(25),
        `price`   double
    );

    -- --------------------------------------------------------

--
-- Table structure for table `room_type`
--

    CREATE TABLE `room_type`
    (
        `type_id` int(11) NOT NULL,
        `image`   blob DEFAULT NULL,
        `variety` varchar(25) NOT NULL,
        `qty`     int(11) NOT NULL,
        `price`   double      NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

    --
-- Dumping data for table `room_type`
--

    INSERT INTO `room_type` (`type_id`, `image`, `variety`, `qty`, `price`)
    VALUES (1, '', 'vip', 5, 10000),
           (2, '', 'luxury', 5, 7000),
           (3, '', 'double', 5, 5000),
           (4, '', 'single', 5, 3000),
           (5, '', 'family', 5, 6000);

    -- --------------------------------------------------------

--
-- Structure for view `mealmenu`
--
    DROP TABLE IF EXISTS `mealmenu`;

    CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mealmenu`  AS
    SELECT `meals`.`meal_name` AS `meal_name`, `meals`.`price` AS `price` FROM `meals`;

    -- --------------------------------------------------------

--
-- Structure for view `room_prices`
--
    DROP TABLE IF EXISTS `room_prices`;

    CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `room_prices`  AS
    SELECT `room_type`.`variety` AS `variety`, `room_type`.`price` AS `price` FROM `room_type`;

    --
-- Indexes for dumped tables
--

--
-- Indexes for table `all_transaction`
--
    ALTER TABLE `all_transaction`
        ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `employee_id` (`employee_id`);

    --
-- Indexes for table `booking`
--
    ALTER TABLE `booking`
        ADD PRIMARY KEY (`booking_id`),
  ADD KEY `room_type` (`room_type`),
  ADD KEY `booking_ibfk_2` (`customer_id`);

    --
-- Indexes for table `customer`
--
    ALTER TABLE `customer`
        ADD PRIMARY KEY (`customer_id`);

    --
-- Indexes for table `employee`
--
    ALTER TABLE `employee`
        ADD PRIMARY KEY (`employee_id`),
  ADD KEY `job_id` (`job_id`);

    --
-- Indexes for table `employee_pool`
--
    ALTER TABLE `employee_pool`
        ADD PRIMARY KEY (`employee_pool_id`),
  ADD KEY `employee_id` (`employee_id`),
  ADD KEY `pool_id` (`pool_id`);

    --
-- Indexes for table `employee_restaurant`
--
    ALTER TABLE `employee_restaurant`
        ADD PRIMARY KEY (`employee_restaurant_id`),
  ADD KEY `employee_id` (`employee_id`),
  ADD KEY `restaurant_id` (`restaurant_id`);

    --
-- Indexes for table `employee_room`
--
    ALTER TABLE `employee_room`
        ADD PRIMARY KEY (`employee_room_id`);

    --
-- Indexes for table `job_roles`
--
    ALTER TABLE `job_roles`
        ADD PRIMARY KEY (`job_id`);

    --
-- Indexes for table `meals`
--
    ALTER TABLE `meals`
        ADD PRIMARY KEY (`meal_id`);

    --
-- Indexes for table `orders`
--
    ALTER TABLE `orders`
        ADD PRIMARY KEY (`order_id`),
  ADD KEY `customer_id` (`customer_id`);

    --
-- Indexes for table `order_meals`
--
    ALTER TABLE `order_meals`
        ADD PRIMARY KEY (`order_meal_id`),
  ADD KEY `order_id` (`order_id`),
  ADD KEY `meal_id` (`meal_id`),
  ADD KEY `employee_id` (`employee_id`);

    --
-- Indexes for table `pool`
--
    ALTER TABLE `pool`
        ADD PRIMARY KEY (`pool_id`);

    --
-- Indexes for table `pool_transaction`
--
    ALTER TABLE `pool_transaction`
        ADD PRIMARY KEY (`id`);

    --
-- Indexes for table `restaurant`
--
    ALTER TABLE `restaurant`
        ADD PRIMARY KEY (`restaurant_id`);

    --
-- Indexes for table `room_booking`
--
    ALTER TABLE `room_booking`
        ADD PRIMARY KEY (`rb_id`),
  ADD KEY `booking_id` (`booking_id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `room_booking_ibfk_4` (`room_no`);

    --
-- Indexes for table `room_numbers`
--
    ALTER TABLE `room_numbers`
        ADD PRIMARY KEY (`room_number`);

    --
-- Indexes for table `room_type`
--
    ALTER TABLE `room_type`
        ADD PRIMARY KEY (`type_id`);

    --
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `all_transaction`
--
    ALTER TABLE `all_transaction`
        MODIFY `transaction_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

    --
-- AUTO_INCREMENT for table `booking`
--
    ALTER TABLE `booking`
        MODIFY `booking_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

    --
-- AUTO_INCREMENT for table `customer`
--
    ALTER TABLE `customer`
        MODIFY `customer_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

    --
-- AUTO_INCREMENT for table `employee`
--
    ALTER TABLE `employee`
        MODIFY `employee_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

    --
-- AUTO_INCREMENT for table `employee_pool`
--
    ALTER TABLE `employee_pool`
        MODIFY `employee_pool_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `employee_restaurant`
--
    ALTER TABLE `employee_restaurant`
        MODIFY `employee_restaurant_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `employee_room`
--
    ALTER TABLE `employee_room`
        MODIFY `employee_room_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `job_roles`
--
    ALTER TABLE `job_roles`
        MODIFY `job_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

    --
-- AUTO_INCREMENT for table `meals`
--
    ALTER TABLE `meals`
        MODIFY `meal_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

    --
-- AUTO_INCREMENT for table `orders`
--
    ALTER TABLE `orders`
        MODIFY `order_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

    --
-- AUTO_INCREMENT for table `order_meals`
--
    ALTER TABLE `order_meals`
        MODIFY `order_meal_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `pool`
--
    ALTER TABLE `pool`
        MODIFY `pool_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

    --
-- AUTO_INCREMENT for table `pool_transaction`
--
    ALTER TABLE `pool_transaction`
        MODIFY `id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

    --
-- AUTO_INCREMENT for table `restaurant`
--
    ALTER TABLE `restaurant`
        MODIFY `restaurant_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `room_booking`
--
    ALTER TABLE `room_booking`
        MODIFY `rb_id` int (11) NOT NULL AUTO_INCREMENT;

    --
-- AUTO_INCREMENT for table `room_type`
--
    ALTER TABLE `room_type`
        MODIFY `type_id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

    --
-- Constraints for dumped tables
--

--
-- Constraints for table `all_transaction`
--
    ALTER TABLE `all_transaction`
        ADD CONSTRAINT `all_transaction_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`);

    --
-- Constraints for table `booking`
--
    ALTER TABLE `booking`
        ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`room_type`) REFERENCES `room_type` (`type_id`),
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

    --
-- Constraints for table `employee`
--
    ALTER TABLE `employee`
        ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`job_id`) REFERENCES `job_roles` (`job_id`);

    --
-- Constraints for table `employee_pool`
--
    ALTER TABLE `employee_pool`
        ADD CONSTRAINT `employee_pool_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  ADD CONSTRAINT `employee_pool_ibfk_2` FOREIGN KEY (`pool_id`) REFERENCES `pool` (`pool_id`);

    --
-- Constraints for table `employee_restaurant`
--
    ALTER TABLE `employee_restaurant`
        ADD CONSTRAINT `employee_restaurant_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  ADD CONSTRAINT `employee_restaurant_ibfk_2` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`restaurant_id`);

    --
-- Constraints for table `orders`
--
    ALTER TABLE `orders`
        ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

    --
-- Constraints for table `order_meals`
--
    ALTER TABLE `order_meals`
        ADD CONSTRAINT `order_meals_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  ADD CONSTRAINT `order_meals_ibfk_2` FOREIGN KEY (`meal_id`) REFERENCES `meals` (`meal_id`),
  ADD CONSTRAINT `order_meals_ibfk_3` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`);

    --
-- Constraints for table `room_booking`
--
    ALTER TABLE `room_booking`
        ADD CONSTRAINT `room_booking_ibfk_2` FOREIGN KEY (`booking_id`) REFERENCES `booking` (`booking_id`),
  ADD CONSTRAINT `room_booking_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  ADD CONSTRAINT `room_booking_ibfk_4` FOREIGN KEY (`room_no`) REFERENCES `room_numbers` (`room_number`);
    COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
