A = int(input())
    
for i in range(A):
    for j in range(A, i, -1):
        print("*", end="")
    print()