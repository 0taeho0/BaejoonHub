A = int(input())
sum = 1

for i in range(1, A+1):
    sum *= i

if(A==0): print(1)
else: print(sum)