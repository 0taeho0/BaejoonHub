N = int(input())
max = 0

for i in range(1, N+1):
    print(i,end=' ')
    if(i % 6 == 0): print("Go!",end=' ')
    max = i
    
if(max % 6 != 0): print("Go!")