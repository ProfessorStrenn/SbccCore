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

String s = readLine();

parseInt/Long/Float/Double/Boolean()
```
