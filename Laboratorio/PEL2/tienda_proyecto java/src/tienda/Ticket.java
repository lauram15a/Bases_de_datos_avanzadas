/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author laura
 */
public class Ticket 
{
    private int numTicket;
    private int importe = (int)(100 + (10000-100)*Math.random());
    private String fechaLaura;
    private String fechaIsa;
    private int cod_trabajador;
    private String filaLaura;
    private String filaIsa;

    public Ticket(int numTickett, int cod_trabajadorr, String separadorTupla, String separadorDato) {
        this.numTicket = numTickett;
        this.cod_trabajador = cod_trabajadorr;
        asignarFecha();
        filaLaura = numTicket + separadorDato + importe + separadorDato + fechaLaura + separadorDato + cod_trabajador + separadorTupla;
        filaIsa = numTicket + separadorDato + importe + separadorDato + fechaIsa + separadorDato + cod_trabajador + separadorTupla;
    }
        
    private void asignarFecha()
    {
        int mes;
        int dia = (int)(1 + 30*Math.random());
        if (dia == 31)
        {
            int[] mesLista = new int[] {1, 3, 5, 7, 8, 10, 12};
            mes = mesLista[(int)(mesLista.length * Math.random())];
        }
        else if (dia > 28)
        {
            int[] mesLista = new int[] {1, 3, 5, 7, 8, 10, 12, 4, 6, 9, 11};
            mes = mesLista[(int)(mesLista.length * Math.random())];
        }
        else
        {
            mes = (int)(1 + 11*Math.random());
        }
            
        fechaLaura = dia + "-" + mes + "-" + "2019";
        fechaIsa = mes + "-" + dia + "-" + "2019";
    }

    public String getFilaLaura() {
        return filaLaura;
    }

    public String getFilaIsa() {
        return filaIsa;
    }
}
