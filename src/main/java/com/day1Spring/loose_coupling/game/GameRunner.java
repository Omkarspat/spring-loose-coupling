package com.day1Spring.loose_coupling.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole gamingConsole;
	
	public GameRunner(GamingConsole gamingConsole)
	{
		this.gamingConsole = gamingConsole;
	}

	public void runGame() {
		System.out.println("Game is Running Succesfully" + gamingConsole);
		
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.right();
		gamingConsole.left();
		
	}
	
	
	
}
