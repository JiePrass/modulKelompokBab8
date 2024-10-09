package com.mycompany.lembarpenilaian;

import javax.swing.*;
import java.awt.*;

public class LembarPenilaian {

    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Lembar Penilaian");
        frame.setSize(450, 250);
        frame.setLayout(null); // Menggunakan null layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Ubah warna background frame
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // Warna Alice Blue

        // Membuat label dan field NIM
        JLabel labelNIM = new JLabel("NIM");
        labelNIM.setBounds(20, 20, 100, 25);
        frame.add(labelNIM);

        JTextField fieldNIM = new JTextField();
        fieldNIM.setBounds(120, 20, 150, 25);
        frame.add(fieldNIM);
        
        // Cari
        JButton btnCari = new JButton("Cari");
        btnCari.setBounds(280, 20, 140, 25);
        btnCari.setBackground(new Color(100, 149, 237)); // Cornflower Blue
        btnCari.setForeground(Color.WHITE);
        frame.add(btnCari);

        // Membuat label dan field Nama
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 50, 100, 25);
        frame.add(labelNama);

        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(120, 50, 300, 25);
        frame.add(fieldNama);

        // Membuat label dan radio button Kelas
        JLabel labelKelas = new JLabel("Kelas");
        labelKelas.setBounds(20, 80, 100, 25);
        frame.add(labelKelas);

        JRadioButton kelasA = new JRadioButton("A");
        kelasA.setBounds(120, 80, 50, 25);
        kelasA.setBackground(new Color(240, 248, 255)); // Alice Blue
        frame.add(kelasA);

        JRadioButton kelasB = new JRadioButton("B");
        kelasB.setBounds(170, 80, 50, 25);
        kelasB.setBackground(new Color(240, 248, 255)); // Alice Blue
        frame.add(kelasB);

        JRadioButton kelasC = new JRadioButton("C");
        kelasC.setBounds(220, 80, 50, 25);
        kelasC.setBackground(new Color(240, 248, 255)); // Alice Blue
        frame.add(kelasC);

        // Grouping the radio buttons
        ButtonGroup kelasGroup = new ButtonGroup();
        kelasGroup.add(kelasA);
        kelasGroup.add(kelasB);
        kelasGroup.add(kelasC);

        // Membuat label dan combo box Mata Kuliah
        JLabel labelMK = new JLabel("Mata Kuliah");
        labelMK.setBounds(20, 110, 100, 25);
        frame.add(labelMK);

        String[] mataKuliah = {"Kalkulus", "Fisika", "Kimia"};
        JComboBox<String> comboMK = new JComboBox<>(mataKuliah);
        comboMK.setBounds(120, 110, 150, 25);
        frame.add(comboMK);

        // Comment
        JTextField fieldComment = new JTextField();
        fieldComment.setBounds(275, 80, 150, 60);
        frame.add(fieldComment);
        
        // Membuat tombol Edit, Simpan, Hapus, Keluar
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(45, 160, 80, 25);
        btnEdit.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        btnEdit.setForeground(Color.WHITE);
        frame.add(btnEdit);

        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(135, 160, 80, 25);
        btnSimpan.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        btnSimpan.setForeground(Color.WHITE);
        frame.add(btnSimpan);

        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(225, 160, 80, 25);
        btnHapus.setBackground(new Color(255, 69, 0)); // Red-Orange
        btnHapus.setForeground(Color.WHITE);
        frame.add(btnHapus);

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(315, 160, 80, 25);
        btnKeluar.setBackground(new Color(255, 69, 0)); // Red-Orange
        btnKeluar.setForeground(Color.WHITE);
        frame.add(btnKeluar);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
