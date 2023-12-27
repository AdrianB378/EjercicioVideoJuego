
package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideoJuego {

    public static void main(String[] args) {
        
        // Punto2
        // 1- Creamos la array list
        List <VideoJuego> listaVideojuegos = new ArrayList <VideoJuego>();
        
        // 2- Creamos el objeto VideoJuego (Creamos los videos juegos)
        //    para agregar a la ArrayList
        VideoJuego video1 = new VideoJuego(123, "Banjo Kasoie", "Nintendo 64", 4, 
                                           "Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party", "Nintendo 64", 4, 
                                           "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age of Empire II", "PC", 1, 
                                           "Estrategia");
        VideoJuego video4 = new VideoJuego(181, "Counter Strike 1.6", "PC", 1, 
                                           "Shooter");
        VideoJuego video5 = new VideoJuego(100, "Mario Kart 64", "Nintendo 64", 2, 
                                           "Plataforma");
        
        
        // Agregamos al ArrayList
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        // Punto 3
        
        for (VideoJuego video : listaVideojuegos) {
            System.out.println(" Titulo: " + video.getTitulo() + " Consola " + video.getConsola() +
                               " Cantidad de jugadores: " + video.getCantJugadores());
        }
        // Punto 4 cambio de nombre y jugadores
        video1.setTitulo("Banjo Kazoie II");
        video1.setCantJugadores(1);
        
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);
        
        // Punto 5
         for (VideoJuego video : listaVideojuegos) {
            if(video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
                
            }
        
         }    
   
    }
}