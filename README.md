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

String s = readLine();  // Read a line of text from the console

parseInt/Long/Float/Double/Boolean()
```

# To Use
Add sbcccore.x.y.z.jar to your build path.
Add the following line to your Java source:
```java
import static sbcc.Core.*;
