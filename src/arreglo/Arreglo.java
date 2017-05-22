package arreglo;

import javax.swing.JOptionPane;
public class Arreglo {


    public static void main(String[] args) {
        int promedio;
        int [] numero1=new int [4];
        for (int i=0; i<numero1.length; i++){
          numero1[4]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero por favor"));
        }
        promedio= calcularPromedio (numero1);
        imprimir (promedio);
    }
    
    public static int calcularPromedio (int numero1[]){
            int suma = 0, promedio;
    for (int i=0; i<numero1.length; i+=2){
    suma= suma+numero1[i];
    }
    promedio= (int) suma/5;
    return promedio;
    }
    
    public static void imprimir (int promedio){
        System.out.print ("El resultado del promedio es " + promedio);
//        return respuesta;
    }
}

    
    


