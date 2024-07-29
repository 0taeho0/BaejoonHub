A = int(input())
    
for i in range(A):
    for z in range(i):
        print(" ", end="")
    for j in range(A, i, -1):
        print("*", end="")
    print()