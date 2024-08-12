a, b, c, d, e, f = map(int, input().split())

result = a * e - b * d

x = (c * e - b * f) // result
y = (a * f - c * d) // result

print(x, y)