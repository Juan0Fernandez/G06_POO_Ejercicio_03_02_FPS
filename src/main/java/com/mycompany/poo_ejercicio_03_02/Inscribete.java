/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Juan Fernandez
 */
public final class Inscribete extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Inscribete(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.iniciarCombos();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
 

        this.jPanelList.get(0).setLayout(new GridLayout(4, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
     

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Ingrese su sede: "));
        this.jLabelList.add(new JLabel("Ingrese el tipo de documento:"));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: "));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField());
       

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        var listacedes = new String[3];
        listacedes[0] = "Cuencar";
        listacedes[1] = "Quito";
        listacedes[2] = "Guayaquil";

        this.jComboBoxList = new ArrayList<>();
        var listaTipoDocumento = new String[3];
        listaTipoDocumento[0] = "Cedula";
        listaTipoDocumento[1] = "Pasaporte";
        listaTipoDocumento[2] = "Extranjero";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaTipoDocumento)));

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listacedes)));
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Ingresar"));

        this.jPanelList.get(3).add(this.jButtonList.get(0));

    }
}
