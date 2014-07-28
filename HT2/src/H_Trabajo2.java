/*Algoritmos y Estructura de Datos
  Integrantes: Olga Cobaquil  13020
               Álvaro Sánchez 13657  
  Fecha: 24/07/14
  Descripción: Programa Principal de la Hoja de Trabajo*/

/**
 *
 * @author Olga Cobaquil 
 */
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import java.io.*;

public class H_Trabajo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       /*Variables*/
        
        String cadenaL = null; /*cadena*/
        String lineaN=null;    /*linea nueva*/
        Stack<String> stackNuevo = new StVector<String>();
        
        FileReader reader;
        BufferedReader buffer;
        /*se requiere al usuario la ubicacino en la que e encuentra el archivo de texto*/
        /*ubicacion: variable para guardar la ubicacion*/
        String ubicacion = JOptionPane.showInputDialog(null, "Ingresela ubicacion de datos.txt :", "Ubicacion del archivo", JOptionPane.QUESTION_MESSAGE);
        /*para evitar posibles errores se usara try and catch*/
        try
        {
            reader = new FileReader(ubicacion); /*para la lectura del archivo*/
            buffer = new BufferedReader(reader);
            while ((cadenaL = buffer.readLine())!=null)
            {
                lineaN = cadenaL;
                System.out.println(cadenaL); /*impresion de la cadena que se encuentra en el archivo de texto*/
            }
        }
        
        /*si la ubicacion del archivo es incorrecta, desplegar mensaje de error y salir del programa*/
        catch(Exception noEncontrado)
        {
            System.out.println("No se encontró el archivo");
            System.exit(0); /*salir del programa*/
        }
        /* se utiliza la clase tokenizer:
           Esta permite que una aplicacion
           pueda partir una cadena string en varios tokens
        */
        System.out.println(lineaN);
        StringTokenizer cantToken = new StringTokenizer(lineaN," "); /*para la cantidad de tokens*/
        /*Revision individual de cada uno de los caraacteres que se encuentran en el archivo datos.txt*/
        while (cantToken.hasMoreTokens()) /*mientras la cantidad de tokens tenga mas tokens repetir*/
        {
            /*inicio de la comparacion para cada token*/
            /*almacenar el caracter en un string para las comparaciones*/
            String tokenActual;
            tokenActual = cantToken.nextToken();
            /*Muestra en pantalla el caracter actual encontrado en el documento*/
            System.out.println("Actual: " + tokenActual);
            /*Si es un caracter de operacion '+' o '-' o '*' o '/' se obtienen 2 caracteres de la pila, para operar*/
            if ((tokenActual.equals("+")) ||(tokenActual.equals("-"))|| (tokenActual.equals("/"))||(tokenActual.equals("*")))
            {
                  int op1 = 0;/*primer operando*/
                  int op2 = 0; /*segundo */
                  
                  int operacion; /*guarda el resultado de la operacion correspondiente*/
                  
                  op1 = Integer.parseInt(stackNuevo.pop());
                  op2 = Integer.parseInt(stackNuevo.pop());
                  
                  if (tokenActual.equals("+")) /*operacion de sum^*/
                  {
                      operacion = op1 + op2;
                      stackNuevo.push(String.valueOf(operacion));
                  }
                  else if (tokenActual.equals("-")) /*operacin de resta*/
                  {
                      operacion = op1 - op2;
                      stackNuevo.push(String.valueOf(operacion));
 
                  }
                  else if (tokenActual.equals("*")) /*operacion de multiplicacion*/
                  {
                      operacion = op1 * op2;
                      stackNuevo.push(String.valueOf(operacion));
 
                  }
                  else /*operacion de division*/
                  {
                      operacion = op1 / op2;
                      stackNuevo.push(String.valueOf(operacion));
 
                  }
            }
            else 
            {
                /*Si no se encuentra un caracter de iperacion, el caracter encontrado
                  se guarda como un numero normal en la pila
                */
                      
                stackNuevo.push(tokenActual);
            }
        }
        
        String resultado = stackNuevo.pop(); /*sacar de la pila el caracter*/
        System.out.println(resultado);
        /*muestra el resultado de la operacion evaluada en postfix*/
        JOptionPane.showMessageDialog(null, "El resultado de las operaciones fue: " + resultado, "", JOptionPane.INFORMATION_MESSAGE);
    }
}

