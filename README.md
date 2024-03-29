# SbccCore
Provides simple static functions that make Java a *whole* lot easier to use:

```java
println("Hello");
```
rather than 
```java
System.out.println("Hell-o");
```
Other static functions:
```java
String quakeText = readFile("4.5_week.atom");

List<String> words = readFileAsLines("dict.txt");

writeFile("file.txt", str);

writeFileAsLines("lines.txt", list);

printf("%d words in %s\n", words.size(), path);

print("Hello");

var data = new int[][] {{0,1,2}, {3,4,5}, {6,7,8}};
println(data);    // print arrays (1D or 2D)

String s = readLine();  // Read a line of text from the console

parseInt/Long/Float/Double/Boolean()

Range:
for (var i : range(10))
  println(i);

var list = listOf("This", "That", "The other");   // Creates a mutable ArrayList.  Supports up to 10 values.

var map = mapOf("key1", value1, "key2", value2);  // Creates a mutable HashMap.  Supports up to 10 key/value pairs.
```

# To Use

1. Download the latest [`sbcccore.x.y.z.jar`](https://github.com/ProfessorStrenn/SbccCore/releases) into your project.
2. Add `sbcccore.x.y.z.jar` to your build path.
3. Add the following line to your Java source:
```java
import static sbcc.Core.*;
