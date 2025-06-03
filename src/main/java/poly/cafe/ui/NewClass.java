/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.ui;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 *
 * @author dtoan
 */
public class NewClass {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chọn ngày");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JDateChooser dateChooser = new JDateChooser();
        frame.add(dateChooser);

        JButton button = new JButton("Lấy ngày");
        button.addActionListener(e -> {
            Date selectedDate = dateChooser.getDate();
            JOptionPane.showMessageDialog(frame, "Ngày chọn: " + selectedDate);
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
