package com.day1Spring.loose_coupling.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class MarioGame implements GamingConsole {
	
	public void up()
	{
		System.out.println("Up");
	}
	
	public void down()
	{
		System.out.println("down");
	}
	
	public void left()
	{
		System.out.println("left");
	}
	
	public void right()
	{
		System.out.println("right");
	}

}
