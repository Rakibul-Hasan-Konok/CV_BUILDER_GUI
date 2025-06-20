/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Allclass;

import java.io.FileWriter;
import java.util.Formatter;
import javax.swing.JTextField;

/**
 *
 * @author pavel
 */
public class Educational_data extends Alldata{
    

    public void set(JTextField[] textFields) {
        String[] data = new String[15];
        int i = 0;

        for (JTextField textField : textFields) {
            String value = textField.getText();
            data[i] = value;
            i++;
        }

        try {
            FileWriter file = new FileWriter("pavel.html", true);
            file.write("<tr>");
            file.write("<td><font size=5>");
            file.write(data[0]);
            file.write("</font></td>");
            file.write("<td><font size=5>");
            file.write(data[1]);
            file.write("</font></td>");
            file.write("<td><font size=5>");
            file.write(data[2]);
            file.write("</font></td>");
            file.write("<td><font size=5>");
            file.write(data[3]);
            file.write("</font></td>");
            file.write("</tr>");
            file.write("</tr>");


            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
