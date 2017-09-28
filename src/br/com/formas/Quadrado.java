package br.com.formas;

import java.awt.Graphics;

/*
 * @author Gustavo Girardon
 */

public class Quadrado extends Forma {
	int x;
	int y;
	int largura;
	int altura;
	
	public Quadrado(int x, int y, int largura, int altura){
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;

	}
		@Override
		public void desenhar(Graphics g, boolean pintar){
			if (pintar){
				g.fillRect(x, y, largura, altura);
			}else {
				g.drawRect(x, y, largura, altura);
			}
			
		}
	}