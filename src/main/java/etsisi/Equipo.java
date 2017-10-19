package etsisi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Equipo {
    private String nombre;
    private List<Partido> partidos = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return nombre;
    }

    public List<Partido> todosPartidos() {
        return partidos;
    }


    public void addPartido(Partido partido) {
        partidos.add(partido);
    }

    @Override
    public boolean equals(Object o) {
        Equipo equipo = (Equipo) o;
        return nombre.equals(equipo.nombre);
    }


    public List<Partido> partidosGanados() {
        return partidos.stream().filter(x -> x.equipoGanador() != null).filter(x -> x.equipoGanador().equals(this)).collect(Collectors.toList());
    }

    public List<Partido> partidosPerdidos() {
        return partidos.stream().filter( x -> x.equipoGanador()!=null).filter(x -> !x.equipoGanador().equals(this)).collect(Collectors.toList());
    }

    public List<Partido> partidosEmpatados() {
        return partidos.stream().filter( x -> x.equipoGanador()==null).collect(Collectors.toList());
    }
}
