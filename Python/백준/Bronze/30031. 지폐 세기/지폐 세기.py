sum = 0
num = int(input())

for i in range(num):
    A, B = map(int, input().split())
    if(A == 136): sum += 1000
    elif(A == 142): sum += 5000
    elif(A == 148): sum += 10000
    elif(A == 154): sum += 50000

print(sum)