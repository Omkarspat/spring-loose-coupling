package com.day1Spring.loose_coupling;

import com.day1Spring.loose_coupling.game.GameRunner;
import com.day1Spring.loose_coupling.game.MarioGame;
import com.day1Spring.loose_coupling.game.SuperContra;

public class App01GamingBasic {

	public static void main(String[] args) {

		// Tightly coupled
		// var - Type Inference
		// GameRunneer class is only play Mariogame
	
		var marioGame = new MarioGame();
		var superContra = new SuperContra();
		var gameRunner = new GameRunner(marioGame);
		
		// Object Creation + wiring of dependencies
		// GameRunner Class needs a game to run 
		// gamingConsole is dependency of gamerunner class
		
		var gameRunnerOfSuperContra = new GameRunner(superContra);
		// Compiler Error coupling - How Much work involved to change something
		//var gameRunner = new GameRunner(superContra);
		
		// So For make it loosely coupled we are introducing the interfaces
		                       // MarioGAme
		//GameRunner Class -   // SuperContraGAme
		                       // PacMan
		
		
                                // MarioGAme
        //GameRunner Class -    // SuperContraGAme    - //GamingConsole Interface get introduced
                                // PacMan
		gameRunner.runGame();
		gameRunnerOfSuperContra.runGame();
		
		
		// JVM/Developer is responsible Manages the beans for us like  marioGame, superContra and wiring the dependency
	}

}
