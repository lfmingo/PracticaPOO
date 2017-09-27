package etsisi;

import java.util.ArrayList;
import java.util.List;

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

    public String todosPartidos() {
        return nombre + "\n" + partidos + "\n";
    }


    public void addPartido(Partido partido) {
        partidos.add(partido);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return nombre.equals(equipo.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
