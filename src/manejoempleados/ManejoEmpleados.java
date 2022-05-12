/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejoempleados;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author sebas
 */
public class ManejoEmpleados extends JFrame{
    
    private JPanel pDatos, pBotones, pArea, pImagen;
    private JButton bIngresar, bMostrar, bCargo, bEmpleado;
    private JLabel eNombre, eIdentidad, eEdad, eSueldo, eCargo, eImagen;
    private JTextField tfNombre, tfIdentidad, tfEdad, tfSueldo;
    private JComboBox<String> cbCargo;
    private JTextArea area;
    
    public ManejoEmpleados()
            {
                initComponentes();
                //
                setTitle("Manejo de Empleados de la Empresa");
                setSize(700, 740);
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
    
    private void initComponentes()
    {
        eNombre = new JLabel("Nombre");
        eIdentidad = new JLabel("ID");
        eEdad = new JLabel("Edad");
        eSueldo = new JLabel("Sueldo");
        eCargo = new JLabel("Cargo");
        eImagen = new JLabel(new ImageIcon("src/trabajadorP.png"));
        
        
        bIngresar = new JButton("Ingresar Empleado");
        bMostrar = new JButton("Mostrar Empleados");
        bCargo = new JButton("Buscar por cargo");
        bEmpleado = new JButton("Buscar Empleado");
        
        ManejaEventos eventos = new ManejaEventos();
        bIngresar.addActionListener(eventos);
        bMostrar.addActionListener(eventos);
        bCargo.addActionListener(eventos);
        bEmpleado.addActionListener(eventos);
        
        tfNombre = new JTextField();
        tfIdentidad = new JTextField();
        tfEdad = new JTextField();
        tfSueldo = new JTextField();
        
        String[] cargoE = {"Elija un cargo", "Operario", "Conductor", "Administrativo", "Jefe de personal"};
        cbCargo = new JComboBox<>(cargoE);
        
        area = new JTextArea(200, 100);
        
        pDatos = new JPanel(new GridLayout(5, 5, 2, 2 ));
        pBotones = new JPanel(new GridLayout(3, 2));
        pArea = new JPanel();
        pImagen = new JPanel();
        
        pImagen.add(eImagen);
        pDatos.add(eNombre); pDatos.add(tfNombre); pDatos.add(eIdentidad); pDatos.add(tfIdentidad); pDatos.add(eCargo); pDatos.add(cbCargo); pDatos.add(eEdad); pDatos.add(tfEdad); pDatos.add(eSueldo); pDatos.add(tfSueldo);
        pBotones.add(bIngresar); pBotones.add(bMostrar); pBotones.add(bCargo); pBotones.add(bEmpleado); pBotones.add(pImagen, BorderLayout.SOUTH);
        pArea.add(area);
        
        add(pDatos, BorderLayout.NORTH);
        add(pBotones, BorderLayout.EAST);
        add(pArea, BorderLayout.WEST);
    }
    
    class ManejaEventos implements ActionListener

    {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoEmpleados obj = new ManejoEmpleados();    }
    
}
