package klasa;

public class Enemy extends GameObject {

	private String name;
	private int x,y;
	private int health;
	private int width, height;
	
	public Enemy(String name, int x, int y, int health, int width, int height) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.health = health;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Enemy [name=" + name + ", x=" + x + ", y=" + y + ", health=" + health + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
	
}
