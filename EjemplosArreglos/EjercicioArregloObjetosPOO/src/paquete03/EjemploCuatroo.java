/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploCuatroo {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        double suma = 0;
        double promedio = 0;
        Calificacion[] calificaciones = new Calificacion[2];

        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");

        calificaciones[0] = c;
        calificaciones[1] = c2;

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
            suma = suma + objetoCalificacion.obtenerNota();
        }
        promedio = suma / calificaciones.length;
        
        System.out.printf("El promedio es: %.2f\n", promedio);
        
        for (int i = 0; i < calificaciones.length; i++) {
            
        }
    }
}
