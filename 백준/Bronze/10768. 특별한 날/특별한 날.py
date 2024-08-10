A = int(input())
B = int(input())


if(A==2 and B==18): print("Special")
elif(A < 2): print("Before")
elif(A > 2): print("After")
else:
    if(B < 18): print("Before")
    elif(B > 18): print("After")