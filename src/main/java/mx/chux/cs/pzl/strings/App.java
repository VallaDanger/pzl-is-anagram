package mx.chux.cs.pzl.strings;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		Boolean answer = IsAnagram.strings("battle", "tablet").optimalSolution();
		
		LOGGER.log(Level.INFO, "IsAnagram: {0}", new Object[] { answer });
		
		answer = IsAnagram.strings("xxx", "yyy").optimalSolution();
		
		LOGGER.log(Level.INFO, "IsAnagram: {0}", new Object[] { answer });

	}
	
}
