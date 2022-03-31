//package com.java8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lockme {

	public static void main(String[] args) throws IOException {
		String operation;
		String rootPath = "E:\\Mphasis\\";
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("Business level operation");
			System.out.println(" 1 add file");
			System.out.println("2 delete file");
			System.out.println("3 search for a file");
			System.out.println("4 go to main menu");
			System.out.println("5.exit from the app");
			operation = sc.nextLine();
			switch (operation) {
			
			case "1":
				System.out.println("Enter filename");
				Scanner sc1 = new Scanner(System.in);
				ArrayList<String> al = new ArrayList<>();

				String filename = sc1.next();
				String finalname = rootPath + filename;
				File f = new File(finalname);
				boolean b = f.createNewFile();
				if (b != true) {
					System.out.println("the file not created");
				} else {
					al.add(filename);
					System.out.println("file created");
				}
				break;
			case "2":
				Scanner sc2 = new Scanner(System.in);
				System.out.println("enter the file name to be deleted");
				String filname = sc2.nextLine();
				String finalfile = rootPath + "\\" + filname;
				System.out.print(finalfile);
				File file = new File(finalfile);
				file.delete();
				System.out.println("file deleted");
				break;
			case "3":
				File f1 = new File(rootPath);
				Scanner sc3 = new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname = sc3.next();
				File filename1[] = f1.listFiles();
				int flag = 0;
				for (File ff : filename1) {
					if (ff.getName().equals(filsearchname)) {
						flag = 1;
						break;
					} else {
						flag = 0;
					}

				}

				if (flag == 1) {
					System.out.println("found the file");
				} else {
					System.out.println("file is not found");
				}
				break;

			case "4":
				break;
			case "5":
				System.out.println("exit from menu");
				System.exit(0);
				
			}

		}
	}

}