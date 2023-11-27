/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador.Dao;

import controlador.TDA.Listas.DynamicList;

/**
 *
 * @author Jhostin Roja
 */
interface DaoInterface<T> {
    public Boolean Persist(T dato);
    public Boolean Merge(T data, Integer index);
    public DynamicList<T> all();
    public T get(Integer id);
    
    
}
