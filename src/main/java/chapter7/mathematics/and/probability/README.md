# Mathematics and Probability

## Mathematics

### Every positive integer can be decomposed into a product of primes:
```
84 = 2^2 * 3^1 * 5^0 * 7^0 * 11^0 * 13^0 * ...

Let x = 2^i0 * 3^i1 * 5^i2 * 7^i3 * 11^i4 * ...
 
Let y = 2^j0 * 3^j1 * 5^j2 * 7^j3 * 11^j4 * ...
```

### The greatest common divisor of x and y will be:

```
gcd(x,y) = 2^min(i0, j0) * 3^min(i1, j1) * 5^min(i2, j2) * ...
```

### The least common multiple of x and y will be:

```
lcm(x,y) = 2^max(i0, j0) * 3^max(i1, j1) * 5^max(i2, j2) * ...
```

## Probability

## There are two general rules:
```
1) P(A and B) = P(B given A) * P(A)
2) P(A or B) = P(A) + P(B) - P(A and B)
```

## How they look in special case:

1) If A and B independent:
```
P(A and B) = P(A) * P(B)
```

2) If A and B mutual exclusive:
```
P(A or B) = P(A) + P(B)
```