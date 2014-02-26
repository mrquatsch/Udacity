Testing AverageDemo
===================

  Actual output                                                                               Expected output
  --------------------------------------------------------------------------------------------------------------------------
  Enter a value, 0 to quit: 20.1                                                              Enter a value, 0 to quit: 20.1
- java.util.InputMismatchException                                                            Enter a value, 0 to quit: 18.9
- at java.util.Scanner.throwFor(Scanner.java:909)                                             Enter a value, 0 to quit: 19.3
- at java.util.Scanner.next(Scanner.java:1530)                                                Enter a value, 0 to quit: 0
- at java.util.Scanner.nextInt(Scanner.java:2160)                                             Average: 19.43
- 	at java.util.Scanner.nextInt(Scanner.java:2119)
- 	at AverageDemo.main(AverageDemo.java:17)
- 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
- 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
- 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
- 	at java.lang.reflect.Method.invoke(Method.java:601)
- 	at com.horstmann.codecheck.Main$2.run(Main.java:249)
[fail]
  Actual output                                                                               Expected output
  --------------------------------------------------------------------------------------------------------------------------
  Enter a value, 0 to quit: 31.1                                                              Enter a value, 0 to quit: 31.1
- java.util.InputMismatchException                                                            Enter a value, 0 to quit: 28.7
- at java.util.Scanner.throwFor(Scanner.java:909)                                             Enter a value, 0 to quit: 29.3
- at java.util.Scanner.next(Scanner.java:1530)                                                Enter a value, 0 to quit: 28.6
- at java.util.Scanner.nextInt(Scanner.java:2160)                                             Enter a value, 0 to quit: 0
- at java.util.Scanner.nextInt(Scanner.java:2119)                                             Average: 29.42
- 	at AverageDemo.main(AverageDemo.java:17)
- 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
- 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
- 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
- 	at java.lang.reflect.Method.invoke(Method.java:601)
- 	at com.horstmann.codecheck.Main$2.run(Main.java:249)
[fail]

Score
0/2
