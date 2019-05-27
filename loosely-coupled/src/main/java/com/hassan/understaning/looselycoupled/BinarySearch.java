package com.hassan.understaning.looselycoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
	private sortInt sortint;
	public BinarySearch(sortInt sortint) {
		super();
		this.sortint = sortint;
	}
	public int binarySearch(int[] number,int numberToSearch) {
		int[] sortedNumbers=sortint.sorting(number);
		System.out.println(sortint);
		return 3;
	}
}
