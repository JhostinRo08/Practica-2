/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Dao;

import controlador.Dao.DaoImplement;
import controlador.TDA.Listas.DynamicList;
import modelos.VentaBoleto;

/**
 *
 * @author Jhostin Roja
 */
public class DaoVentaBoleto extends DaoImplement<VentaBoleto>{
    
    private DynamicList<VentaBoleto> BolestosLista = new DynamicList<>();
    private VentaBoleto ventaboletos;

    public DaoVentaBoleto() {
        super(VentaBoleto.class);
    }

    public DynamicList<VentaBoleto> getBolestosLista() {
        return BolestosLista;
    }

    public void setBolestosLista(DynamicList<VentaBoleto> BolestosLista) {
        this.BolestosLista = BolestosLista;
    }

    public VentaBoleto getVentaboletos() {
        return ventaboletos;
    }

    public void setVentaboletos(VentaBoleto ventaboletos) {
        this.ventaboletos = ventaboletos;
    }
    public Boolean Persist(VentaBoleto ventaboletos1){
        ventaboletos.setIdBoletos(all().getLenght()+1);
        return Persist(ventaboletos);
    }
    
    
}
