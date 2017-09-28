package br.com.formas;

import java.awt.Graphics;

/*
 * @author Gustavo Girardon
 */

public class Circulo extends Forma {
	int x;
	int y;
	int largura;
	int altura;
	
	public Circulo(int x, int y, int largura, int altura){
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public void desenhar(Graphics g, boolean pintar){
		if (pintar){
			g.fillOval(x, y, largura, altura);
		}else {
			g.drawOval(x, y, largura, altura);
		}
		
	}
}