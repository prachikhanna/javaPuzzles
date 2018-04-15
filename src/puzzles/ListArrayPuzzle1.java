package puzzles;

import java.util.ArrayList;
import java.util.List;

/*
Given,
            Scores={"Charles","84"},                                                                         
                   {"Mark","29"},
                   {"Charles","22"},
                   {"Jason","100"},
                   {"Becky","54"},
                   {"Jason","10"}.
                   };
         1.Calculate the maximum Average grade,(Jason has 55)
         2.Return 0,if you doesn't found maximum average grade.
         3. Negative scores allowed.
         4.Return type is integer, and round to the nearest integer if the maximum grade is floating value.
*/

//2245480698

class ListArrayPuzzle1 {

	static int AverageGrade(String scores[][]) {
		List<String> names = new ArrayList<String>(scores.length);

		double averageReturn = 0;

		for (int i = 0; i < scores.length; i++) {
			if (names.contains(scores[i][0])) {
				continue;
			} else {
				names.add(scores[i][0]);
			}
		}
		int totalScore[] = new int[names.size()];
		int occur[] = new int[names.size()];
		double average[] = new double[names.size()];
		for (int i = 0; i < names.size(); i++)  {
			for (int j = 0; j < scores.length; j++){
				if (names.get(i).equals(scores[j][0])){				
					totalScore[i] = totalScore[i] + Integer.parseInt(scores[j][1]);
					occur[i] = occur[i] + 1;

				}
			}
			average[i] = totalScore[i] / occur[i];
			if (average[i] > averageReturn) {
				averageReturn = average[i];
			}
		}
		return (int) averageReturn;
	}

	public static void main(String[] args) {
		String[][] scores = new String[][] { { "Charles", "84" }, { "Mark", "29" }, { "Charles", "22" },
				{ "Jason", "100" }, { "Becky", "54" },

				{ "Jason", "10" }, };

		System.out.println(AverageGrade(scores)); // 55

		String[][] scores2 = new String[][] { { "Charles", "84" }, { "Mark", "29" }, { "Charles", "22" },
				{ "Jason", "100" }, { "Becky", "54" }, { "Jason", "10" }, { "Charles", "122" } };

		System.out.println(AverageGrade(scores2)); // 76
	}
}
