package com.java.chap02;

public class Demo12 {
	public static void main(String[] args) {
		int a=-1;
		// if 语句
		//多行注释  先选中行，按 ctrl+shift+/
		if (a>0) {
			System.out.println(a+"是正数");
		}
		// if...else 语句
		if (a>0) {
			System.out.println(a+"是正数");
		}else{
			System.out.println(a+"不是正数");
		}
		// if...else if...else
		if (a>0) {
			System.out.println(a+"是正数");
		}else if (a<0) {
			System.out.println(a+"是负数");
		}else{
			System.out.println(a+"是0");
		}
	}

}
