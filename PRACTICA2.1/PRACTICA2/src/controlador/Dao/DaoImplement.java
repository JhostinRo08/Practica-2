/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Dao;

import com.thoughtworks.xstream.XStream;
import controlador.TDA.Listas.DynamicList;
import controlador.dao.Bridge;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jhostin Roja
 * @param <T>
 */
public abstract  class DaoImplement<T> implements DaoInterface<T> {
    private Class<T> clazz;
    private XStream conection;
    private String URL;
    
    
    public DaoImplement(Class<T> clazz) {
        this.clazz = clazz;
        conection = Bridge.getConection();
        URL = Bridge.URL + clazz.getSimpleName() + ".json";
    }
    
    
    
    @Override
    public Boolean Persist(T dato) {
        DynamicList<T> ld = all();
        ld.add(dato);
        
        try {
            conection.toXML(ld,new FileWriter(URL));
            return true;
        } 
        catch (IOException e) {
            return false;
        }
    }

    @Override
    public Boolean Merge(T data, Integer index) {

        DynamicList<T> listaActualizada = all();

        try {
            listaActualizada.ModificarInfo(data, index);

            conection.toXML(listaActualizada, new FileWriter(URL));

            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public DynamicList<T> all() {
        DynamicList<T> dl = new DynamicList<>();
        try {
            dl = (DynamicList<T>)conection.fromXML(new FileReader(URL));
        } 
        catch (Exception e) {
            
        }
        return dl;
    }

    @Override
    public T get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Boolean Eliminar(Integer index) {
        DynamicList<T> listaActualizada = all();

        try {
            listaActualizada.eliminar(index);

            conection.toXML(listaActualizada, new FileWriter(URL));

            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
}
