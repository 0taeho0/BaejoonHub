arr = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", 
           "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
arr2 = [-1] * 26
    
name = input()

for i in range(len(name)):
    n = name[i]
    for j in range(len(arr)):
        if n == arr[j] and arr2[j] == -1:
            arr2[j] = i

for i in range(26):
    print(arr2[i], end=" ")