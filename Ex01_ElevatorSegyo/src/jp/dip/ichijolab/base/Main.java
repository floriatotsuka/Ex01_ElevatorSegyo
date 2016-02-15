package src.jp.dip.ichijolab.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Floria TOTSUKA
 * @since 2016/02/14
 * @version 0.1
 *
 */

public class Main {

	/*
	 * 初期化メソッド
	 */
	static void init(){
		System.out.println("Ex01_Elevator Project");
		System.out.println("manual [ 0:end , 1-10:floor  ]");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
	}


	public static void main(String[] args) {

		UserControl usr = new UserControl();
		Boolean handle = true;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		init();


		while(handle){

			String buf;
			try {
				buf = br.readLine();

				if(buf.equals("0")){
					handle = false;
				} else {
					usr.walkToFloor(Integer.parseInt(buf));
				}


			} catch (IOException e) {
				System.out.println(e.getCause());
				e.printStackTrace();
			}

		}

		System.out.println("close.");

	}

}
