package com.day1Spring.loose_coupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.day1Spring.loose_coupling.game.GameRunner;
import com.day1Spring.loose_coupling.game.GamingConsole;
import com.day1Spring.loose_coupling.game.MarioGame;

@Configuration
@ComponentScan
public class App02GamingSpring {
	
	

	public static void main(String[] args) {
		
	   try (var context = new AnnotationConfigApplicationContext(App02GamingSpring.class))
	   {
		   context.getBean(GameRunner.class).runGame();
	   }
	
	  // available: expected single matching bean but found 2: marioGame,superContra
	   
	   // JVM manging the gaming beans before
	   // Now we have Coonfiguration class having beans so spring is managing beans
	   
	   // For Making Code simpler
	   
	   // Marked Beans with annotation @componenet
	   // like pacman,MarioGame,Gamerunner
	   // Spring is maanaging beans for for us by using componentscan
	   // wiring the dependecies in gamerunner class like mariogame or supercontra
	   // Managing lifecycle of beans
	   // @Qualifier has highest priority than @primary
	   
	}

}
