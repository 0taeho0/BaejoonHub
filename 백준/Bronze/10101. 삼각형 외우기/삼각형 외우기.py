A = int(input())
B = int(input())
C = int(input())

if A + B + C != 180:
    print("Error")
elif A == 60 and B == 60 and C == 60:
    print("Equilateral")
elif A != B and A != C and B != C:
    print("Scalene")
else:
    print("Isosceles")