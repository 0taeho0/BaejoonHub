N = int(input())

for _ in range(N):
    A, B = map(int, input().split())
    
    arr = []
    for _ in range(B):
        row = ['X'] * A
        arr.append(row)
    
    for row in arr:
        for cell in row:
            print(cell, end='')
        print()
    
    print()