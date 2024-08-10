N = int(input())

for i in range(N):
    num = int(input())
    if(abs(num)%2==0): print(num,"is even")
    else: print(num,"is odd")