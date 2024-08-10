A = "SciComLove"
N = int(input())

if(N%2 == 0) :
    print(A)
else :
    for i in range(2):
        n = ""
        for j in range(len(A), 0, -1):
            n += A[j-1:j]
        N = n
    print(N)