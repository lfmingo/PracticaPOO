package etsisi;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    private List<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        new Principal().start();
    }

    private void start() {
        for (String nombre:Utils.nombres) {
            equipos.add(new Equipo(nombre));
        }


        Partido partido = null;
        for (Equipo equipo_local:equipos) {
            for (Equipo equipo_visitante : equipos)
                if (!equipo_local.equals(equipo_visitante)) {
                    partido = new Partido(equipo_local, equipo_visitante);
                    partido.setResultado((int)(Math.random()*5), (int)(Math.random()*5));
                }
        }



        for (Equipo equipo:equipos) {
            System.out.println(equipo.toString().toUpperCase());
            System.out.println("TODOS: " + equipo.todosPartidos());
            System.out.println("GANADOS: " + equipo.partidosGanados());
            System.out.println("PERDIDOS: " + equipo.partidosPerdidos());
            System.out.println("EMPATADOS: " + equipo.partidosEmpatados());
            System.out.println();
        }
    }
}
