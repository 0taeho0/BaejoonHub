N = int(input())
    
for i in range(1, N + 1):
    for j in range(1, N - i + 1):
        print(" ", end="")
    for z in range(i):
        print("*", end="")
    print()