N = int(input())
sum = 0

arr = list(map(int, input().split())) 
max = max(arr)

for i in range(len(arr)):
    sum += arr[i] / max * 100

print(sum / len(arr))