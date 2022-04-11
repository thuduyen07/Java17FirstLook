﻿# Java17FirstLook
There are some notes about Java 17 updates as follows: 

1. Random generators
2. Sealed classes:
    - as an add-on with inheritance
    - code reuse, maintainability, save time
    - provide restriction to inheritance (seal class to limit what classes are allowed to inherit from it) --> increase security of library
    - subclass: sealed (has subclass), non-sealed and final (cannot be inherited from)
    Note:
    - System.out.println cannot resolve in class
3. Changes some of the floating points semantics: be careful when use numerical sensitive code (numberical libraries: Java.lang.math, Java.lang.strict, etc.)
4. Deprecated features:
    - RMI (remote method invocation) activation mechanism: allow program request a service from another program located on the network
    - Applet API: because most web browsers no longer support Java browser plugins
    - Security Manager: because it hasn't been used much to secure Java code on the client-side or the server-side
