package com.mycompany.kalkulatorsederhana;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KalkulatorSederhana {

    private static String operator = "";
    private static double num1 = 0;
    private static double num2 = 0;

    public static void main(String[] args) {
        // Membuat frame utama dengan layout GridBagLayout untuk lebih fleksibel
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(320, 400); // Ukuran frame yang disesuaikan
        frame.setLayout(new GridBagLayout());
        
        // Warna latar belakang yang lebih lembut
        frame.getContentPane().setBackground(new Color(230, 230, 250));

        // Membuat text field untuk tampilan input/output
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(270, 40)); // Ukuran textField lebih kecil
        textField.setFont(new Font("Arial", Font.PLAIN, 22)); // Font lebih kecil untuk kenyamanan
        textField.setEditable(false); // Hanya untuk output
        textField.setBackground(new Color(255, 255, 255)); // Warna putih pada textField
        textField.setForeground(Color.BLACK); // Warna teks hitam
        
        // Pengaturan layout untuk komponen
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4; // TextField akan menempati 4 kolom
        frame.add(textField, gbc);

        // Membuat array tombol
        JButton[] buttons = new JButton[16];
        String[] labels = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "C", "0", "=", "/"
        };

        // Desain tombol lebih kecil
        Dimension buttonSize = new Dimension(60, 50); // Ukuran tombol sedikit diperkecil
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].setPreferredSize(buttonSize);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18)); // Font tombol lebih kecil
            buttons[i].setBackground(new Color(70, 130, 180)); // Warna biru muda
            buttons[i].setForeground(Color.WHITE); // Warna teks putih

            // Penempatan tombol pada grid
            gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.gridx = i % 4; // Posisi kolom
            gbc.gridy = (i / 4) + 1; // Posisi baris
            frame.add(buttons[i], gbc);
        }

        // Action listener untuk tombol kalkulator
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    // Logika kalkulator sederhana
                    if (command.charAt(0) == 'C') {
                        textField.setText("");
                        operator = "";
                    } else if (command.charAt(0) == '=') {
                        num2 = Double.parseDouble(textField.getText());
                        double result = calculate(num1, num2, operator);
                        textField.setText(String.valueOf(result));
                    } else {
                        // Jika tombol operator ditekan
                        if (isOperator(command)) {
                            operator = command;
                            num1 = Double.parseDouble(textField.getText());
                            textField.setText("");
                        } else {
                            textField.setText(textField.getText() + command);
                        }
                    }
                }
            });
        }

        // Menetapkan aksi close pada frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method untuk melakukan perhitungan
    private static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0; // Untuk pembagian dengan nol
                }
            default:
                return 0;
        }
    }

    // Method untuk memeriksa apakah karakter adalah operator
    private static boolean isOperator(String command) {
        return command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/");
    }
}
