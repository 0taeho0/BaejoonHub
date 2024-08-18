n = int(input())
for i in range(n):
    B, C, D = map(float, input().split())
    A = B * C * D
    
    print(f"${A:.2f}")