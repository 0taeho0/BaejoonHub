avg = 0

for i in range(5):
    N = int(input())
    if N < 40:
        avg += 40
    else:
        avg += N
        
print(avg//5)