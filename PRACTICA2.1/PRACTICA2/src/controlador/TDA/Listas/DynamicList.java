/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.TDA.Listas;

import controlador.TDA.Listas.Exceptions.EmptyException;



/**
 *
 * @author Jhostin Roja
 * @param <E>
 */
public class DynamicList<E> {
    private Node<E> Header;
    private Node<E> Last;
    private Integer lenght;
    
    
    public DynamicList(){
      Header = null;
      Last = null;
      lenght = 0;
    }

    public Node<E> getHeader() {
        return Header;
    }

    public void setHeader(Node<E> Header) {
        this.Header = Header;
    }

    public Node<E> getLast() {
        return Last;
    }

    public void setLast(Node<E> Last) {
        this.Last = Last;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

   
    public Boolean isEmpty() {
        return (Header == null || lenght == 0);
    }
    public void add(E info){
        addLast(info);
    }    
    
    public void addFirst(E info){
        Node<E> help;
        if(isEmpty()){
            help = new Node<>(info);
            Header = help;
            Last = help;
            lenght++;
        } else {
            Node<E> headHelp = Header;
            help = new Node<>(info, headHelp);
            Header = help;
        }
        lenght++;
    }
    
    public void addLast(E info){
        Node<E> help;
        if (isEmpty()) {
            addFirst(info);
        } else {
            help = new Node<>(info, null);
            Last.setNext(help);
            Last = help;
            lenght++;
        }
    }

    
    private E getFirst() throws EmptyException {
        if (isEmpty()) {
            throw new EmptyException("Lista vacia");
        }
        return Header.getInfo();
    }
    
//    private E getLast() throws EmptyException{
//        if(isEmpty()){
//            throw new EmptyException("Lista vacia");
//        }
//        return Last.getInfo();
//    }
    public E getInfo(Integer indice) throws EmptyException, IndexOutOfBoundsException {
        return ObtenerNode(indice).getInfo();
    }

    private Node<E> ObtenerNode(Integer index) throws EmptyException, IndexOutOfBoundsException{
        if (isEmpty()) {
            throw new EmptyException("Error. Lista vacia");
        } else if (index < 0 || index.intValue() == lenght){
            throw new IndexOutOfBoundsException("Error. Fuera del nodo");
        } else if (index == 0) {
            return Header;
        } else if (index == (lenght - 1)) {
            return Last;
        } else {
            Node<E> search = Header;
            int cont = 0;
            while (cont < index) {
                cont++;
                search = search.getNext();
            }
            return search;
        }
    }

    public E eliminar(Integer pos) throws EmptyException {
        if (!isEmpty()) {
            E dato = null;
            if (pos >= 0 && pos < lenght) {
                if (pos == 0) {
                    dato = Header.getInfo();
                    Header = Header.getNext();
                    lenght--;
                } 
                else {
                    Node<E> aux = Header;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getNext();
                    }
                    dato = aux.getInfo();
                    Node<E> proximo = aux.getNext();
                    aux.setNext(proximo.getNext());
                    lenght--;
                }
            } 
            else {
                throw new IndexOutOfBoundsException();
            }
            return dato;
        } 
        else {
            throw new EmptyException();
        }
    }

    public E obtener(Integer posicion) throws EmptyException, IndexOutOfBoundsException {

        if (!isEmpty()) {
            E dato = null;
            if (posicion >= 0 && posicion < lenght) {
                if (posicion == 0) {
                    dato = Header.getInfo();
                } else {
                    Node<E> aux = Header;
                    for (int i = 0; i < posicion; i++) {
                        aux = aux.getNext();
                    }
                    dato = aux.getInfo();
                }
            } else {
               throw new IndexOutOfBoundsException();
            }
            return dato;
        } else {
            throw new EmptyException();
        }
    }

    public void ModificarInfo(E dato, Integer posicion) throws IndexOutOfBoundsException {
        if (!isEmpty()) {
            add(dato);
        } else if (posicion >= 0 && posicion < lenght) {
            if (posicion == 0) {
                Header.setInfo(dato);
            } else {
                Node<E> aux = Header;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getNext();
                }
                aux.setInfo(dato);
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    public DynamicList<E> GetList(){
        DynamicList<E> list = new DynamicList<>();
        Node<E> actual = Header;
        while (actual != null){
            list.addFirst(actual.getInfo());
            actual = actual.getNext();
        }
        return list;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de los Datos\n");
        try {
            Node<E> help = Header;
            isEmpty();
            while (help != null) {
                sb.append(help.getInfo().toString());
                help = help.getNext();
            }
        } catch (Exception e) {
            sb.append(e.getMessage());
        }
        return sb.toString();
    }
    
}
    
    
    ////



    