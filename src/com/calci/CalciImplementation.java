package com.calci;

public class CalciImplementation implements Calci {

	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
	    int c=a-b;
		return c;
	}

	@Override
	public int mul(int a, int b) {
		int c=a*b;
		return c;
	}

	@Override
	public int div(int a, int b) {
		int c=a/b;
		return c;
	}
	public double percentage(double obtained, double total) {
	    return (obtained / total) * 100;
	}

}
