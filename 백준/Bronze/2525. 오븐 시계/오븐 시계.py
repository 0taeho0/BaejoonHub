A, B = map(int, input().split())
C = int(input())

B = A * 60 + B + C

A = (B // 60) % 24
B %= 60
print(A, B)