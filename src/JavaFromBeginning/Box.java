package JavaFromBeginning;

public class Box {
	// declaring instance variable
	private int height;
	private int width;
	private int depth;

	// will take no arguments and will return volume
	public int volume() {

		return width * height * depth;
	}

	// will take arguments and will return volume.
	public int volume(int width, int height, int depth) {

		return width * height * depth;
	}

	// default constructor
	public Box() {
		this.height = 1;
		this.width = 1;
		this.depth = 1;

	}

	// Parameterized constructor
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// creating setter and getter to set and to get instance variable
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}
