package Klasa;

public class CircleCollider implements Collidable {

	private int centerX;
    private int centerY;
    private int radius;
    
	public CircleCollider(int centerX, int centerY, int radius) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "CircleCollider [centerX=" + centerX + ", centerY=" + centerY + ", radius=" + radius + "]";
	}
    
}
