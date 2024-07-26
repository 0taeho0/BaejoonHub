Junior = "Junior"
Senior = "Senior"
    
while True:
    name, A, B = input().split()
    A, B = int(A), int(B)
        
    if name == "#" and A == 0 and B == 0:
       break
        
    if A > 17 or B > 79:
        print(name, Senior)
    else:
        print(name, Junior)