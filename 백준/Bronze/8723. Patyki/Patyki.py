a, b, c = map(int, input().split())

if (a**2 == (b**2 + c**2) or b**2 == (a**2 + c**2) or c**2 == (a**2 + b**2)):
    print(1)
elif((a == b) and (b == c)): print(2)
else: print(0)