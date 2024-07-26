a, b = map(int, input().split())


if(b < 45):
    a -= 1
    b = (60 + b) - 45
    if(a < 0):
        a = 23
    print(a, b)
else :
    print(a, b-45)