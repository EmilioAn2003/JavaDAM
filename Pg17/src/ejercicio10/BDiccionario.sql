-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-03-2023 a las 21:51:37
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `BDiccionario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TPalabras`
--

CREATE TABLE `TPalabras` (
  `Id` int(50) NOT NULL,
  `Espanyol` varchar(20) NOT NULL,
  `Ingles` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `TPalabras`
--

INSERT INTO `TPalabras` (`Id`, `Espanyol`, `Ingles`) VALUES
(4, 'ROJO', 'RED'),
(5, 'AZUL', 'BLUE'),
(6, 'VERDE', 'GREEN'),
(7, 'ROSADO', 'PINK'),
(8, 'NEGRO', 'BLACK'),
(9, 'AMARILLO', 'YELLOW'),
(10, 'CELESTE', 'SKY BLUE'),
(11, 'NARANJA', 'ORANGE'),
(12, 'MARRON', 'BROWN'),
(13, 'BLANCO', 'WHITE');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `TPalabras`
--
ALTER TABLE `TPalabras`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `TPalabras`
--
ALTER TABLE `TPalabras`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
