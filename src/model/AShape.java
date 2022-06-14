package model;

import java.awt.Graphics;

public abstract class AShape {
	protected double x;
	protected double y;

	public AShape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract void drawShape(Graphics graphics);

}
