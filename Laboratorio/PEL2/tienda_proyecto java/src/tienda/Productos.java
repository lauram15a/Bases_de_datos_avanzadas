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
public class Productos 
{
    private int codigo_barras;
    private String nombre;
    private String tipo;
    private String descripcion;
    private int precio;
    private String fila;

    public Productos(int codigo_barrass, String[] tipos, String[] descripciones, String separadorTupla, String separadorDato) {
        this.codigo_barras = codigo_barrass;
        nombre = generarNombre(6);
        tipo = tipos[(int)(tipos.length * Math.random())];
        descripcion = descripciones[(int)(descripciones.length * Math.random())];
        precio = (int)(50 + (1000-50) * Math.random());
        fila = codigo_barras + separadorDato + nombre + separadorDato + tipo + separadorDato + descripcion + separadorDato + precio + separadorTupla;
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
