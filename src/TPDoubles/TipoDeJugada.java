package TPDoubles;

public enum TipoDeJugada {
    NADA(0),
    TRIO(1),
    COLOR(2),
    POKER(3);

    private int jerarquia;

    TipoDeJugada(int jerarquia) {
        this.jerarquia = jerarquia;
    }

    public int getJerarquia() {
        return jerarquia;
    }
}
