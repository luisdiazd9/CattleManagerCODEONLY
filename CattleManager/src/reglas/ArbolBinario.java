/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean vacio() {
        return raiz == null;
    }

    public void insertarNodoArbol(Vaca datoInsertar) {
        if (vacio()) {
            raiz = new NodoArbol(datoInsertar);
        } else {
            raiz.insertarNodo(datoInsertar);
        }
    }

    public Vaca buscarEnArbol(int datoBuscar) {
        NodoArbol respuesta = raiz;
        if (raiz.getDato().getIdentificacion() == datoBuscar) {
            return raiz.getDato();
        } else if (vacio()) {
            JOptionPane.showMessageDialog(null, "No hay elementos para buscar");
        } else {
            while (respuesta != null) {
                if (respuesta.getDato().getIdentificacion() == datoBuscar) {
                    return respuesta.getDato();
                } else if (respuesta.getDato().getIdentificacion() > datoBuscar) {
                    respuesta = respuesta.getNodoIzquierdo();
                } else if (respuesta.getDato().getIdentificacion() < datoBuscar) {
                    respuesta = respuesta.getNodoDerecho();
                }
            }
        }

        return null;
    }

    public void eliminarElemento(int datoEliminar) {
        Vaca respuesta = null;
        respuesta = buscarEnArbol(datoEliminar);
        if (!vacio()) {
            if (respuesta == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el código");
            } else {
                int n = JOptionPane.showConfirmDialog(null, "Se eliminarán cualquier registro del animal", "", JOptionPane.OK_CANCEL_OPTION);
                if (n == 0) {
                    //sí
                    if (datoEliminar == raiz.getDato().getIdentificacion()) {//Si es la raiz
                        try {
                            raiz = null;
                            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error al eliminar");
                        }
                    } else {
                        try {
                            eliminarRecursivo(raiz, datoEliminar);
                            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error al eliminar");
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos");
        }
    }

    private NodoArbol eliminarRecursivo(NodoArbol actual, int id) {

        if (actual == null) {
            return null;
        }

        if (id == actual.getDato().getIdentificacion()) {

            if (actual.getNodoIzquierdo() == null && actual.getNodoDerecho() == null) {
                return null;
            }

            if (actual.getNodoDerecho() == null) {
                return actual.getNodoIzquierdo();
            }

            if (actual.getNodoIzquierdo() == null) {
                return actual.getNodoDerecho();
            }

            int menorValor = valorMenor(actual.getNodoDerecho());
            actual.getDato().setIdentificacion(menorValor);
            actual.setNodoDerecho(eliminarRecursivo(actual.getNodoDerecho(), menorValor));
            return actual;

        }

        if (id < actual.getDato().getIdentificacion()) {
            actual.setNodoIzquierdo(eliminarRecursivo(actual.getNodoIzquierdo(), id));
            return actual;
        }

        actual.setNodoDerecho(eliminarRecursivo(actual.getNodoDerecho(), id));

        return actual;
    }

    private int valorMenor(NodoArbol root) {
        return root.getNodoIzquierdo() == null ? root.getDato().getIdentificacion() : valorMenor(root.getNodoIzquierdo());
    }

    public void modificarElemento(int datoModificar, Vaca reemplazo) {
        try {
            raiz.modificarNodo(datoModificar, reemplazo);
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

}
