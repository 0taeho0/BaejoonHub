member, num = input().split()
member, num = int(member), int(num)

arr = list(map(int, input().split()))
arr2 = [0] * len(arr)

for i in range(len(arr)):
    A = arr[i] * 100 // member
    if(A < 5): arr2[i] = 1;
    elif(A < 12): arr2[i] = 2
    elif(A < 24): arr2[i] = 3
    elif(A < 41): arr2[i] = 4
    elif(A < 61): arr2[i] = 5
    elif(A < 78): arr2[i] = 6
    elif(A < 90): arr2[i] = 7
    elif(A < 97): arr2[i] = 8
    elif(A < 101): arr2[i] = 9

for i in arr2:
    print(i, end=' ')