-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 22 nov. 2021 à 04:29
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gesetablissement`
--

-- --------------------------------------------------------

--
-- Structure de la table `cour`
--

DROP TABLE IF EXISTS `cour`;
CREATE TABLE IF NOT EXISTS `cour` (
  `code_matiere` int(20) NOT NULL,
  `id_professeur` int(20) NOT NULL,
  `numero_salle` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `cour`
--

INSERT INTO `cour` (`code_matiere`, `id_professeur`, `numero_salle`) VALUES
(1, 5, 3),
(1, 5, 3),
(1, 5, 3),
(1, 5, 3),
(4, 5, 3),
(1, 5, 3),
(4, 5, 3),
(1, 5, 3),
(4, 5, 3);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `nom`, `prenom`) VALUES
(1, 'Thiam', 'Djibril'),
(2, 'Ngom', 'Fallou'),
(3, 'Leye', 'Habib'),
(4, 'Faye', 'Daouda'),
(9, 'Sarr', 'Henriette'),
(5, 'Diallo', 'Bintou'),
(7, 'Gueye', 'Jean Pierre'),
(6, 'Diop', 'Rokhaya'),
(8, 'Ndoye', 'Maty');

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

DROP TABLE IF EXISTS `matiere`;
CREATE TABLE IF NOT EXISTS `matiere` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) NOT NULL,
  `coef` int(5) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`code`, `libelle`, `coef`) VALUES
(1, 'Math', 6),
(2, 'Physique', 5),
(3, 'Informatique', 3),
(4, 'SVT', 4),
(5, 'Economie Generale', 5);

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

DROP TABLE IF EXISTS `professeur`;
CREATE TABLE IF NOT EXISTS `professeur` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `grade` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `professeur`
--

INSERT INTO `professeur` (`id`, `nom`, `prenom`, `grade`) VALUES
(1, 'Mbodje', 'Alioune Badara', 3),
(2, 'Dieng', 'Lamine', 5),
(3, 'Tavarez', 'Elisabeth', 4),
(4, 'Sall', 'Olivier Bernard', 3);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `numero` int(10) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) NOT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`numero`, `libelle`) VALUES
(1, 'SMLU'),
(2, 'MSTG'),
(4, 'TECH'),
(5, 'LABO'),
(6, 'TECH');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
