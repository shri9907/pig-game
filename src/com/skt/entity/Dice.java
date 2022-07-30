package com.skt.entity;

public class Dice {
	
	public int roll() {
		int value = (int) ((Math.random()*6)+1);
		return value;
	}

}
