while(True):
    A, B = input().split()
    A, B = float(A), float(B)

    if(A == 0 and B == 0): break

    if(A==0 or B==0): print("AXIS")
    elif(A > 0):
        if(B > 0): print("Q1")
        else: print("Q4")
    elif(A < 0):
        if(B > 0): print("Q2")
        else: print("Q3")

print("AXIS")