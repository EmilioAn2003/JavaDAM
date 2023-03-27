-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 27-03-2023 a las 05:04:58
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
-- Base de datos: `BContactos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TContactos`
--

CREATE TABLE `TContactos` (
  `IdContacto` int(50) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `TContactos`
--

INSERT INTO `TContactos` (`IdContacto`, `Nombre`, `Apellido`) VALUES
(1, 'Luis', 'Sanchez'),
(2, 'Cesar', 'Ruiz'),
(3, 'Juan', 'Garcia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TEtiquetas`
--

CREATE TABLE `TEtiquetas` (
  `IdEtiqueta` int(50) NOT NULL,
  `Etiqueta` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `TEtiquetas`
--

INSERT INTO `TEtiquetas` (`IdEtiqueta`, `Etiqueta`) VALUES
(1, 'Móvil'),
(2, 'Fijo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TTelefonos`
--

CREATE TABLE `TTelefonos` (
  `Telefono` varchar(20) NOT NULL,
  `IdContacto` int(50) NOT NULL,
  `IdEtiqueta` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `TTelefonos`
--

INSERT INTO `TTelefonos` (`Telefono`, `IdContacto`, `IdEtiqueta`) VALUES
('612 34 56 78', 1, 1),
('622 34 56 78', 2, 1),
('868 34 56 78', 3, 2),
('968 34 56 78', 2, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `TContactos`
--
ALTER TABLE `TContactos`
  ADD PRIMARY KEY (`IdContacto`);

--
-- Indices de la tabla `TEtiquetas`
--
ALTER TABLE `TEtiquetas`
  ADD PRIMARY KEY (`IdEtiqueta`);

--
-- Indices de la tabla `TTelefonos`
--
ALTER TABLE `TTelefonos`
  ADD PRIMARY KEY (`Telefono`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `TContactos`
--
ALTER TABLE `TContactos`
  MODIFY `IdContacto` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `TEtiquetas`
--
ALTER TABLE `TEtiquetas`
  MODIFY `IdEtiqueta` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
