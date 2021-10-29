/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

/**
 *
 * @author Usuario
 */
public class NodoArbol {

    private NodoArbol nodoDerecho;
    private NodoArbol nodoIzquierdo;
    private Vaca dato;

    public NodoArbol(Vaca dato) {
        this.dato = dato;
        nodoDerecho = nodoIzquierdo = null;
    }

    public void insertarNodo(Vaca datoInsertar) {
        if (datoInsertar.getIdentificacion() < dato.getIdentificacion()) {
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(datoInsertar);
            } else {
                nodoIzquierdo.insertarNodo(datoInsertar);
            }
        } else if (datoInsertar.getIdentificacion() > dato.getIdentificacion()) {
            if (nodoDerecho == null) {
                nodoDerecho = new NodoArbol(datoInsertar);
            } else {
                nodoDerecho.insertarNodo(datoInsertar);
            }
        }
    }

//    public Vaca buscarNodo(int busqueda) {
//        Vaca retorna = null;
//        if (busqueda == dato.getIdentificacion()) {
//            return this.getDato();
//        } else if (busqueda > dato.getIdentificacion()) {
//            nodoDerecho.buscarNodo(busqueda);
//        } else {
//            nodoIzquierdo.buscarNodo(busqueda);
//        }
//        return retorna;
//    }

    public void modificarNodo(int busqueda, Vaca reemplaza) {
        if (busqueda == dato.getIdentificacion()) {
            dato = reemplaza;
        } else if (busqueda > dato.getIdentificacion()) {
            nodoDerecho.modificarNodo(busqueda, reemplaza);
        } else {
            nodoIzquierdo.modificarNodo(busqueda, reemplaza);
        }
    }

//    public void eliminarNodo(int nodo) {
//        NodoArbol anterior = null;
//        if (nodo == dato.getIdentificacion()) {
//            if (dato.getIdentificacion() > nodo) {
//                anterior.setNodoDerecho(null);
//            } else {
//                anterior.setNodoIzquierdo(null);
//            }
//        } else if (nodo > dato.getIdentificacion()) {
//            anterior = this;
//            nodoDerecho.eliminarNodo(nodo);
//        } else {
//            anterior = this;
//            nodoIzquierdo.eliminarNodo(nodo);
//        }
//    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodoArbol nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoArbol nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Vaca getDato() {
        return dato;
    }

    public void setDato(Vaca dato) {
        this.dato = dato;
    }

}
