N = int(input())
arr = list(map(int, input().split()))
sum = 0

for i in arr:
    sum += i

if sum > 0: print("Right")
elif sum == 0: print("Stay")
else: print("Left")