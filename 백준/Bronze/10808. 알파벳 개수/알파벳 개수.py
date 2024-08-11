arr = [0] * 26
arr2 = ["a","b","c","d","e","f","g","h",
		   "i","j","k","l","m","n","o","p",
		       "q","r","s","t","u","v","w",
		            "x","y","z"]

A = input()
arr3 = [''] * len(A)

for i in range(len(A)):
    arr3[i] = A[i:i+1]
    for j in range(len(arr)):
        if(arr3[i] == arr2[j]) :
            arr[j] += 1

for i in range(len(arr)):
    print(arr[i], end=' ')