# Bytesorter 
Sort a byte if selection in highest-lowest value, tested on both python & java
If you don't know why this is neccessary, you're probably not that familiar with binary
<br>
```
javac bytesorter.java
java bytesorter
```

### Example:
##### Input

```java
byte byteVar = 0b0101;

If (( byteVar & 0b0001 ) == 0b0001 ) {}
If (( byteVar & 0b0010 ) == 0b0010 ) {}
If (( byteVar & 0b0011 ) == 0b0011 ) {}
If (( byteVar & 0b0100 ) == 0b0100 ) {}
If (( byteVar & 0b0111 ) == 0b0111 ) {} // This returns true even though
If (( byteVar & 0b0101 ) == 0b0101 ) {} // This one is more accurate
If (( byteVar & 0b0110 ) == 0b0110 ) {}
If (( byteVar & 0b1000 ) == 0b1000 ) {}
```

##### Output
```java
If (( byteVar & 0b0001 ) == 0b0001 ) {}
If (( byteVar & 0b0010 ) == 0b0010 ) {}
If (( byteVar & 0b0011 ) == 0b0011 ) {}
If (( byteVar & 0b0100 ) == 0b0100 ) {}
If (( byteVar & 0b0101 ) == 0b0101 ) {}
If (( byteVar & 0b0110 ) == 0b0110 ) {}
If (( byteVar & 0b0111 ) == 0b0111 ) {}
If (( byteVar & 0b1000 ) == 0b1000 ) {}
```

<br>
<p align="center"> 
  <strong>
  Created partly for fun
  </strong>
  <a href="https://java.com"> <img src="http://ForTheBadge.com/images/badges/made-with-java.svg"> </a>
</p>
