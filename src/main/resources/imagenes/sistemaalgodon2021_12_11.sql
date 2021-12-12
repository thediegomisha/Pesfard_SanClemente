-- phpMyAdmin SQL Dump
-- version 4.6.6deb5ubuntu0.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 11-12-2021 a las 19:25:33
-- Versión del servidor: 5.7.36-0ubuntu0.18.04.1
-- Versión de PHP: 7.2.24-0ubuntu0.18.04.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaalgodon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acopiador`
--

CREATE TABLE `acopiador` (
  `idacopiador` int(11) NOT NULL,
  `codigo_acopiador` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agricultor`
--

CREATE TABLE `agricultor` (
  `idagricultor` int(11) NOT NULL,
  `codigo_agricultor` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idpersona` int(11) NOT NULL,
  `razon_social` varchar(45) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  `codigo_cliente` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `idconductor` int(11) NOT NULL,
  `placa` varchar(45) DEFAULT NULL,
  `codigo_conductor` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombre1` varchar(45) DEFAULT NULL,
  `apaterno` varchar(45) DEFAULT NULL,
  `amaterno` varchar(45) DEFAULT NULL,
  `tipo_documento` int(11) NOT NULL,
  `numdoc` varchar(20) DEFAULT NULL,
  `sexo` int(11) NOT NULL,
  `fecha_nac` date DEFAULT NULL,
  `telefono` varchar(25) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre1`, `apaterno`, `amaterno`, `tipo_documento`, `numdoc`, `sexo`, `fecha_nac`, `telefono`, `email`, `direccion`) VALUES
(1, 'Juan Luis', 'Diaz', 'Aylas', 1, '40383794', 1, NULL, '995028406', 'juludiaz@gmail.com', NULL),
(2, 'Jennifer Andrea', 'Siclla', 'Torres', 1, '44195570', 2, NULL, '985683449', 'jeandreasito@gmail.com', NULL),
(3, 'Andrea Anais', 'Diaz', 'Siclla', 1, '009877667', 2, NULL, '341234', 'nanayis@gmail.com', NULL),
(4, 'Juan Diego Alexander', 'Diaz', 'Siclla', 1, '02020202', 1, NULL, 'eafwerf', 'juandead@gmail.com', NULL),
(5, 'Dominic Mikhail', 'Diaz', 'Siclla', 1, '56436363', 1, NULL, '2452454', 'themisha@gmail.com', NULL),
(6, 'Gabriela Natali', 'Siclla', 'Torres', 1, '7687687687', 2, NULL, '9898989', 'jojooj-k,l', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE `sexo` (
  `idsexo` int(11) NOT NULL,
  `tipo_sexo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sexo`
--

INSERT INTO `sexo` (`idsexo`, `tipo_sexo`) VALUES
(1, 'M'),
(2, 'F');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket_pesaje`
--

CREATE TABLE `ticket_pesaje` (
  `idticketpesaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE `tipodocumento` (
  `idtipodoc` int(11) NOT NULL,
  `nombredocumento` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=8192 DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipodocumento`
--

INSERT INTO `tipodocumento` (`idtipodoc`, `nombredocumento`) VALUES
(1, 'DNI'),
(2, 'RUC'),
(3, 'BREVETE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `idtipo_usuario` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`idtipo_usuario`, `nombre`) VALUES
(1, 'Administrador'),
(2, 'Digitador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `sueldo` double DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `tipo_usuario` int(11) NOT NULL,
  `codigo_usuario` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `sueldo`, `login`, `password`, `estado`, `tipo_usuario`, `codigo_usuario`) VALUES
(1, NULL, 'theathoq', 'jojolete', 'Activo', 1, NULL),
(2, NULL, 'jeandrea', 'jojolete', 'Activo', 2, NULL),
(3, NULL, 'nanayis', 'jojolete', 'Activo', 1, NULL),
(4, NULL, 'juandead', 'jojolete', 'Activo', 1, NULL),
(5, NULL, 'themisha', 'jojolete', 'Activo', 2, NULL),
(6, NULL, 'hjkjhj', 'jñkjl', 'Inactivo', 2, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acopiador`
--
ALTER TABLE `acopiador`
  ADD PRIMARY KEY (`idacopiador`);

--
-- Indices de la tabla `agricultor`
--
ALTER TABLE `agricultor`
  ADD PRIMARY KEY (`idagricultor`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`idconductor`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`,`tipo_documento`,`sexo`),
  ADD KEY `fk_persona_tipodocumento1_idx` (`tipo_documento`),
  ADD KEY `fk_persona_sexo1_idx` (`sexo`);

--
-- Indices de la tabla `sexo`
--
ALTER TABLE `sexo`
  ADD PRIMARY KEY (`idsexo`);

--
-- Indices de la tabla `ticket_pesaje`
--
ALTER TABLE `ticket_pesaje`
  ADD PRIMARY KEY (`idticketpesaje`);

--
-- Indices de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  ADD PRIMARY KEY (`idtipodoc`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`idtipo_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`,`tipo_usuario`),
  ADD KEY `fk_usuario_tipo_usuario1_idx` (`tipo_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `sexo`
--
ALTER TABLE `sexo`
  MODIFY `idsexo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `ticket_pesaje`
--
ALTER TABLE `ticket_pesaje`
  MODIFY `idticketpesaje` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  MODIFY `idtipodoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `idtipo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `acopiador`
--
ALTER TABLE `acopiador`
  ADD CONSTRAINT `fk_acopiador_1` FOREIGN KEY (`idacopiador`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `agricultor`
--
ALTER TABLE `agricultor`
  ADD CONSTRAINT `fk_agricultor_1` FOREIGN KEY (`idagricultor`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `FK_cliente_idpersona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION;

--
-- Filtros para la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD CONSTRAINT `fk_conductor_1` FOREIGN KEY (`idconductor`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_persona_sexo1` FOREIGN KEY (`sexo`) REFERENCES `sexo` (`idsexo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_persona_tipodocumento1` FOREIGN KEY (`tipo_documento`) REFERENCES `tipodocumento` (`idtipodoc`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario1` FOREIGN KEY (`idusuario`) REFERENCES `persona` (`idpersona`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_usuario_tipo_usuario1` FOREIGN KEY (`tipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
