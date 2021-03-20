package com.solution.java.cert;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class TestPairResult {

    /*
     * Complete the 'maxPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY skillLevel
     *  2. INTEGER minDiff
     */

    public static int maxPairs(List<Integer> skillLevel, int minDiff) {
    // Write your code here
    int count=0;
    Set s=new HashSet<Integer>();
    for (Integer integer : skillLevel) {
    	if(s.contains(skillLevel)) {
    		continue;
    	}else {
    		s.add(integer);
    		int compareCount=0;
       	 compareCount=Math.abs(integer-minDiff);
   		if(skillLevel.contains(compareCount)) {
   			int occurance=Collections.frequency(skillLevel,compareCount);
   			//skillLevel.removeAll(Collections.singleton(compareCount));
   			count+=occurance;
   		}
    	}
    	
	}
	return count;
    }

}

public class PairWitthMinDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int skillLevelCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> skillLevel = new ArrayList<>();

        for (int i = 0; i < skillLevelCount; i++) {
            int skillLevelItem = Integer.parseInt(bufferedReader.readLine().trim());
            skillLevel.add(skillLevelItem);
        }

        int minDiff = Integer.parseInt(bufferedReader.readLine().trim());

        int result = TestPairResult.maxPairs(skillLevel, minDiff);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
