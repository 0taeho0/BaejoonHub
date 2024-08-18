A = input() 
boolean = 0
B = int(A)  
temp = B

while temp > 0:
    if temp % 10 == 7:
        boolean = 1
    temp //= 10

if boolean == 1:
    if int(A) % 7 == 0: print(3)
    else: print(2)
else:
    if int(A) % 7 == 0: print(1)
    else: print(0)
