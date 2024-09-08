a = int(input())
b = int(input())
c = int(input())

n = 250
if a <= b:
    print(n)
else:
    n += ((a-b)//c)*100
    if (a-b) % c != 0:
        n += 100
    print(n)