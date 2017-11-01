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