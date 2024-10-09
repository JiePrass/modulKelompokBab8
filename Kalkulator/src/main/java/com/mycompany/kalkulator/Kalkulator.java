package com.mycompany.kalkulator;

import javax.swing.*;
import java.awt.*;

public class Kalkulator extends JFrame {
    private JTextField textField1, textField2, textFieldHasil;
    private JButton btnTambah, btnKurang, btnKali, btnBagi;

    public Kalkulator() {
        // Set judul frame
        setTitle("Kalkulator Sederhana");
        setSize(400, 400);  // Ukuran frame disesuaikan
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // Ubah warna background frame
        getContentPane().setBackground(new Color(240, 255, 255)); // Warna Light Cyan

        // Inisialisasi komponen
        JLabel label1 = new JLabel("Masukkan Angka Pertama:");
        JLabel label2 = new JLabel("Masukkan Angka Kedua:");
        JLabel labelHasil = new JLabel("Hasil:");

        // Atur ukuran font
        Font textFieldFont = new Font("Arial", Font.PLAIN, 18);  // Ukuran font lebih besar

        // Inisialisasi TextField dengan lebar lebih besar
        textField1 = new JTextField(5);  // Lebar kolom lebih besar
        textField1.setFont(textFieldFont);
        textField2 = new JTextField(5);  // Lebar kolom lebih besar
        textField2.setFont(textFieldFont);
        textFieldHasil = new JTextField(5);  // Lebar kolom lebih besar
        textFieldHasil.setFont(textFieldFont);
        textFieldHasil.setEditable(false);  // TextField hasil hanya baca

        // Warna untuk TextField
        textField1.setBackground(Color.white); // Background putih
        textField1.setForeground(Color.black); // Teks hitam
        textField2.setBackground(Color.white);
        textField2.setForeground(Color.black);
        textFieldHasil.setBackground(Color.white);
        textFieldHasil.setForeground(Color.black);

        // Inisialisasi tombol
        btnTambah = new JButton("+");
        btnKurang = new JButton("-");
        btnKali = new JButton("*");
        btnBagi = new JButton("/");

        // Ukuran tombol seragam
        Dimension btnSize = new Dimension(60, 40);  // Ukuran tombol lebih lebar dan seragam
        btnTambah.setPreferredSize(btnSize);
        btnKurang.setPreferredSize(btnSize);
        btnKali.setPreferredSize(btnSize);
        btnBagi.setPreferredSize(btnSize);

        // Warna tombol (background biru, teks putih)
        Color btnBackground = new Color(100, 149, 237); // Cornflower Blue
        btnTambah.setBackground(btnBackground);
        btnTambah.setForeground(Color.WHITE);
        btnKurang.setBackground(btnBackground);
        btnKurang.setForeground(Color.WHITE);
        btnKali.setBackground(btnBackground);
        btnKali.setForeground(Color.WHITE);
        btnBagi.setBackground(btnBackground);
        btnBagi.setForeground(Color.WHITE);

        // Tambahkan ActionListener untuk tombol
        Operasi operasi = new Operasi(textField1, textField2, textFieldHasil);
        btnTambah.addActionListener(operasi);
        btnKurang.addActionListener(operasi);
        btnKali.addActionListener(operasi);
        btnBagi.addActionListener(operasi);

        // Menyusun komponen menggunakan GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Jarak antar komponen yang lebih luas
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Baris 1: Label dan TextField Angka Pertama
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(label1, gbc);

        gbc.gridy = 1;
        add(textField1, gbc);

        // Baris 2: Label dan TextField Angka Kedua
        gbc.gridy = 2;
        add(label2, gbc);

        gbc.gridy = 3;
        add(textField2, gbc);

        // Baris 3: Label dan TextField Hasil
        gbc.gridy = 4;
        add(labelHasil, gbc);

        gbc.gridy = 5;
        add(textFieldHasil, gbc);

        // Baris 4: Tombol Operasi (seragam)
        gbc.gridwidth = 1;
        gbc.gridy = 6;

        gbc.gridx = 0;
        add(btnTambah, gbc);

        gbc.gridx = 1;
        add(btnKurang, gbc);

        gbc.gridx = 2;
        add(btnBagi, gbc);

        // Tombol keempat ditempatkan di tengah pada baris berikutnya
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(btnKali, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
