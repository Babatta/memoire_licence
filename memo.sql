-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 20 mars 2022 à 12:35
-- Version du serveur :  5.7.19
-- Version de PHP :  7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `memo`
--

-- --------------------------------------------------------

--
-- Structure de la table `abonne`
--

DROP TABLE IF EXISTS `abonne`;
CREATE TABLE IF NOT EXISTS `abonne` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `blocked` int(11) DEFAULT '1',
  `avisContrat` int(11) DEFAULT '0',
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `abonne`
--

INSERT INTO `abonne` (`idUser`, `blocked`, `avisContrat`) VALUES
(5, 0, 1),
(7, 0, 1),
(6, 0, 1),
(19, 0, 1),
(20, 1, 1),
(22, 0, 1),
(23, 0, 1),
(24, 0, 1),
(25, 0, 1),
(27, 0, 1),
(28, 0, 1),
(29, 0, 1),
(31, 0, 0),
(33, 1, 1),
(38, 1, 1),
(47, 0, 1),
(44, 0, 1),
(45, 0, 1),
(73, 1, 0),
(75, 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `abonnement`
--

DROP TABLE IF EXISTS `abonnement`;
CREATE TABLE IF NOT EXISTS `abonnement` (
  `idAbonne` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `prenom` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `adresse` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `etat` int(11) DEFAULT '0',
  `avisContrat` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAbonne`)
) ENGINE=MyISAM AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `abonnement`
--

INSERT INTO `abonnement` (`idAbonne`, `nom`, `prenom`, `email`, `adresse`, `tel`, `etat`, `avisContrat`) VALUES
(2, 'Ndiaye', 'Dior', 'dior@gmail.com', 'Parcellle', 339087645, 1, 1),
(3, 'BA', 'Oumar', 'oumar@gmail.com', 'Mbour', 779849235, 1, 1),
(4, 'Diouf', 'Ouleye', 'diouf@gmail.com', 'fouta', 332567812, 1, 1),
(5, 'SY', 'SOPHIE', 'sy@gmail.com', 'Dakar', 770934651, 1, 1),
(6, 'Diallo', 'babacar', 'gorgui@gmail.co', 'Rufisque', 764576123, 1, 1),
(7, 'BA', 'Serigne mor', 'serignemor93@gmail.com', 'Keur Massar', 773123189, 1, 1),
(8, 'Diallo', 'Demba', 'diallo@gmail.com', 'Rufisque', 773476512, 1, 1),
(9, 'Web', 'Mor', 'mor@gmail.com', 'Thies', 763456789, 1, 1),
(12, 'Ndiaye', 'Amadou', 'am@gmail.com', 'Mermoz', 766542315, 1, 1),
(13, 'Faye', 'MariÃ©me', 'marieme@gmail.com', 'Louga', 766124957, 1, 1),
(14, 'CissÃ©', 'Cheikh Yankhoba', 'cheikh@gmail.com', 'Rufisque', 762356488, 1, 1),
(15, 'Thiombane', 'Ousmane', 'thio@gmail.com', 'Dakar', 775642879, 1, 1),
(16, 'Camara', 'PathÃ©', 'cam@gmail.com', 'ThiÃ©s', 760321654, 1, 1),
(17, 'Diop', 'Momath', 'momath@gmail.com', 'Saint-Louis', 705463214, 1, 1),
(18, 'Sarr', 'Cheikh Niang', 'heush@gmail.com', 'Rufisque', 703265498, 1, 1),
(19, 'Ba', 'Adja Batta', 'adja@gmail.com', 'Keur Massar', 708649521, 1, 1),
(20, 'Diallo', 'Demba', 'demba@gmail.com', 'Rufisque', 775648792, 1, 1),
(23, 'Balde', 'Fatoumata', 'fatou@gmail.com', 'Dakar', 762365487, 1, 1),
(26, 'Kane', 'Hamidou', 'ham@gmail.com', 'Louga', 767896542, 1, 1),
(27, 'Coulibaly', 'Diarra', 'diarra@gmail.com', 'Pikine', 775231654, 1, 1),
(28, 'BaldÃ©', 'Fatoumata', 'fatou@gmail.com', 'Dakar', 775469287, 1, 1),
(29, 'Ndione', 'Babacar', 'Yabonn@gmail.com', 'Tatene sÃ©rerr', 761234567, 1, 1),
(33, 'Gaye', 'Amadou', 'ame@gmail.com', 'Thiaroy', 765623668, 1, 1),
(31, 'Samb', 'Boubacar', 'boubs@gmail.com', 'Ziguinchor', 766525898, 1, 1),
(35, 'Camara', 'Thiemokho', 'thie@gmail.com', 'Kaolack', 703646176, 1, 1),
(36, 'Ndione', 'Fatou', 'lafatou@gmail.com', 'Thies', 762365498, 0, NULL),
(38, 'Diouf', 'Aissatou', 'aissa@gmail.com', 'Pikine', 701236548, 0, NULL),
(39, 'Ndiaye', 'Samba', 'samba@gmail.com', 'Kedougou', 766564802, 0, NULL),
(40, 'Ndong', 'Patricia', 'paty@gmail.com', 'Keur Massar', 706564892, 0, NULL),
(41, 'Gueye', 'Seydi Ababacar', 'babacar@gmail.com', 'Kaolack', 705638145, 0, NULL),
(42, 'Sarr', 'Pape Modou Diouf', 'moda@gmail.com', 'Thies', 778693036, 0, NULL),
(43, 'Gaye', 'Amadou', 'ame95@gmail.com', 'Thiaroy', 763646176, 0, NULL),
(44, 'Diaw', 'Mafaye', 'maf95@gmail.com', 'Ouakam', 765964213, 0, NULL),
(45, 'TraorÃ©', 'Bamba', 'bamba@gmail.com', 'Pikine', 765632145, 0, NULL),
(46, 'BÃ©anquinch', 'PÃ©na Claire', 'pena@gmail.com', 'Keur Massar', 765632145, 0, NULL),
(47, 'Dia', 'Fatim Daour', 'fatimdaour95@gmail.com', 'Keur Massar', 765632145, 0, NULL),
(48, 'Dione', 'Babacar', 'baba@gmail.com', 'Thies', 706564892, 0, NULL),
(49, 'Bangoumana', 'Benis', 'benis95@gmail.com', 'Dakar', 773646176, 0, NULL),
(50, 'Diallo', 'Khadija', 'khady@gmail.com', 'Saint-Louis', 705964213, 0, NULL),
(51, 'Mendy', 'Mame Coumba Emilie', 'emilie@gmail.com', 'Grand Yoff', 766564892, 1, NULL),
(52, 'Faye', 'Mamadou', 'mamadou@gmail.com', 'Dakar', 776221545, 1, 1),
(54, 'ManÃ©', 'Sadio', 'sadio@gmail.com', 'Ziguinchor', 706564892, 1, 0),
(55, 'Ndiaye', 'Samba', 'samba@gmail.com', 'Thies', 763646176, 1, 0),
(56, 'Sarr', 'Mamadou', 'momo@gmail.com', 'Rufisque', 766221545, 1, 0),
(57, 'Diallo', 'Younouss', 'sagna@gmail.com', 'Rufisque', 774576123, 0, 1);

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`idUser`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Structure de la table `batiment`
--

DROP TABLE IF EXISTS `batiment`;
CREATE TABLE IF NOT EXISTS `batiment` (
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL AUTO_INCREMENT,
  `nomBatiment` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idZone`,`idBatiment`),
  UNIQUE KEY `BATIMENT_PK` (`idZone`,`idBatiment`),
  KEY `LOCALISER_FK` (`idZone`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `batiment`
--

INSERT INTO `batiment` (`idZone`, `idBatiment`, `nomBatiment`) VALUES
(1, 2, 'Batiment B'),
(1, 3, 'Bloc des intelligences'),
(1, 4, 'Bloc des possibles'),
(1, 5, 'pgsup'),
(2, 1, 'Salle des fetes'),
(7, 1, 'Dakar Arena');

-- --------------------------------------------------------

--
-- Structure de la table `consommation`
--

DROP TABLE IF EXISTS `consommation`;
CREATE TABLE IF NOT EXISTS `consommation` (
  `idConsommation` int(11) NOT NULL AUTO_INCREMENT,
  `idObjet` int(11) NOT NULL,
  `dateDebut` bigint(20) DEFAULT NULL,
  `dateFin` bigint(20) DEFAULT NULL,
  `energie` float DEFAULT NULL,
  PRIMARY KEY (`idConsommation`),
  UNIQUE KEY `CONSOMMATION_PK` (`idConsommation`),
  KEY `FAIRE_FK` (`idObjet`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `consommation`
--

INSERT INTO `consommation` (`idConsommation`, `idObjet`, `dateDebut`, `dateFin`, `energie`) VALUES
(1, 7, 3564879521, 3564899514, 396),
(2, 6, 2315872654, 3215648795, 194),
(3, 6, 1239568124, 2654821357, 172),
(4, 7, 5436215642, 9216348276, 520);

-- --------------------------------------------------------

--
-- Structure de la table `localisation`
--

DROP TABLE IF EXISTS `localisation`;
CREATE TABLE IF NOT EXISTS `localisation` (
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL,
  `idLocalisation` int(11) NOT NULL AUTO_INCREMENT,
  `typeLocalisation` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `nomLocalisation` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idZone`,`idBatiment`,`idLocalisation`),
  UNIQUE KEY `LOCALISATION_PK` (`idZone`,`idBatiment`,`idLocalisation`),
  KEY `CONTENIR_FK` (`idZone`,`idBatiment`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `localisation`
--

INSERT INTO `localisation` (`idZone`, `idBatiment`, `idLocalisation`, `typeLocalisation`, `nomLocalisation`) VALUES
(1, 1, 1, 'Salle', 'Toilette 1'),
(5, 3, 1, 'Couloir', 'Couloir 1'),
(2, 1, 1, 'salle', 'Cuisine'),
(1, 1, 2, 'salle', 'cafetaria'),
(7, 1, 1, 'Salle', 'Vestiaires'),
(1, 2, 1, 'Salle', 'Salle B26'),
(1, 2, 2, 'Salle', 'Salle8'),
(1, 3, 1, 'complexe', 'Couloir12');

-- --------------------------------------------------------

--
-- Structure de la table `objet`
--

DROP TABLE IF EXISTS `objet`;
CREATE TABLE IF NOT EXISTS `objet` (
  `idObjet` int(11) NOT NULL AUTO_INCREMENT,
  `idZone` int(11) NOT NULL,
  `idBatiment` int(11) NOT NULL,
  `idLocalisation` int(11) NOT NULL,
  `idStation` int(11) NOT NULL,
  `idUser` int(11) DEFAULT NULL,
  `nomObjet` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `type` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `voltage` float DEFAULT NULL,
  `connectivite` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `etat` int(5) DEFAULT '0',
  PRIMARY KEY (`idObjet`),
  UNIQUE KEY `OBJET_PK` (`idObjet`),
  KEY `COMMUNIQUER_FK` (`idStation`),
  KEY `EQUIPER_FK` (`idZone`,`idBatiment`,`idLocalisation`),
  KEY `AVOIR_FK` (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `objet`
--

INSERT INTO `objet` (`idObjet`, `idZone`, `idBatiment`, `idLocalisation`, `idStation`, `idUser`, `nomObjet`, `type`, `voltage`, `connectivite`, `etat`) VALUES
(16, 7, 1, 1, 5, 31, 'Ventilateur', 'Simple', 260, 'oui', 0),
(1, 5, 3, 1, 2, 39, 'Lampe', 'chepas', 45, 'Oui', 0),
(2, 5, 3, 1, 2, 39, 'Ventilateur', 'chepas', 160, 'Oui', 0),
(6, 7, 1, 1, 3, 31, 'Lampe 1', 'chepas', 105, 'Oui', 0),
(11, 7, 1, 1, 3, 31, 'Lampe 2', 'chepas', 105, 'Oui', 0),
(13, 1, 1, 2, 1, 38, 'Ventilateur', 'chepas', 250, 'oui', 0),
(15, 1, 1, 2, 2, 26, 'Lampe 1', 'Simple', 25, 'oui', 0);

-- --------------------------------------------------------

--
-- Structure de la table `reseau`
--

DROP TABLE IF EXISTS `reseau`;
CREATE TABLE IF NOT EXISTS `reseau` (
  `idReseau` int(11) NOT NULL AUTO_INCREMENT,
  `nomReseau` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idReseau`),
  UNIQUE KEY `RESEAU_PK` (`idReseau`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reseau`
--

INSERT INTO `reseau` (`idReseau`, `nomReseau`) VALUES
(4, 'Wifi'),
(2, 'Bluetooth'),
(5, 'Lora'),
(10, 'Sigfox');

-- --------------------------------------------------------

--
-- Structure de la table `station`
--

DROP TABLE IF EXISTS `station`;
CREATE TABLE IF NOT EXISTS `station` (
  `idStation` int(11) NOT NULL AUTO_INCREMENT,
  `idReseau` int(11) NOT NULL,
  `nomStation` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `typeStation` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `connectiviteStation` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `alerte` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idStation`),
  UNIQUE KEY `STATION_PK` (`idStation`),
  KEY `APPARTENIR_FK` (`idReseau`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `station`
--

INSERT INTO `station` (`idStation`, `idReseau`, `nomStation`, `typeStation`, `connectiviteStation`, `alerte`) VALUES
(1, 1, 'Rlet1', 'elect', 'adsdf', 'gdai7d'),
(2, 5, 'Station 2', 'afhuiehfu', 'zrrhguri', 'vbrvregb'),
(3, 2, 'Station 2', 'nzeg', 'vvkz', 'nvezngz'),
(5, 2, 'Station 3', 'sffngnlkr', 'non', 'non');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `prenom` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `login` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `passe` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `profil` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  `tel` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `USER_PK` (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `nom`, `prenom`, `login`, `passe`, `email`, `profil`, `adresse`, `tel`) VALUES
(1, 'BA', 'Adja Batta', 'Admin', 'passer', 'adjabatta@gmail,com', 'administrateur', 'Dakar', '002213051891'),
(2, 'Diallo', 'Demba', 'Admin2', 'passer', 'gorgui@gmail.com', 'administrateur', 'Rufisque', '771234523'),
(14, 'BA', 'Oumar', 'omar', 'passer', 'oumar@gmail.com', 'abonne', 'Mbour', '779849235'),
(16, 'Ndiaye', 'Dior', '14304', '32202', 'dior@gmail.com', 'abonne', 'Parcellle', '339087645'),
(17, 'SY', 'SOPHIE', '88322', '31332', 'sy@gmail.com', 'abonne', 'Dakar', '770934651'),
(18, 'Ndiaye', 'Dior', '74053', '00313', 'dior@gmail.com', 'abonne', 'Parcellle', '339087645'),
(21, 'SY', 'SOPHIE', '20241', '22330', 'sy@gmail.com', 'abonne', 'Dakar', '0934651'),
(20, 'BA', 'Serigne mor', 'Mor', 'mor', 'serignemor93@gmail.com', 'abonne', 'Keur Massar', '773123189'),
(22, 'BA', 'Oumar', '61842', '03110', 'oumar@gmail.com', 'abonne', 'Mbour', '9849235'),
(35, 'Diop', 'Momath', 'dacfiedidg', 'degghhafce', 'momath@gmail.com', 'abonne', 'Saint-Louis', '5463214'),
(25, 'Web', 'Mor', 'fdfcdgfghi', 'fhigiefecg', 'mor@gmail.com', 'abonne', 'Thies', '763456789'),
(36, 'Faye', 'MariÃ©me', 'hhcceefcdb', 'adcefeidee', 'marieme@gmail.com', 'abonne', 'Louga', '766124957'),
(37, 'Ba', 'Adja Batta', 'log', 'passer', 'adja@gmail.com', 'abonne', 'Keur Massar', '705463218'),
(32, 'Paye', 'Khoudia', 'qdfhzo', 'vjsghrio', 'hhoudia@gmail.com', 'abonne', 'Fatick', '772365487'),
(31, 'Gueye', 'Seydou', 'seydou', 'gueye', 'seydou@gmail.com', 'abonne', 'Louga', '776235500'),
(33, 'Diallo', 'Demba', 'dgicheadda', 'ecghhdecac', 'di96@gmail.com', 'abonne', 'Rufisque', '776235500'),
(38, 'Ba', 'Adja Batta', 'ahafibidhe', 'dghacdiibh', 'adja@gmail.com', 'abonne', 'Keur Massar', '708649521'),
(41, 'Balde', 'Fatoumata', 'gfcgbhadeb', 'aiiceffbid', 'fatou@gmail.com', 'abonne', 'Dakar', '762365487'),
(42, 'Kane', 'Hamidou', 'fghfhbagbd', 'hebafeahai', 'ham@gmail.com', 'abonne', 'Louga', '767896542'),
(49, 'gbrugur', 'bnirigo', 'jzbegu', 'gbreug', 'heush@gmail.com', 'abonne', 'rgzroghro', '765648795'),
(50, 'feifiu', 'vvfyezgf', 'fbze', 'passer', 'heush@gmail.com', 'abonne', 'uÃ©rguiÃ©', '775462157'),
(46, 'Coulibaly', 'Diarra', 'bbhccchhbe', 'daccbiceaa', 'diarra@gmail.com', 'abonne', 'Pikine', '775231654'),
(57, 'BÃ¢', 'Ouza', 'ouz', 'sbvebi', 'ouz@gmail.com', 'abonne', 'MbackÃ©', '774693218'),
(70, 'ManÃ©', 'Sadio', 'adceeafcgi', 'hcfacbhahf', 'sadio@gmail.com', 'abonne', 'Ziguinchor', '706564892'),
(71, 'Ndiaye', 'Samba', 'gfefegffch', 'bihifieida', 'samba@gmail.com', 'abonne', 'Thies', '763646176'),
(72, 'Sarr', 'Mamadou', 'cheehefccg', 'bbebbegdde', 'momo@gmail.com', 'abonne', 'Rufisque', '766221545'),
(73, 'Sow', 'Seydi', 'ffgne', 'grioh', 'seydi@gmail.com', 'abonne', 'Yeumbeul', '765964213'),
(75, 'Mendy', 'Mame Coumba Emilie', 'bgfdicbbda', 'ccaigffaeg', 'emilie@gmail.com', 'abonne', 'Grand Yoff', '766564892');

-- --------------------------------------------------------

--
-- Structure de la table `zone`
--

DROP TABLE IF EXISTS `zone`;
CREATE TABLE IF NOT EXISTS `zone` (
  `idZone` int(11) NOT NULL AUTO_INCREMENT,
  `nomZone` varchar(254) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idZone`),
  UNIQUE KEY `ZONE_PK` (`idZone`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `zone`
--

INSERT INTO `zone` (`idZone`, `nomZone`) VALUES
(1, 'Bambey'),
(2, 'Rufisque'),
(6, 'Tambacounda'),
(7, 'Pikine'),
(8, 'Saint-Louis'),
(11, 'Diourbel');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
