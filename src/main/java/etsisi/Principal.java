package etsisi;

public class Principal {
    private static final int SIZE = 10;
    private Equipo[] equipos = new Equipo[SIZE];

    public static void main(String[] args) {
        new Principal().start();
    }

    private void start() {
        for (int i=0; i<SIZE; i++) {
            equipos[i] = new Equipo("Equipo " + i);
        }

        Partido partido_1 = new Partido(equipos[1], equipos[2]);
        Partido partido_2 = new Partido(equipos[1], equipos[0]);


        for (int i=0; i<SIZE; i++) {
            System.out.println(equipos[i].todosPartidos());
        }
    }
}
