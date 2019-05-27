package com.hassan.understaning.looselycoupled;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements sortInt {
	public int[] sorting(int[]numbers) {
		return numbers;
	}

}
