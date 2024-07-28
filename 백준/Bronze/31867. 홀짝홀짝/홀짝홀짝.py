arr_length = int(input())
N = input()

arr = [int(N[i]) for i in range(arr_length)]
    
A = 0
B = 0
    
for num in arr:
    if num % 2 == 0:
        A += 1
    else:
        B += 1
    
if A > B:
    print(0)
elif B > A:
    print(1)
else:
    print(-1)