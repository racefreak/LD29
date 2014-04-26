package net.joaolourenco.ld;

import com.thecherno.cherno.engine.Cherno;
import com.thecherno.cherno.engine.level.TiledLevel;

public class Main extends Cherno {
	
	private TiledLevel level;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}

	protected void init() {
		levels();
		createDisplay("Beneath the Surface", 960, 540, 1.5);
		setInput(KEYBOARD | MOUSE);
		start();
	}
	
	private void levels(){
		level = new TiledLevel("");
		level.setTileSize(32);
	}

	protected void update() {
		
	}

	protected void render() {
		
	}
	
}