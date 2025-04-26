package br.com.joaocarloslima.model;

import br.com.joaocarloslima.App;
import javafx.scene.image.ImageView;

public class Tiro extends Asset {
  private int poder;

  public Tiro(int x, int y, int velocidade, int poder, Direcao direcao) {
    super(x, y, velocidade, direcao);
    this.poder = poder;

    String path = "images/laser/laser" + poder + ".png";
    ImageView imagem = new ImageView(App.class.getResource(path).toString());
    this.setImagem(imagem);
  }

  public int getPoder() {
    return poder;
  }

  public void setPoder(int poder) {
    this.poder = poder;
  }

}
