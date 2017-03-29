package com.xpec.ci.web_server_ci.ops;

public class Ops {

	public int sum(int x, int y){
		return x+y;
	}
	
	public int multiSum(int... x){		
		int res = 0;
		for( int y : x ){
			res += y;
		}
		return res;
	}
	
}
