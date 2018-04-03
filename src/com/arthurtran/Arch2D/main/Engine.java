package com.arthurtran.Arch2D.main;

public interface Engine {

	/**
	 * Ticks through everything in the game.
	 */
	void tick();
	
	/**
	 * Renders all the game objects.
	 */
	void render();
	
	/**
	 * Contains the game engine for the game.
	 */
	default void runGame() {
		long beforeTime = System.nanoTime();
		double ticks = 60.0;
		double optimal = 1000000000 / ticks;
		double lastFPSTime = 0;
		long fps = 0;
		double delta = 0;
		int seconds = 0;
		boolean isRunning = true;

		while (isRunning) {
			long currentTime = System.nanoTime();
			delta += (currentTime - beforeTime) / optimal;
			long updateLength = currentTime - beforeTime;
			beforeTime = currentTime;

			while (delta >= 1) {
				tick();
				delta--;
			}

			lastFPSTime += updateLength;
			fps++;

			///// Updates the FPS/////
			if (lastFPSTime >= 1000000000) {
				System.out.println("FPS: " + fps);
				fps = 0;
				lastFPSTime = 0;
			}

			render();
		}
	}
}
