import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private final String name;
	private int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		switch (name) {
		case "j":
			color = Color.CYAN;
			break;
		case "l":
			color = Color.GOLD;
			break;
		case "o":
			color = Color.RED;
			break;
		case "s":
			color = Color.FORESTGREEN;
			break;
		case "t":
			color = Color.BROWN;
			break;
		case "z":
			color = Color.BLACK;
			break;
		case "i":
			color = Color.YELLOW;
			break;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}


	public String getName() {
		return name;
	}

	public int getForm() {
		return form;
	}

	public void changeForm() {
		if (form != 4) {
			form++;
		} else {
			form = 1;
		}
	}
}