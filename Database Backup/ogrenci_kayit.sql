-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 25 Şub 2021, 20:52:13
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `ogrenci_kayit`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bolum`
--

CREATE TABLE `bolum` (
  `bolum_id` int(11) NOT NULL,
  `bolum_ad` varchar(30) CHARACTER SET utf8 NOT NULL,
  `fakulte_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `bolum`
--

INSERT INTO `bolum` (`bolum_id`, `bolum_ad`, `fakulte_id`) VALUES
(1, 'Bilgisayar Mühendisliği', 1),
(2, 'İnşaat Mühendisliği', 1),
(3, 'Matematik', 2),
(4, 'Matematik', 2),
(5, 'Tıp', 3),
(6, 'Mimarlık', 4),
(7, 'Resim', 4);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `danisman`
--

CREATE TABLE `danisman` (
  `danisman_id` int(11) NOT NULL,
  `unvan` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `dnsmn_ad` varchar(30) CHARACTER SET utf8 NOT NULL,
  `mail` varchar(30) CHARACTER SET utf8 NOT NULL,
  `sifre` varchar(30) CHARACTER SET utf8 NOT NULL,
  `mesaj_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `danisman`
--

INSERT INTO `danisman` (`danisman_id`, `unvan`, `dnsmn_ad`, `mail`, `sifre`, `mesaj_id`) VALUES
(2, 'Öğr. Gör. Dr.', 'Selim', 'selim@gmail.com', '1234', NULL),
(3, 'Prof. Dr.', 'Aysun', 'aysun@gmail.com', '123456', NULL),
(4, 'Prof. Dr.', 'Mahmut', 'mahmut@gmail.com', '12345', NULL),
(5, 'Doç Dr.', 'Şeyma', 'seyma@gmail.com', '1234', NULL),
(6, 'Doç Dr.', 'Abdullah', 'abdullah@gmail.com', '12345', NULL);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `fakulte`
--

CREATE TABLE `fakulte` (
  `fakulte_id` int(11) NOT NULL,
  `fakulte_ad` varchar(40) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `fakulte`
--

INSERT INTO `fakulte` (`fakulte_id`, `fakulte_ad`) VALUES
(1, 'Teknoloji Fakültesi'),
(2, 'Fen-Edebiyat Fakültesi'),
(3, 'Tıp Fakültesi'),
(4, 'Sanat-Tasarım ve Mimarlık Fakültesi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `mesaj`
--

CREATE TABLE `mesaj` (
  `mesaj_id` int(11) NOT NULL,
  `konu` varchar(30) CHARACTER SET utf8 NOT NULL,
  `icerik` varchar(250) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrenci`
--

CREATE TABLE `ogrenci` (
  `ogrenci_id` int(11) NOT NULL,
  `tc` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `ad` varchar(40) CHARACTER SET utf8 NOT NULL,
  `soyad` varchar(40) CHARACTER SET utf8 NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `cinsiyet` varchar(5) CHARACTER SET utf8 NOT NULL,
  `adres` varchar(250) CHARACTER SET utf8 NOT NULL,
  `sifre` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `fakulte_id` int(30) NOT NULL,
  `bolum_id` int(30) NOT NULL,
  `danisman_id` int(11) DEFAULT NULL,
  `mesaj_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `ogrenci`
--

INSERT INTO `ogrenci` (`ogrenci_id`, `tc`, `ad`, `soyad`, `dogum_tarihi`, `cinsiyet`, `adres`, `sifre`, `fakulte_id`, `bolum_id`, `danisman_id`, `mesaj_id`) VALUES
(21, '12345678910', 'İlayda', 'Yılmaz', '1996-03-26', 'Kadın', 'İSTANBUL', '123', 3, 5, NULL, NULL),
(22, '98765432195', 'Ahmet', 'Selim', '1997-02-21', 'Erkek', 'KOCAELİ', '321', 1, 1, NULL, NULL),
(23, '32165498765', 'Süleyman', 'Arslan', '1998-05-07', 'Erkek', 'SAKARYA', '213', 4, 6, NULL, NULL);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `bolum`
--
ALTER TABLE `bolum`
  ADD PRIMARY KEY (`bolum_id`),
  ADD KEY `fakulte_id` (`fakulte_id`);

--
-- Tablo için indeksler `danisman`
--
ALTER TABLE `danisman`
  ADD PRIMARY KEY (`danisman_id`),
  ADD KEY `mesaj_id` (`mesaj_id`);

--
-- Tablo için indeksler `fakulte`
--
ALTER TABLE `fakulte`
  ADD PRIMARY KEY (`fakulte_id`);

--
-- Tablo için indeksler `mesaj`
--
ALTER TABLE `mesaj`
  ADD PRIMARY KEY (`mesaj_id`);

--
-- Tablo için indeksler `ogrenci`
--
ALTER TABLE `ogrenci`
  ADD PRIMARY KEY (`ogrenci_id`),
  ADD KEY `danisman_id` (`danisman_id`),
  ADD KEY `fakulte_id` (`fakulte_id`),
  ADD KEY `bolum_id` (`bolum_id`),
  ADD KEY `mesaj_id` (`mesaj_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `bolum`
--
ALTER TABLE `bolum`
  MODIFY `bolum_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `danisman`
--
ALTER TABLE `danisman`
  MODIFY `danisman_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `fakulte`
--
ALTER TABLE `fakulte`
  MODIFY `fakulte_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `mesaj`
--
ALTER TABLE `mesaj`
  MODIFY `mesaj_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `ogrenci`
--
ALTER TABLE `ogrenci`
  MODIFY `ogrenci_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `bolum`
--
ALTER TABLE `bolum`
  ADD CONSTRAINT `bolum_ibfk_1` FOREIGN KEY (`fakulte_id`) REFERENCES `fakulte` (`fakulte_id`);

--
-- Tablo kısıtlamaları `danisman`
--
ALTER TABLE `danisman`
  ADD CONSTRAINT `danisman_ibfk_1` FOREIGN KEY (`mesaj_id`) REFERENCES `mesaj` (`mesaj_id`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Tablo kısıtlamaları `ogrenci`
--
ALTER TABLE `ogrenci`
  ADD CONSTRAINT `ogrenci_ibfk_5` FOREIGN KEY (`danisman_id`) REFERENCES `danisman` (`danisman_id`),
  ADD CONSTRAINT `ogrenci_ibfk_6` FOREIGN KEY (`fakulte_id`) REFERENCES `fakulte` (`fakulte_id`),
  ADD CONSTRAINT `ogrenci_ibfk_7` FOREIGN KEY (`bolum_id`) REFERENCES `bolum` (`bolum_id`),
  ADD CONSTRAINT `ogrenci_ibfk_8` FOREIGN KEY (`mesaj_id`) REFERENCES `mesaj` (`mesaj_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
