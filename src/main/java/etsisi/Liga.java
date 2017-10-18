package etsisi;

public class Liga {


    private Equipo[] equipos;

    public Liga(String[] nombres) {
        equipos = new Equipo[nombres.length];
        for(int i = 0; i<nombres.length; i++)
            equipos[i] = new Equipo(nombres[i]);
    }
}
