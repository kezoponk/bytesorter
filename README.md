# Bytesorter
Sort a byte if selection in highest-lowest value
<br>
```
javac bytesorter.java
java bytesorter
```
Then just paste the if selection in there, supports both python & java<br><br>
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
<br>
### Output of bytesorter:
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
<p align="center"> 
  <strong>
  Something overkill I created partly for fun but also to sort big byte selections
  </strong>
</p>
