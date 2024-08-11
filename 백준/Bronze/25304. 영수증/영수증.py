X = int(input())
N = int(input())
temp = 0

for i in range(N):
    a, b = map(int, input().split())
    temp += a * b
if(X == temp) :
    print("Yes")
else :
    print("No")