package com.example.biomex;

public class NodoArbol
{
    private String etq;
    private Object obj;
    private NodoArbol izq=null;
    private NodoArbol der=null;

    public NodoArbol(String etq, Object obj)
    {
        this.etq = etq;
        this.obj = obj;
    }

    public String getEtq() {
        return etq;
    }

    public void setEtq(String etq) {
        this.etq = etq;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
}
