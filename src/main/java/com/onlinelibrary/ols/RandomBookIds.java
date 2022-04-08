package com.onlinelibrary.ols;

import java.util.HashMap;
import java.util.Map;

public class RandomBookIds {
	
	
	
    public RandomBookIds() {}
    
      
    
	

	public Map<Integer, Integer> randIds(long booksNum) {
    	int rnum;
    	Map<Integer, Integer> randNums = new HashMap<>();
    	
    	for (int gen = 0; gen < 3; gen++) {
            rnum = (int) Math.random() * (int) booksNum + 1;
            if (!randNums.containsValue(rnum))
                randNums.put(gen, rnum);
            else
                gen--;
        }
    	
    	return randNums;
    }
}
