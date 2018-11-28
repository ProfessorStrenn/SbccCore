package sbcc;

import static java.lang.System.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Core {

	public static void print(boolean b) {
		System.out.print(b);
	}


	public static void print(char c) {
		System.out.print(c);
	}


	public static void print(int i) {
		System.out.print(i);
	}


	public static void print(long l) {
		System.out.print(l);
	}


	public static void print(float f) {
		System.out.print(f);
	}


	public static void print(double d) {
		System.out.print(d);
	}


	public static void print(char s[]) {
		System.out.print(s);
	}


	public static void print(String s) {
		System.out.print(s);
	}


	public static void print(Object obj) {
		System.out.print(obj);
	}


	public static void println() {
		System.out.println();
	}


	public static void println(boolean b) {
		System.out.println(b);
	}


	public static void println(char c) {
		System.out.println(c);
	}


	public static void println(int i) {
		System.out.println(i);
	}


	public static void println(long l) {
		System.out.println(l);
	}


	public static void println(float f) {
		System.out.println(f);
	}


	public static void println(double d) {
		System.out.println(d);
	}


	public static void println(char s[]) {
		System.out.println(s);
	}


	public static void println(String s) {
		System.out.println(s);
	}


	public static void println(Object obj) {
		System.out.println(obj);
	}


	public static void printf(java.util.Locale l, String format, Object... args) {
		System.out.printf(l, format, args);
	}


	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	/*
	 * printArray method written by Jackson Weidmann
	 * 
	 * this method will take in a 1-D or 2-D array and print it out.
	 * 
	 * Example: [0,1,2,3]
	 * 
	 * or
	 * 
	 * [[0,1,2,3],\n[4,5,6,7],\n[8,9,10,11]]
	 */


	// Print 1-D array
	public static void printArray(int[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	public static void printArray(boolean[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	public static void printArray(long[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	public static void printArray(float[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	public static void printArray(double[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	public static void printArray(Object[] obj) {
		System.out.println(Arrays.toString(obj));
	}


	// Print 2-D array
	public static void printArray(char[][] obj) {
		int k = 0;
		for (char[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(int[][] obj) {
		int k = 0;
		for (int[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(boolean[][] obj) {
		int k = 0;
		for (boolean[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(long[][] obj) {
		int k = 0;
		for (long[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(float[][] obj) {
		int k = 0;
		for (float[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(double[][] obj) {
		int k = 0;
		for (double[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	public static void printArray(Object[][] obj) {
		int k = 0;

		for (Object[] o : obj) {
			System.out.println((k == 0 ? "[" : "") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
			k++;
		}
	}


	/**
	 * Returns the next line of text from System.in (typically the keyboard). This
	 * method makes it very easy use, but it is not efficient because it creates new
	 * BufferReader and InputStreamReader with each call.
	 * 
	 * @return The next line of text from the standard input.
	 * @throws IOException
	 */
	public static String readLine() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		return br.readLine();
	}


	public static String readFile(String path) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		String s = new String(Files.readAllBytes(Paths.get(path)));
		return s;
	}


	public static void writeFileAsLines(String path, List<String> lines) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		StringBuilder sb = new StringBuilder(2 * lines.size() * lines.get(0).length());
		lines.stream().forEach(line -> sb.append(line).append(lineSeparator()));
		writeFile(path, sb.toString());
	}


	public static void writeFile(String path, String text) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		Files.write(Paths.get(path), text.getBytes());
	}


	public static List<String> readFileAsLines(String path) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		return Files.readAllLines(Paths.get(path));
	}


	public static boolean parseBoolean(String s) {
		return Boolean.parseBoolean(s);
	}


	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}


	public static long parseLong(String s) {
		return Long.parseLong(s);
	}


	public static float parseFloat(String s) {
		return Float.parseFloat(s);
	}


	public static double parseDouble(String s) {
		return Double.parseDouble(s);
	}
}
