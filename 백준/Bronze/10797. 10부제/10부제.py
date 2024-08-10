M = 0
N = int(input())

A, B, C, D, E = map(int, input().split())

arr = [A, B, C, D, E]

for i in arr:
    if(i == N): 
        M += 1
    
print(M)