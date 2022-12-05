/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class CrearGrupo extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public CrearGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(new GridLayout(14, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(0).add(this.jPanelList.get(14));

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Periodo academico"));
        this.jLabelList.add(new JLabel("Sede"));
        this.jLabelList.add(new JLabel("Campus/Extension"));
        this.jLabelList.add(new JLabel("Modalidad"));
        this.jLabelList.add(new JLabel("Carrera"));
        this.jLabelList.add(new JLabel("Codigo de Proyecto "));
        this.jLabelList.add(new JLabel("Asignatura"));
        this.jLabelList.add(new JLabel("Nombre de Grupo"));
        this.jLabelList.add(new JLabel("Cupos por grupo "));
        this.jLabelList.add(new JLabel("Autorizacion calificaion sobre 100 "));
        this.jLabelList.add(new JLabel("Seleccionar Jornada del grupo "));
        this.jLabelList.add(new JLabel("Oferta para estudiantes"));
        this.jLabelList.add(new JLabel("Aplica cambio de grupo "));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(100));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(8));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jTextFieldList.get(5));
        this.jPanelList.get(7).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(6));
        this.jPanelList.get(8).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jTextFieldList.get(7));
        this.jPanelList.get(9).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jTextFieldList.get(8));
        this.jPanelList.get(10).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jTextFieldList.get(9));

        this.jPanelList.get(13).add(this.jLabelList.get(12));
        this.jPanelList.get(13).add(this.jTextFieldList.get(12));

    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        var PromeCali = new String[1];
        PromeCali[0] = "si";
        PromeCali[1] = "no";

        var jorGrupó = new String[3];
        jorGrupó[0] = "Matutina";
        jorGrupó[1] = "Despertina";
        jorGrupó[2] = "Hibrida";

        var aplicaCamb = new String[1];
        aplicaCamb[0] = "si";
        aplicaCamb[1] = "No";
        
    }
     public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Guardar"));
         this.jButtonList.add(new JButton("Cancelar"));

        this.jPanelList.get(14).add(this.jButtonList.get(0));
        this.jPanelList.get(14).add(this.jButtonList.get(1));

    }
    
}
