package com.jrg.structure;

/**
 * Write a java program to display the following structure.
 *
 * #
 * ###
 * #####
 * ###
 * #
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Structure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i=0;i<6;i++){
			if (i % 2 != 0) {
				for(int j=i; j>0; j--) {
					System.out.print("#");
				}
			System.out.println();
			}
		}

		for (int i=3;i>0;i--){
			if (i % 2 != 0) {
				for(int j=0; j<i; j++) {
					System.out.print("#");
				}
			System.out.println();
			}
		}
	}
}
