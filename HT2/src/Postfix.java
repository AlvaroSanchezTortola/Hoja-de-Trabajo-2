/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.77
 */
import javax.swing.JOptionPane;
import java.util.Vector;
/**
 *
 * @author Sanchez Tortola
 */
public class Postfix {
    

/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
  			   Álvaro Sánchez 13657  
  Fecha: 24/07/14
  Descripción: Programa Principal de la Hoja de Trabajo*/



	public static void main(String[] args) {
		String string=JOptionPane.showInputDialog("Ingrese el Postfix a calcular: "); //ingreso del postfix
		int tamanio = string.length();	//tamaño del postfix ingresado para el for
		 
		Vector<String> vector = new Vector<String>();  //creación del vector de tamaño variable
		
		//ciclo que almacena en el vector cada uno de los caracteres del postfix ingresado
		for (int i = 0; i<tamanio; i++){		
		vector.add(Character.toString(string.charAt(i)));
		}
		
		//----
		
		for (int j=0; j<(j+2);j++){
			int a = Integer.parseInt(vector.elementAt(j));
			int b = Integer.parseInt(vector.elementAt(j+1));
		}
		

	}

}
    

