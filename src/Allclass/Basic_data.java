/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Allclass;

import java.util.Formatter;
import javax.swing.JTextField;

/**
 *
 * @author Youtech BD
 */
public class Basic_data extends Alldata {
    @Override
    public void set(JTextField[] textFields) {
        
         
        String []data=new String[15];
        int i=0;
        for (JTextField textField : textFields) {
        String value = textField.getText();
        data[i]=value;
        i++;
        }
        name=data[0];
        father_name=data[1];
        mother_name=data[2];
        add1=data[3];
        add2=data[4];
        mob=data[5];
        sex=data[6];
        nationality=data[7];
        dob=data[8];
      

        try {
  Formatter file = new Formatter("pavel.html");
file.format("%s\n", "<html><head><style>body {background-color:rgb(240, 240, 240) ;}</style></head><body>");
file.format("%s\n","<style type=\"text/css\">#printbtn { display:flex;margin:0 auto; bottom: 0; text-align: center; } @media print { #printbtn { display: none; } }</style><input id=\"printbtn\" type=\"button\" value=\"Print this page\" onclick=\"window.print()\">");
file.format("%s\n", "<h1 style=color:black align=center >Curriculum Vitae<h1>");
file.format("%s\n\n\n\n\n\n", "<table border=1 align=center width=1000 height=100 cellspacing=0 cellpadding=6>");

// Add personal information with mixed background colors
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Name</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", name);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Father's Name</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", father_name);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Mother's Name</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", mother_name);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Present Address</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", add1);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Permanent Address</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", add2);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Mobile Number</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", mob);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Date Of Birth</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", dob);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Sex</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", sex);
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Nationality</font></td>");
file.format("<td colspan=3 bgcolor=#E6E6E6><font size=5>%s</td></tr>", nationality);

// Add educational qualification with mixed background colors
file.format("<tr><td colspan=4 bgcolor=#BFBFBF style=text-align:center;><font size=5>Educational Qualification</font></td></tr>");
file.format("<tr><td bgcolor=#BFBFBF><font size=5>Degree</font></td>");
file.format("<td bgcolor=#BFBFBF><font size=5>Board/University</font></td>");
file.format("<td bgcolor=#BFBFBF><font size=5>GPA/CGPA</font></td>");
file.format("<td bgcolor=#BFBFBF><font size=5>Pass.Year</font></td></tr>");

      file.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
}
   
}
