/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author laura e isa
 */
public class Tienda 
{
    private int id_tienda;
    private String nombre;
    private String ciudad;
    private String barrio;
    private String provincia;
    private String fila;

    public Tienda(int id_tiendaa, String[] provincias, String separadorTupla, String separadorDato) {
        this.id_tienda = id_tiendaa;
        provincia = provincias[(int)(provincias.length * Math.random())];
        ciudad = generarNombre((int) (2 + 7 * Math.random()));
        barrio = generarNombre((int) (2 + 7 * Math.random())) + " " + ciudad;
        nombre = generarNombre(4);
        fila = id_tienda + separadorDato + nombre + separadorDato + ciudad + separadorDato + barrio + separadorDato + provincia + separadorTupla;            
    }
    
    private String generarNombre(int tamanio)
    {
        //rangos numéricos código Ascii (mayúsculas)
        int Num1 = 65;
        int Num2 = 90; 
        
        //rangos numéricos código Ascii minúsculas
        int num1 = 97;
        int num2 = 122;
        
        char palabra[] = new char[tamanio]; 
        
        int numAleatorio = (int) (Num1 + (Num2 - Num1) * Math.random());
        char char_letra = (char)numAleatorio;
        palabra[0] = char_letra;
        
        for (int i = 1; i < tamanio; i++)
        {
            numAleatorio = (int) (num1 + (num2 - num1) * Math.random());
            char_letra = (char)numAleatorio;
            palabra[i] = char_letra;
        }
        
        String nombree = "";
        
        for (int i = 0; i < tamanio; i++)
        {
            String letra = Character.toString(palabra[i]);
            nombree = nombree + letra;
        }
        
        return nombree;
        
    }
    
    public String getFila() {
        return fila;
    }
    
}
