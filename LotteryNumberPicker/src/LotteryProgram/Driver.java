package LotteryProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static Scanner sc = new Scanner(System.in);

	public static void RandNum(int[] arr) {

		Random rand = new Random();

		// White ball Numbers
		for (int i = 0; i < 5; ++i) {
			arr[i] = rand.nextInt(1, 69);
		}
		// PowerBall Numbers
		arr[5] = rand.nextInt(1, 26);
		// 파워볼 번호만 빨간색으로 표시하는 법?

	}

	public static void print(int[] arr) throws IOException {

		RandNum(arr);
		range(arr);

		System.out.println("=".repeat(30));
		System.out.println("The generated number is...");
		for (int i = 0; i < arr.length; ++i) {
			if (i == 5) {
				System.out.println("+ " + arr[5]);
				System.out.println("=".repeat(30));
			} else {
				System.out.print(arr[i] + " ");
			}
		}

		boolean condition = true;
		System.out.println("Do you want to save to file? Y(y) or N(n)");
		char ans = sc.next().charAt(0);
		while (condition) {
			if (ans == 'Y' || ans == 'y') {
				saveFile(arr);
				condition = false;
			} else if (ans == 'N' || ans == 'n') {
				System.out.println("The numbers aren't saved to file.");
				condition = false;
			} else {
				System.out.println("Please answer correctly!");
			}
		}

	}

	public static void range(int[] arr) {

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - j; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void saveFile(int[] arr) throws IOException {

		File save = new File("Saved.txt");
		FileWriter wf = new FileWriter(save, true);
		for (int i = 0; i < arr.length; ++i) {
			if (i == 5) {
				wf.write("+ " + arr[5] + "\n");
			} else {
				wf.write(arr[i] + " ");
			}
		}
		System.out.println("Successfully saved to file!");
		wf.close();

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];
		boolean condition = true;

		System.out.println("Hello! This is a program that makes random lottery number(PowerBall)");

		do {
			System.out.println("Do you want to continue? Y(y) or N(n)");
			char ans = sc.next().charAt(0);
			if (ans == 'Y' || ans == 'y') {
				print(arr);
			} else if (ans == 'N' || ans == 'n') {
				System.out.println("Program has ended.");
				System.exit(0);
			} else {
				System.out.println("Please answer correctly!");
			}
		} while (condition);

	}

}
