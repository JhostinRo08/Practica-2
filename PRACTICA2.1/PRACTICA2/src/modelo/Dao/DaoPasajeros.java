/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Dao;

import controlador.Dao.DaoImplement;
import controlador.TDA.Listas.DynamicList;
import modelos.Pasajeros;


/**
 *
 * @author Jhostin Roja
 */
public class DaoPasajeros extends DaoImplement<Pasajeros> {
    private DynamicList<Pasajeros> PasajerosList = new DynamicList<>();
    private Pasajeros pasajeros;
    
    public DaoPasajeros(){
        super(Pasajeros.class);
    }

    public DynamicList<Pasajeros> getPasajerosList() {
        PasajerosList = all();
        return PasajerosList;
    }

    public void setPasajerosList(DynamicList<Pasajeros> PasajerosList) {
        this.PasajerosList = PasajerosList;
    }

    public Pasajeros getPasajeros() {
        if(pasajeros == null){
            pasajeros = new Pasajeros();
        }
        return pasajeros;
    }

    public void setPasajeros(Pasajeros pasajeros) {
        this.pasajeros = pasajeros;
    }
    

    public Boolean Persist() {
        pasajeros.setIdPasajeros(all().getLenght()+1);
        return Persist (pasajeros);
    }

}
