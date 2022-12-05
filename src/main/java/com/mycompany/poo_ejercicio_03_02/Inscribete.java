/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Juan Fernandez
 */
public final class Inscribete extends JFrame {

    private List<JPanel> jPanelList;
    private List<JPanel> jPanelPrincipal;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JComboBox> jComboBoxList;
    private List<JButton> jButtonList;

    public Inscribete(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 300);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.crearPanel();
        this.iniciarJTextFields();
        this.iniciarComboBox();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelPrincipal.get(0));
        this.setVisible(true);
    }

    private void crearPanel() {

        jPanelPrincipal = new ArrayList<>();
        this.jPanelPrincipal.add(new JPanel());
        this.jPanelPrincipal.add(new JPanel());
        
       
        this.jPanelPrincipal.get(0).setLayout(new BorderLayout());
        this.jPanelPrincipal.get(0).setBorder(new MatteBorder(2,2,2,2,Color.WHITE) );
        this.jPanelPrincipal.get(0).add(this.jPanelPrincipal.get(1), BorderLayout.CENTER);
     
        this.jPanelPrincipal.get(1).setBackground(Color.white);
        this.jPanelPrincipal.get(1).setLayout(new BorderLayout());
        this.jPanelPrincipal.get(1).setBorder(new CompoundBorder( new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));
        
        jPanelList = new ArrayList<>();
        for (int x = 0; x < 6; x++) {
            this.jPanelList.add(new JPanel());      
        }      
        
        this.jPanelPrincipal.get(1).add(this.jPanelList.get(0));
        
        this.jPanelList.get(0).setLayout(new GridLayout(6, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        
        
        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel(" INSCRIBETE "));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));
        this.jLabelList.add(new JLabel(" Selecione una sede: "));
        this.jLabelList.add(new JLabel(" Tipo de Documento: "));
        this.jLabelList.add(new JLabel(" Ingrese su identificación: "));
        
        jLabelList.get(1).setOpaque(true);
        jLabelList.get(1).setHorizontalAlignment(SwingConstants.LEFT);
        jLabelList.get(2).setOpaque(true);
        jLabelList.get(2).setHorizontalAlignment(SwingConstants.LEFT);
        jLabelList.get(3).setOpaque(true);
        jLabelList.get(3).setHorizontalAlignment(SwingConstants.LEFT);
      
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(10));

        this.jPanelList.get(1).add(this.jLabelList.get(0), BorderLayout.CENTER);      
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(5).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jTextFieldList.get(0));
        
 
    }

    public void iniciarComboBox() {
        this.jComboBoxList = new ArrayList<>();
        var listaSede = new String[3];
        listaSede[0] = "Quito";
        listaSede[1] = "Cuenca";
        listaSede[2] = "Guayaquil";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSede)));

        var listaDoc = new String[3];
        listaDoc[0] = "Cedula";
        listaDoc[1] = "Pasaporte";
        listaDoc[2] = "Extranjero";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaDoc)));
        this.jComboBoxList.add(new JComboBox());

        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList.get(1));
        
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jPanelList.get(5).add(this.jButtonList.get(0));
    
    }
}
