N = int(input())

for i in range(1,N+1):
    arr = list(map(int, input().split()))
    print(f"Case #{i}: {max(arr)}")