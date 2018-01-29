-- phpMyAdmin SQL Dump
-- version 2.11.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 02. Desember 2016 jam 21:04
-- Versi Server: 5.0.45
-- Versi PHP: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `dbmarketing`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE `tblogin` (
  `USERNAME` varchar(30) collate latin1_general_ci NOT NULL,
  `PASSWORD` varchar(30) collate latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data untuk tabel `tblogin`
--

INSERT INTO `tblogin` (`USERNAME`, `PASSWORD`) VALUES
('FRESSKORE', 'VEIZAL');
