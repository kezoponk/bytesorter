# Bytesorter 
Sort a byte if selection in highest-lowest value, tested on both python & java<br>
If you don't know why this is neccessary, you're probably not familiar with binary
<br>
```
javac bytesorter.java
java bytesorter
```

### Example:
##### Input

```java
byte byteVar = 0b0101;

if (( byteVar & 0b0001 ) == 0b0001 ) {}
else if (( byteVar & 0b0010 ) == 0b0010 ) {}
else if (( byteVar & 0b0011 ) == 0b0011 ) {}
else if (( byteVar & 0b0100 ) == 0b0100 ) {}
else if (( byteVar & 0b0111 ) == 0b0111 ) {} // This returns true even though
else if (( byteVar & 0b0101 ) == 0b0101 ) {} // This one is more accurate
else if (( byteVar & 0b0110 ) == 0b0110 ) {}
else if (( byteVar & 0b1000 ) == 0b1000 ) {}
```

##### Output
```java
if (( byteVar & 0b0001 ) == 0b0001 ) {}
else if (( byteVar & 0b0010 ) == 0b0010 ) {}
else if (( byteVar & 0b0011 ) == 0b0011 ) {}
else if (( byteVar & 0b0100 ) == 0b0100 ) {}
else if (( byteVar & 0b0101 ) == 0b0101 ) {}
else if (( byteVar & 0b0110 ) == 0b0110 ) {}
else if (( byteVar & 0b0111 ) == 0b0111 ) {}
else if (( byteVar & 0b1000 ) == 0b1000 ) {}
```

<br>
<p align="center"> 
  Made partly for fun & <br>
  <a href="https://java.com"> <img src="http://ForTheBadge.com/images/badges/made-with-java.svg"> </a>
</p>
