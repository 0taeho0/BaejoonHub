result = 0

arr = list(map(int, input().split()))

for i in range(len(arr)):
    result += arr[i] * arr[i]

print(result % 10)