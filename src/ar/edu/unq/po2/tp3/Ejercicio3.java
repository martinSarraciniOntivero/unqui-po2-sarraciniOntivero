package ar.edu.unq.po2.tp3;

public class Ejercicio3 {
    int x;
    int y;

    public void setX(int num) {
        this.x = num;
    }

    public void setY(int num) {
        this.y = num;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int multiploMayorDe() {
        for (int i = 1000; i > 0; i--) {
        	if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return -1;
    }
}
