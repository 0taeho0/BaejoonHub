a = int(input())
b = int(input())
c = int(input())

sum = a + b + c

print((sum-min(min(a, b), c)) - max(max(a, b), c))