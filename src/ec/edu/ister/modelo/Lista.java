/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * Nombre: Ayo Esteban 
 */
public class Lista {
    protected Nodo primero;
 public Lista(){
    primero = null;
}
 public Lista insertarCabezaLista(int entrada){
    Nodo nuevo ;
    nuevo = new Nodo(entrada);
    nuevo.getEnlace = primero;
    primero = nuevo;
    return this;
}
  public void visualizar()
{
    Nodo n;
    int k = 0;
    n = primero;
    while (n != null)
{
    System.out.print(n.getDato() + " ");
     n = n.getEnlace;
     k++;
   System.out.print( (k%15 != 0 ? " " : "\n"));
} 
}
    

}
