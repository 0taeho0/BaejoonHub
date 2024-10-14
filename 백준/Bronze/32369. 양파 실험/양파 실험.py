n, a, b = map(int, input().split())
    
Aon, Bon, temp = 1, 1, 0
    
for i in range(n):
    Aon += a
    Bon += b
    if(Aon < Bon):
        temp = Aon
        Aon = Bon
        Bon = temp
    elif(Aon == Bon): Bon -= 1

print(Aon, Bon)