arr = ["Never gonna give you up",
        "Never gonna stop",
        "Never gonna tell a lie and hurt you",
        "Never gonna say goodbye",
        "Never gonna make you cry",
        "Never gonna run around and desert you",
        "Never gonna let you down"]

count = 0
A = int(input())

for _ in range(A):
    name = input()
    for j in range(len(arr)):
        if(name == arr[j]): count += 1
    
if(A == count): print("No")
else: print("Yes")