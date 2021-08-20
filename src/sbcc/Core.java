package sbcc;


import static java.lang.System.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Core {

	public static String getSbccCoreVersion() {
		return "1.0.9";
	}


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

	/**
	 * sbcc.Core's standard input reader
	 */
	private static BufferedReader coreStdin = null;

	/**
	 * @return A reference to sbcc.Core's standard input reader.  Implmenents a thread-safe
	 * Singleton pattern.  The reader is instantiated in a lazy fashion.
	 */
	public static synchronized BufferedReader getStdin() {
		if (coreStdin == null)
			coreStdin = new BufferedReader(new InputStreamReader(in));
		return coreStdin;
	}
	
	/**
	 * Allows clients to close sbcc.Core's standard input reader.
	 * NOTE:  Once closed, the standard input cannot be reopened.
	 * 
	 * @throws IOException
	 */
	public static synchronized void closeStdin() throws IOException {
		if (coreStdin != null) {
			coreStdin.close();
			coreStdin = null;
		}
	}


	/**
	 * @return The next line of text from the standard input.
	 * @throws IOException
	 */
	public static String readLine() throws IOException {
		return getStdin().readLine();
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


	public static int[] range(int stopExclusive) {
		return IntStream.range(0, stopExclusive).toArray();
	}


	public static int[] range(int startInclusive, int stopExclusive, int step) {
		return IntStream.range(startInclusive, stopExclusive).filter(x -> (x - startInclusive) % step == 0).toArray();
	}

	public static <K, V> Map<K, V> mapOf(K k1, V v1) {
		return new HashMap(Map.of(k1, v1));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
		return new HashMap(Map.of(k1, v1, k2, v2));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8, K k9, V v9) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9));
	}


	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10));
	}
}
