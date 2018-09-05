/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList computadores = new ArrayList();
        Object c;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((c = entrada.readObject()) != null) {
                computadores.add(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return computadores;
    }

    public static void volcado(ObjectOutputStream salida, ArrayList computadores) {
        for (int i = 0; i < computadores.size(); i++) {
            try {
                salida.writeObject(computadores.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static void llenarTablaClientes(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Cliente> cliente = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = cliente.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(cliente.get(i).getCedula(), i, 0);
            tabla.setValueAt(cliente.get(i).getNombre(), i, 1);
            tabla.setValueAt(cliente.get(i).getConsumo(), i, 2);
            tabla.setValueAt(cliente.get(i).getEstrato(), i, 3);

        }

    }

    public static void llenarTablaClientes(JTable tabla, ArrayList<Cliente> cliente) {
        DefaultTableModel tm;
        int nf;

        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = cliente.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(cliente.get(i).getCedula(), i, 0);
            tabla.setValueAt(cliente.get(i).getNombre(), i, 1);
            tabla.setValueAt(cliente.get(i).getConsumo(), i, 2);
            tabla.setValueAt(cliente.get(i).getEstrato(), i, 3);
        }
    }

    public static ArrayList<Factura> modificaFactura(String ruta, String fecha, String nfactura, String fpago, Cliente cliente) {
        ArrayList<Factura> factura = traerDatos(ruta);
        for (int i = 0; i < factura.size(); i++) {
            if (factura.get(i).getNfactura().equals(nfactura)) {
                factura.get(i).setNfactura(nfactura);
                factura.get(i).setFecha(fecha);
                factura.get(i).setFpago(fpago);
                factura.get(i).setCliente(cliente);
               
                return factura;
            }

        }
        return null;
    }

    public static boolean buscarClienteCedula(String cedula, String ruta) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public static Cliente traerClientesCedula(String cedula, String ruta) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                return clientes.get(i);
            }

        }
        return null;
    }

    public static Cliente traerClientes(String cedula, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCedula().equals(cedula)) {
                return cliente.get(i);
            }

        }
        return null;
    }

    public static Cliente traerClienteCedula(String cedula, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getCedula().equals(cedula)) {
                return cliente.get(i);
            }

        }
        return null;
    }

    public static void llenarTablaFactura(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Factura> factura = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = factura.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {

            tabla.setValueAt(factura.get(i).getFecha(), i, 0);
            tabla.setValueAt(factura.get(i).getNfactura(), i, 1);
            tabla.setValueAt(factura.get(i).getCliente().getCedula() + " " + factura.get(i).getCliente().getNombre(), i, 2);
            tabla.setValueAt(factura.get(i).getFpago(), i, 3);            
        }
    }

    public static void llenarTablaFactura(JTable tabla, ArrayList<Factura> factura) {
        DefaultTableModel tm;
        int nf;

        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = factura.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
         tabla.setValueAt(factura.get(i).getFecha(), i, 0);
            tabla.setValueAt(factura.get(i).getNfactura(), i, 1);
            tabla.setValueAt(factura.get(i).getCliente().getCedula() + " " + factura.get(i).getCliente().getNombre(), i, 2);
            tabla.setValueAt(factura.get(i).getFpago(), i, 3);
        }
    }

    public static void llenarComboClientes(JComboBox combo, String ruta) {
        ArrayList<Cliente> cliente = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Cliente c;
        for (int i = 0; i < cliente.size(); i++) {
            c = cliente.get(i);
            dcbm.addElement(c.getCedula() + " - " + c.getNombre() + " " + c.getConsumo());
        }
    }

    public static boolean buscarFacturaNfactura(String nfactura, String ruta) {
        ArrayList<Factura> facturas = traerDatos(ruta);
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getNfactura().equals(nfactura)) {
                return true;
            }
        }
        return false;
    }

    public static Factura traerFacturaNfactura(String nfactura, String ruta) {
        ArrayList<Factura> facturas = traerDatos(ruta);
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getNfactura().equals(nfactura)) {
                return facturas.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Cliente> modificarCliente(String ruta, String cedula, String nombre, String consumo, String estrato) {
        ArrayList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setConsumo(consumo);
                clientes.get(i).setEstrato(estrato);

                return clientes;
            }

        }
        return null;
    }

     public static ArrayList<Factura> modificarFactura(String ruta, String fecha, String nfactura, String fpago, Cliente cliente) {
        ArrayList<Factura> factura = traerDatos(ruta);
        for (int i = 0; i < factura.size(); i++) {
            if (factura.get(i).getNfactura().equals(nfactura)) {
                factura.get(i).setNfactura(nfactura);
                factura.get(i).setFecha(fecha);
                factura.get(i).setFpago(fpago);
                factura.get(i).setCliente(cliente);
              
                return factura;
            }
}
        return null;
     }
}
