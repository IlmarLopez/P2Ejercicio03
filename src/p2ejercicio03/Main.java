/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2ejercicio03;
import java.awt.Button;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author alumnotic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame mainFrame = new JFrame();
        mainFrame.setBounds(100, 100, 220, 400);
        
        mainFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setLayout(null);
        
        // Crear textfield Name
        JTextField textFieldName = new JTextField();
        textFieldName.setBounds(128, 28, 86, 20);
        mainFrame.getContentPane().add(textFieldName);
        textFieldName.setColumns(10);
        
        // Crear etiqueta Name
        JLabel labelName = new JLabel("Name");
        labelName.setBounds(10, 31, 46, 14);
        mainFrame.getContentPane().add(labelName);
        
        // Crear textfield Last Name
        JTextField textFieldLastName = new JTextField();
        textFieldLastName.setBounds(128, 58, 86, 20);
        mainFrame.getContentPane().add(textFieldLastName);
        textFieldLastName.setColumns(10);
        
        // Crear etiqueta Last Name
        JLabel labelLastName = new JLabel("Last name");
        labelLastName.setBounds(10, 61, 90, 14);
        mainFrame.getContentPane().add(labelLastName);
        
        // Crear textfield Phone Number
        JTextField textFieldPhoneNumber = new JTextField();
        textFieldPhoneNumber.setBounds(128, 88, 86, 20);
        mainFrame.getContentPane().add(textFieldPhoneNumber);
        textFieldPhoneNumber.setColumns(10);
        
        // Crear etiqueta Phone Number
        JLabel labelPhoneNumber = new JLabel("Phone Number");
        labelPhoneNumber.setBounds(10, 91, 100, 14);
        mainFrame.getContentPane().add(labelPhoneNumber);
        
        // Crear textfield Alternate Number
        JTextField textFieldAlternateNumber = new JTextField();
        textFieldAlternateNumber.setBounds(128, 118, 86, 20);
        mainFrame.getContentPane().add(textFieldAlternateNumber);
        textFieldAlternateNumber.setColumns(10);
        
        // Crear etiqueta Alternate Number
        JLabel labelAlternateNumber = new JLabel("Alternate Number");
        labelAlternateNumber.setBounds(10, 121, 120, 14);
        mainFrame.getContentPane().add(labelAlternateNumber);
        
        // Crear textfield Mail
        JTextField textFieldMail = new JTextField();
        textFieldMail.setBounds(128, 148, 86, 20);
        mainFrame.getContentPane().add(textFieldMail);
        textFieldMail.setColumns(10);
        
        // Crear etiqueta Mail
        JLabel labelMail = new JLabel("Mail");
        labelMail.setBounds(10, 151, 100, 14);
        mainFrame.getContentPane().add(labelMail);
        
        // Crear textfield Address
        JTextArea textAreadAddress = new JTextArea();
        textAreadAddress.setBounds(10, 200, 200, 100);
        mainFrame.getContentPane().add(textAreadAddress);
        textAreadAddress.setColumns(10);
        
        // Crear etiqueta Address
        JLabel labelAddress = new JLabel("Address");
        labelAddress.setBounds(10, 181, 100, 14);
        mainFrame.getContentPane().add(labelAddress);
        
        // Crear button Cancel
        Button cancelBtn = new Button("Cancel");
        cancelBtn.setBounds(5, 320, 70, 30);
        cancelBtn.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        mainFrame.getContentPane().add(cancelBtn);
        
        // Crear button Clear
        Button clearBtn = new Button("Clear");
        clearBtn.setBounds(75, 320, 70, 30);
        clearBtn.addActionListener((ActionEvent e) -> {
            textFieldName.setText(null);
            textFieldLastName.setText(null);
            textFieldPhoneNumber.setText(null);
            textFieldAlternateNumber.setText(null);
            textFieldMail.setText(null);
            textAreadAddress.setText(null);
        });
                
        mainFrame.getContentPane().add(clearBtn);
        
        // Crear button Save
        Button saveBtn = new Button("Save");
        saveBtn.setBounds(145, 320, 70, 30);
        mainFrame.getContentPane().add(saveBtn);
        
        mainFrame.setVisible(true);
    }
    
}
