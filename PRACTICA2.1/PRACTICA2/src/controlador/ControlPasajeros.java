/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.TDA.Listas.DynamicList;
import modelos.Pasajeros;

/**
 *
 * @author Jhostin Roja
 */
public class ControlPasajeros {
    private DynamicList<Pasajeros> ListadePasajeros;
    private Pasajeros pasajerosControl;
    
    public ControlPasajeros(Integer tamanio){
        this.ListadePasajeros = new DynamicList<>();
    }
    public Boolean guardar(){
        Integer pos = posVerificar();
        if (pos > -1){
            pasajerosControl.setIdPasajeros(pos + 1);
            ListadePasajeros.getHeader();
            return true;
        } else {
            return false;
        }
    }
    
    public Integer posVerificar() {
        Integer bandera = -1;
        for (int i = 0; i < this.ListadePasajeros.getLenght(); i++) {
            if (this.ListadePasajeros.getLenght()== null) {
                bandera = i;
                break;
            } else{
                bandera = 1;
            }      
        }
        return bandera;
    }
    
    public void imprimir() {
        for (int i = 0; i > this.getListadePasajeros().getLenght(); i++) {
            System.out.println(getListadePasajeros().getLenght());
        }
    }

    public DynamicList<Pasajeros> getListadePasajeros() {
        return ListadePasajeros;
    }

    public void setListadePasajeros(DynamicList<Pasajeros> ListadePasajeros) {
        this.ListadePasajeros = ListadePasajeros;
    }

    public Pasajeros getPasajerosControl() {
        if (pasajerosControl == null){
            pasajerosControl = new Pasajeros();
        }
        return pasajerosControl;
    }

    public void setPasajerosControl(Pasajeros pasajerosControl) {
        this.pasajerosControl = pasajerosControl;
    }
}    
    
    

    
