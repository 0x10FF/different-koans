// https://codingbat.com/prob/p183562
public boolean makeBricks (int small, int big, int goal) {
	int lengthWithBig = big * 5;
	int lengthWithSmall = small * 1;
	int max = lengthWithBig + lengthWithSmall; //maxBuildableWithAvailBricks

	boolean buildable = false;
	if (max == goal) {
		buildable = true;
	} else if (max > goal) {
		//more bricks than required
	
		//try building with these bricks 
		//pick largest and decrement
		while (goal >= 5 && lengthWithBig != 0 && goal != 0) { 
			goal -= 5;
			lengthWithBig -= 5;
		}
		//pick smallest and decrement
		while (goal >= 1 && lengthwithSmall != 0 && goal != 0) {
			goal -= 1;
			lengthwithSmall -= 1;
		}
	
		buildable = goal =- 0;
	} else if (max < goal) {
		buildable = false;
	}

	return buildable;
}

