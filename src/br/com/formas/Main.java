package br.com.formas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JApplet;

/*
 * @author Gustavo Girardon
 */

@SuppressWarnings("serial")
public class Main extends JApplet {
	private List<Forma> formas = new ArrayList<Forma>();

	public void init() {
		// Cria formas
		Forma circulo = new Circulo(100, 5, 50, 50);
		Forma quadrado = new Quadrado(5, 5, 50, 50);
		Forma triangulo = new Triangulo(70, 50, 100, 50);

		// Adiciona na array
		formas.add(circulo);
		circulo.setformaCor(Color.blue);
		formas.add(quadrado);
		quadrado.setformaCor(Color.red);
		formas.add(triangulo);
		//triangulo.setformaCor(Color.cyan);
	}

	@Override
	public void paint(Graphics g) {
		// cor e desenha fundo
		g.setColor(Color.red);

		// Polimorfimo: A mesma chamada do método desenhar vai executar
		// diferentes comandos para classes filhas
		for (Forma s : formas) {
			g.setColor(s.formaCor);
			s.desenhar(g, false);
		}
	}
}
