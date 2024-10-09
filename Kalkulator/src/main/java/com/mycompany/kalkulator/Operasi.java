package com.mycompany.kalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operasi implements ActionListener {
    private JTextField textField1, textField2, textFieldHasil;

    public Operasi(JTextField textField1, JTextField textField2, JTextField textFieldHasil) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textFieldHasil = textFieldHasil;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Tetap menggunakan double untuk perhitungan agar bisa menangani semua kasus operasi
            double angka1 = Double.parseDouble(textField1.getText());
            double angka2 = Double.parseDouble(textField2.getText());
            double hasil = 0;

            JButton source = (JButton) e.getSource();
            String operation = source.getText();

            // Lakukan operasi berdasarkan tombol yang ditekan
            if (operation.equals("+")) {
                hasil = angka1 + angka2;
            } else if (operation.equals("-")) {
                hasil = angka1 - angka2;
            } else if (operation.equals("*")) {
                hasil = angka1 * angka2;
            } else if (operation.equals("/")) {
                // Tangani pembagian dengan pengecekan untuk menghindari pembagian oleh nol
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak bisa membagi dengan nol!");
                    return; // Keluar dari metode jika terjadi pembagian oleh nol
                }
            }

            // Menampilkan hasil sesuai format
            if (hasil == (int) hasil) {
                // Jika hasilnya bilangan bulat, tampilkan tanpa pecahan
                textFieldHasil.setText(String.valueOf((int) hasil));
            } else {
                // Jika hasilnya bukan bilangan bulat, tampilkan dengan pecahan desimal
                textFieldHasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException ex) {
            // Menampilkan pesan error jika input tidak valid
            JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
        }
    }
}
