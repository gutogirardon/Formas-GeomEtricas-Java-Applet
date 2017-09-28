package br.com.formas;

import java.awt.Graphics;
import java.awt.Polygon;

/*
 * @author Gustavo Girardon
 */

public class Triangulo extends Forma {
	private Polygon triangulo;

	public Triangulo(int x, int y, int base, int altura) {
		triangulo = new Polygon();
		triangulo.addPoint(x, y);
		triangulo.addPoint((x - (base / 2)), (y + altura));
		triangulo.addPoint((x + (base / 2)), (y + altura));
	}

	@Override
	public void desenhar(Graphics g, boolean pintar) {
		if (pintar) {
			g.fillPolygon(triangulo);
		} else {
			g.drawPolygon(triangulo);
		}
	}
}