A = int(input())
count = 1
    
for i in range(A):
    for z in range(A - 1, i, -1):
        print(" ", end="")
    for j in range(1, (count * 2)):
        print("*", end="")
    print()
    count += 1