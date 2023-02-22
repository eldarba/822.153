package d.recursion;

import java.io.File;

public class Demo5FileSystem {

	static void printContent(String path) {
		File file = new File(path);
		// base case is when the path points to to a file
		if (file.isFile()) {
			System.out.println("\t" + file.getName());
		} else {
			System.out.println(file);
			// if we are here the path is a directory and we need all its content
			File[] files = file.listFiles();
			// send each file to this same method
			for (File currFile : files) {
				printContent(currFile.getPath());
			}
		}

	}

	public static void main(String[] args) {

		String path = "C:\\Java Course Files";
		printContent(path);

		/////////////////////////////////////////////////////////////
		// How to work with the file system
		// notice that File represents a File or Directory

//		String path = "C:/eldar/153/html";
//		File file = new File(path);
//		if (file.exists()) {
//			if (file.isDirectory()) {
//				System.out.println(file + " is a directory");
//			} else {
//				System.out.println(file + " is a file");
//			}
//		} else {
//			System.out.println(file + " dosen't exist");
//		}

	}

}
