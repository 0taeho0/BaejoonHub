N1, N2, N3 = map(int, input().split())
t1, t2, t3 = map(int, input().split())

if((N1*3+N2*20+N3*120) < (t1*3+t2*20+t3*120)):
    print("Mel")
elif((N1*3+N2*20+N3*120) > (t1*3+t2*20+t3*120)): 
    print("Max")
else: print("Draw")