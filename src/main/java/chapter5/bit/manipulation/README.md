# Bit Manipulation

## Things which you should know well

### Get bit
```java
boolean getBit(int num, int i) {
  return ((num & (1 << i)) != 0);
}
```


### Set bit
```java
int setBit(int num, int i) {
  return num | (1 << i); 
}
```

### Clear bit
```java
int clearBit(int num, int i) {
  int mask = ~(1 << i);
  return num & mask;
}
```


### Interesting trick: clear the lowest one
```java
int clearLowestOne(int num) {
  return ((num - 1) & num);
}
```