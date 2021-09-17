package mx.chux.cs.pzl.strings;

import org.junit.Test;

import mx.chux.cs.pzl.PuzzleSolution;

import static org.assertj.core.api.Assertions.*;

public class IsAnagramTest {

	private void assertOptimalSolution(final PuzzleSolution<Boolean> puzzle, final Boolean expectedSolution) {
		assertThat(puzzle.optimalSolution()).isEqualTo(expectedSolution);
	}
	
	@Test
	public void isAnagramTest() {
		final PuzzleSolution<Boolean> puzzle = IsAnagram.strings("battle", "tablet");
		assertOptimalSolution(puzzle, Boolean.TRUE);
	}
	
	@Test
	public void isNotAnagramTest() {
		final PuzzleSolution<Boolean> puzzle = IsAnagram.strings("xxx", "yyy");
		assertOptimalSolution(puzzle, Boolean.FALSE);
	}
	
}
