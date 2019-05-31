-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2018 at 10:11 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `User_Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`User_Name`, `Password`) VALUES
('Shafin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `attandance`
--

CREATE TABLE `attandance` (
  `Name` varchar(30) NOT NULL,
  `Class` varchar(10) NOT NULL,
  `Day1` varchar(10) NOT NULL,
  `Day2` varchar(10) NOT NULL,
  `Day3` varchar(10) NOT NULL,
  `Day4` varchar(10) NOT NULL,
  `Day5` varchar(10) NOT NULL,
  `Day6` varchar(10) NOT NULL,
  `Day7` varchar(10) NOT NULL,
  `Day8` varchar(10) NOT NULL,
  `Day9` varchar(10) NOT NULL,
  `Day10` varchar(10) NOT NULL,
  `Day11` varchar(10) NOT NULL,
  `Day12` varchar(10) NOT NULL,
  `Day13` varchar(10) NOT NULL,
  `Day14` varchar(10) NOT NULL,
  `Day15` varchar(10) NOT NULL,
  `Day16` varchar(10) NOT NULL,
  `Day17` varchar(10) NOT NULL,
  `Day18` varchar(10) NOT NULL,
  `Day19` varchar(10) NOT NULL,
  `Day20` varchar(10) NOT NULL,
  `Day21` varchar(10) NOT NULL,
  `Day22` varchar(10) NOT NULL,
  `Day23` varchar(10) NOT NULL,
  `Day24` varchar(10) NOT NULL,
  `Day25` varchar(10) NOT NULL,
  `Day26` varchar(10) NOT NULL,
  `Day27` varchar(10) NOT NULL,
  `Day28` varchar(10) NOT NULL,
  `Day29` varchar(10) NOT NULL,
  `Day30` varchar(10) NOT NULL,
  `Day31` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attandance`
--

INSERT INTO `attandance` (`Name`, `Class`, `Day1`, `Day2`, `Day3`, `Day4`, `Day5`, `Day6`, `Day7`, `Day8`, `Day9`, `Day10`, `Day11`, `Day12`, `Day13`, `Day14`, `Day15`, `Day16`, `Day17`, `Day18`, `Day19`, `Day20`, `Day21`, `Day22`, `Day23`, `Day24`, `Day25`, `Day26`, `Day27`, `Day28`, `Day29`, `Day30`, `Day31`) VALUES
('abir', '', 'p', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Raju', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Riajul', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Arafat', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Aji', '5', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `employee_info`
--

CREATE TABLE `employee_info` (
  `ID` varchar(20) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `Position` varchar(50) NOT NULL,
  `Mobile` varchar(50) NOT NULL,
  `Gander` varchar(50) NOT NULL,
  `Parmanenet_Address` varchar(50) NOT NULL,
  `Present_Address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_info`
--

INSERT INTO `employee_info` (`ID`, `First_Name`, `Last_Name`, `Position`, `Mobile`, `Gander`, `Parmanenet_Address`, `Present_Address`) VALUES
('1001', 'as', 'as', 'as', 'as', 'Female', 'as', 'sd'),
('45', 'Latif', 'Mia', 'caretaker', '11332', 'Male', 'Dhaka', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `Roll` varchar(20) NOT NULL,
  `First_Name` varchar(30) NOT NULL,
  `Last_Name` varchar(30) NOT NULL,
  `class` varchar(20) NOT NULL,
  `Year` varchar(20) NOT NULL,
  `Birthday` varchar(30) NOT NULL,
  `Moblile` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Parmanent_Address` varchar(50) NOT NULL,
  `Present_Address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`Roll`, `First_Name`, `Last_Name`, `class`, `Year`, `Birthday`, `Moblile`, `Gender`, `Parmanent_Address`, `Present_Address`) VALUES
('02', 'Nibir', 'Khan', '9', '2018', '9 December', '56656564', 'Male', 'Uttora,Dhaka', 'Uttora,Dhaka'),
('03', 'Kazi', 'Abir', '9', '2018', '20 February 2001', '54546', 'Male', 'Mohammadpur,Dhaka', 'Mohammadpur,Dhaka'),
('04', 'Arafat', 'Ullah', '9', '2018', '02 February 2001', '54546', 'Male', 'Dhanmondi,Dhaka', 'Dhanmondi,Dhaka'),
('05', 'Newaz ', 'Ahmed', '9', '2018', '02 March 2001', '54546', 'Male', 'Uttora,Dhaka', 'Uttora,Dhaka'),
('6', 'Omar', 'Faruk', '9', '2018', '5 october 2001', '56644', 'Male', 'mohammadpur,Dhaka', 'mohammadpur,Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_info`
--

CREATE TABLE `teacher_info` (
  `T_id` varchar(100) NOT NULL,
  `First_name` varchar(100) NOT NULL,
  `Last_name` varchar(100) NOT NULL,
  `Position` varchar(100) NOT NULL,
  `Birthday` varchar(100) NOT NULL,
  `Mobile` varchar(100) NOT NULL,
  `Sex` varchar(100) NOT NULL,
  `Per_Address` varchar(100) NOT NULL,
  `Par_Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_info`
--

INSERT INTO `teacher_info` (`T_id`, `First_name`, `Last_name`, `Position`, `Birthday`, `Mobile`, `Sex`, `Per_Address`, `Par_Address`) VALUES
('02', 'Kabir', 'Khan', 'Teacher', '5 january', '59598', 'Male', 'Dhaka', 'Dhaka'),
('1001', 'MD.Rakib', 'Hasan', 'Senior Teacher', '5 January', '665445', 'Male', 'Farmgate,Dhaka', 'Farmgate,Dhaka'),
('1002', 'Will ', 'Smith', 'Teacher', '20 january 1980', '2156565', 'Male', 'America', 'America'),
('1003', 'Kamal', 'Uddin', 'Assistant  Head', '5 January ', '5554477', 'Male', 'Farmgate,Dhaka', 'Farmgate,Dhaka'),
('156', 's', 'ss', 's', 's', 's', 'Male', 's', 's');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_info`
--
ALTER TABLE `employee_info`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`Roll`);

--
-- Indexes for table `teacher_info`
--
ALTER TABLE `teacher_info`
  ADD PRIMARY KEY (`T_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
