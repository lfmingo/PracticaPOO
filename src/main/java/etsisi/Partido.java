package etsisi;

public class Partido {
    private Equipo equipoLocal;
    private int golesLocal;
    private Equipo equipoVisitante;
    private int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.equipoLocal.addPartido(this);
        this.equipoVisitante.addPartido(this);
    }

    public Equipo equipoGanador() {
        if (golesLocal >golesVisitante) return equipoLocal;
        else if (golesLocal < golesVisitante) return equipoVisitante;
        else return null;
    }

    public void setResultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal +
                "(" + golesLocal +
                ") - " + equipoVisitante +
                "(" + golesVisitante +
                ')';
    }
}
