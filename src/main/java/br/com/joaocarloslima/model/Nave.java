package br.com.joaocarloslima.model;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder) {
        return new Tiro(this.getX(), this.getY(), 10, poder, Direcao.CIMA);
    }

    @Override
    public void mover() {
        if (getDirecao().equals(getDirecao().ESQUERDA)) {
            if (getX() - 10 >= 0) {
                setX(getX() - 10);
            }
            return;
        }

        if (getDirecao().equals(getDirecao().DIREITA)) {
            if (getX() + 10 <= (640 - 50)) {
                setX(getX() + 10);
            }
            return;
        }

    }
}
