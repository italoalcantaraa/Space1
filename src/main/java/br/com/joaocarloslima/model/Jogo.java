package br.com.joaocarloslima.model;

import java.util.ArrayList;

public class Jogo {
    public ArrayList<Asset> assets = new ArrayList<>();
    public Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);

    private int pontos;
    private int nivel = 1;

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        int x = (int) (1 + (Math.random() * (640 - 50)));

        Meteoro meteoro = new Meteoro(x, 0, 10, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public int pontuar() {
        pontos++;

        if (pontos % 10 == 0) {
            if (nivel + 1 <= 4) {
                nivel++;
            }
        }

        return pontos;
    }

    public ArrayList getAssets() {
        return assets;
    }

    public void setAssets(ArrayList assets) {
        this.assets = assets;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
