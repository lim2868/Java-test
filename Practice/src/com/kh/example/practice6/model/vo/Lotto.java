package com.kh.example.practice6.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	Random r = new Random();
	private int[] lotto;
	{
		lotto = new int[6];
//      Math.random(); 0.0<=value<1보다 낮은숫자들
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(44) + 1;
//			lotto[i] = (int)(Math.random()*45)+1;

		}
	}

	public Lotto() {}

	public void information() {
		System.out.println(Arrays.toString(lotto));
	}
}
