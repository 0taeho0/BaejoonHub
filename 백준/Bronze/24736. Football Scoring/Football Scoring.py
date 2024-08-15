arr = [0] * 2

for i in range(2):
    a, b, c, d, e = map(int, input().split())
    arr[i] = a*6 + b*3 + c*2 + d + e*2

print(arr[0], arr[1])