package sbcc;


import static java.lang.System.*;
import static sbcc.Core.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Core {

	/**
	 * 
	 * @return This sbcc.Core version
	 */
	public static String getSbccCoreVersion() {
		return "1.0.10";
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(boolean b) {
		System.out.print(b);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(char c) {
		System.out.print(c);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(int i) {
		System.out.print(i);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(long l) {
		System.out.print(l);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(float f) {
		System.out.print(f);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(double d) {
		System.out.print(d);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(char s[]) {
		System.out.print(s);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(String s) {
		System.out.print(s);
	}


	/**
	 * Convenience method that calls System.out.print()
	 */
	public static void print(Object obj) {
		System.out.print(obj);
	}


	/**
	 * Prints a blank line.
	 */
	public static void println() {
		System.out.println();
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(boolean b) {
		System.out.println(b);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(char c) {
		System.out.println(c);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(int i) {
		System.out.println(i);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(long l) {
		System.out.println(l);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(float f) {
		System.out.println(f);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(double d) {
		System.out.println(d);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(char s[]) {
		System.out.println(s);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(String s) {
		System.out.println(s);
	}


	/**
	 * Convenience method that calls System.out.prinln()
	 */
	public static void println(Object obj) {
		System.out.println(obj);
	}


	/**
	 * Convenience method that calls System.out.printf()
	 */
	public static void printf(java.util.Locale l, String format, Object... args) {
		System.out.printf(l, format, args);
	}


	/**
	 * Convenience method that calls System.out.printf()
	 */
	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(int[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(boolean[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(long[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(float[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(double[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 1D array with values separated by commas and followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(Object[] obj) {
        System.out.println(Arrays.toString(obj));
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(char[][] obj) {
        int k = 0;
        for (char[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(int[][] obj) {
        int k = 0;
        for (int[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(boolean[][] obj) {
        int k = 0;
        for (boolean[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(long[][] obj) {
        int k = 0;
        for (long[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(float[][] obj) {
        int k = 0;
        for (float[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(double[][] obj) {
        int k = 0;
        for (double[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
    }


	/**
	 * Prints the given 2D array with values separated by commas.  Each row is followed by a lineSeparator().
	 * Credit:  Jackson Weidmann
	 */
    public static void println(Object[][] obj) {
        int k = 0;

        for (Object[] o : obj) {
            System.out.println((k == 0 ? "[" : " ") + Arrays.toString(o) + (k == obj.length - 1 ? "]" : ","));
            k++;
        }
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


	/**
	 * Reads the given file into a String.
	 * @param path Path tp read.
	 * @return All text from the file.
	 * @throws IOException
	 */
	public static String readFile(String path) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		String s = new String(Files.readAllBytes(Paths.get(path)));
		return s;
	}


	/**
	 * Writes the given list to a text file, one line per list item.
	 * @param path Path of the file to write.
	 * @param lines List of lines to write.
	 * @throws IOException
	 */
	public static void writeFileAsLines(String path, List<String> lines) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		StringBuilder sb = new StringBuilder(2 * lines.size() * lines.get(0).length());
		lines.stream().forEach(line -> sb.append(line).append(lineSeparator()));
		writeFile(path, sb.toString());
	}


	/**
	 * Writes the given text to the files specified by path.
	 * @param path
	 * @param text
	 * @throws IOException
	 */
	public static void writeFile(String path, String text) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		Files.write(Paths.get(path), text.getBytes());
	}


	/**
	 * Reads the file specified by path into a List<String> (one line per list element).
	 * @param path
	 * @return The list of strings
	 * @throws IOException
	 */
	public static List<String> readFileAsLines(String path) throws IOException {
		path = path.replaceFirst("^~", getProperty("user.home"));
		return Files.readAllLines(Paths.get(path));
	}

	
	/**
	 * Convenience method that calls Boolean.parseBoolean() to parse the given string as a boolean.
	 * @param s
	 * @return
	 */
	public static boolean parseBoolean(String s) {
		return Boolean.parseBoolean(s);
	}
	

	/**
	 * Convenience method that calls Integer.parseInt() to parse the given string as an int.
	 * @param s
	 * @return
	 */
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}


	/**
	 * Convenience method that calls Long.parseLong() to parse the given string as a long.
	 * @param s
	 * @return
	 */
	public static long parseLong(String s) {
		return Long.parseLong(s);
	}


	/**
	 * Convenience method that calls Float.parseFloat() to parse the given string as a float.
	 * @param s
	 * @return
	 */
	public static float parseFloat(String s) {
		return Float.parseFloat(s);
	}


	/**
	 * Convenience method that calls Double.parseDouble() to parse the given string as a double.
	 * @param s
	 * @return
	 */
	public static double parseDouble(String s) {
		return Double.parseDouble(s);
	}


	/**
	 * @param stopExclusive
	 * @return An int[] containing the values from 0 up to but not including stopExclusive.
	 */
	public static int[] range(int stopExclusive) {
		return IntStream.range(0, stopExclusive).toArray();
	}


	/**
	 * 
	 * @param startInclusive
	 * @param stopExclusive
	 * @param step
	 * @return An int[] containing the values from startInclusive up to but not including stopExclusive in steps of size step.
	 */
	public static int[] range(int startInclusive, int stopExclusive, int step) {
		return IntStream.range(startInclusive, stopExclusive).filter(x -> (x - startInclusive) % step == 0).toArray();
	}
	

	/**
	 * Sample usage:  <code>var list = listOf("a");</code>
	 * @param v Element to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given value.
	 */
	public static <T> List<T> listOf(T v) {
		return new ArrayList<T>(List.of(v));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2) {
		return new ArrayList<T>(List.of(v1, v2));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3) {
		return new ArrayList<T>(List.of(v1, v2, v3));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5, T v6) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5, v6));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5, T v6, T v7) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5, v6, v7));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5, T v6, T v7, T v8) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5, v6, v7, v8));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5, T v6, T v7, T v8, T v9) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5, v6, v7, v8, v9));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var list = listOf("a", "b");</code>
	 * @param v1 through vn Elements to add.
	 * @return A mutable ArrayList&lt;T&gt; with the given values.
	 */
	public static <T> List<T> listOf(T v1, T v2, T v3, T v4, T v5, T v6, T v7, T v8, T v9, T v10) {
		return new ArrayList<T>(List.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1) {
		return new HashMap(Map.of(k1, v1));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
		return new HashMap(Map.of(k1, v1, k2, v2));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8, K k9, V v9) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9));
	}


	/**
	 * Sample usage for 2 or more elements:  <code>var map = mapOf("Roya", 10, "Kian", 11);</code>
	 * @param k1 through kn keys to add.
	 * @param v1 through vn values to add.
	 * @return A mutable HashMap&lt;K,V&gt; with the given key-value entries.
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
		return new HashMap(Map.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10));
	}
}
