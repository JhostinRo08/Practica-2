/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modelos;

import controlador.TDA.Listas.DynamicList;
import modelos.Pasajeros;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhostin Roja
 */
public class modeloBoleto extends AbstractTableModel {
    private DynamicList<Pasajeros> listadePasajeros;

    public DynamicList<Pasajeros> getListadePasajeros() {
        return listadePasajeros;
    }

    public void setListadePasajeros(DynamicList<Pasajeros> listadePasajeros) {
        this.listadePasajeros = listadePasajeros;
    }
    
    public int getRowCount(){
        return listadePasajeros.getLenght();
    }
    
    public int getColumnCount(){
        return 9;
    }
    public Object getValueAt(int i, int i1) {

        try {
            Pasajeros p = listadePasajeros.getInfo(i);

            switch (i1) {
                case 0:
                    return (p != null) ? p.getDNI() : "";
                case 1:
                    return (p != null) ? p.getApellidos() + " " + p.getNombres() : "";
                case 2:
                    return (p != null) ? p.getTelefono() : "";
                case 3:
                    return (p != null) ? p.getDatosboleto().getSalida(): "";
                case 4:
                    return (p != null) ? p.getDatosboleto().getLlegada(): "";
                case 5:
                    return (p != null) ? p.getDatosboleto().getFechadeSalida(): "";
                case 6:
                    return (p != null) ? p.getDatosboleto().getBoletosComprados(): "";
                case 7:
                    return (p != null) ? p.getDatosboleto().getHoradeEmbarque(): "";
                case 8:
                    return (p != null) ? p.getDatosboleto().getPrecioTotal(): "";
                default:
                    return null;

            }
        } catch (Exception ex) {
        }
        return listadePasajeros;
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID VENTA";
            case 1:
                return "USUARIO";
            case 2:
                return "TELEFONO";
            case 3:
                return "SALIDA";
            case 4:
                return "LLEGADA";
            case 5:
                return "FECHA DE SALIDA";
            case 6:
                return "BOLETOS COMPRADOS";
            case 7:
                return "HORA DE EMBARQUE";
            case 8:
                return "PRECIO TOTAL";

            default:
                return null;
        }
    }

    public double SumarTotalGanancias(int columna) {
        double Ganancias = 0.0;

        for (int fila = 0; fila < getRowCount(); fila++) {
            try {
                Object Calculo = getValueAt(fila, columna);

                if (Calculo instanceof Number) {
                    Ganancias += ((Number) Calculo).doubleValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Ganancias;
    }
}
