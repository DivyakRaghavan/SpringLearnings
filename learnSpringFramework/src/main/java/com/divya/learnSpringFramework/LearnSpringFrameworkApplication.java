package com.divya.learnSpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.divya.learnSpringFramework.game.GameRunner;
import com.divya.learnSpringFramework.game.MarioGame;
import com.divya.learnSpringFramework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		
		//Created through JavaCode
		
		//MarioGame game=new MarioGame();
		//SuperContraGame game=new SuperContraGame();
		//runGame 
		//GameRunner runner=new GameRunner(game);
		runner.runGame();
		
		//Spring Framework
		
		
		
	}

}
