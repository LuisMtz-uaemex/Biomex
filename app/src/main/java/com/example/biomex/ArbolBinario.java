package com.example.biomex;

public class ArbolBinario
{
    //codigo para los arboles binarios a utilizar

    private NodoArbol r=null;
    public NodoArbol inserta(NodoArbol r, NodoArbol n)
    {
        if (r==null)
        {
            return n;
        }else
        {
            if (r.getEtq().compareTo(n.getEtq())>0)
            {
                r.setIzq(inserta(r.getIzq(),n));
            }else
            {
                r.setDer(inserta(r.getDer(),n));
            }
            return r;
        }
    }
    public void elimina(NodoArbol r, String etq, NodoArbol arr[])
    {
        if (r==null)
        {
            arr[0]=null;
            arr[1]=r;
        } else
        {
            if (r.getEtq().equals(etq))//encontre el dato a eliminar
            {
                if (r.getDer()==null && r.getIzq()==null)//no tiene hijos
                {
                    arr[0]=r;
                    arr[1]=null;
                } else
                {
                    if (!(r.getDer() !=null && r.getIzq() !=null))//tiene un hijo
                    {
                        if(r.getDer()!=null)
                        {
                            arr[1]=r.getDer();
                        } else
                        {
                            arr[1]=r.getIzq();
                        }
                    } else
                    {
                        if (r.getDer().getIzq() == null)
                        {
                            arr[1]=r.getDer();
                            r.getDer().setIzq(r.getIzq());
                        } else
                        {
                            NodoArbol se =sucesorE(r.getDer());
                            arr[1]= se.getIzq();
                            se.setIzq(arr[1].getDer());
                            arr[1].setDer(r.getDer());
                            arr[1].setIzq(r.getIzq());
                        }
                        r.setDer(null);
                        r.setIzq(null);
                    }
                }
            } else
            {
                if (r.getEtq().compareTo(etq)>0)
                {
                    elimina(r.getIzq(),etq,arr);
                    r.setIzq(arr[1]);
                } else
                {
                    elimina(r.getDer(),etq,arr);
                    r.setDer(arr[1]);
                }
                arr[1]=r;
            }
        }
    }
    public String enOrden(NodoArbol r)
    {
        String s="";
        if (r!=null)
        {
            s+=enOrden(r.getIzq());
            s+=r.getEtq();
            s+=enOrden(r.getDer());
        }
        return s;
    }
    public String prenOrden(NodoArbol r)
    {
        String s="";
        if (r!=null)
        {
            s+=r.getEtq();
            s+=prenOrden(r.getIzq());
            s+=prenOrden(r.getDer());
        }
        return s;
    }
    public String posOrden(NodoArbol r)
    {
        String s="";
        if (r!=null)
        {
            s+=posOrden(r.getIzq());
            s+=posOrden(r.getDer());
            s+=r.getEtq();
        }
        return s;
    }
    public NodoArbol sucesorE(NodoArbol r)
    {
        if (r.getIzq().getIzq()!=null)
        {
            return sucesorE(r.getIzq());
        }else
        {
            return r;
        }
    }

    public NodoArbol getR()
    {
        return r;
    }

    public void setR(NodoArbol r)
    {
        this.r = r;
    }
}
