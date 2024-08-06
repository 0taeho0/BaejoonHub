A = input()
count = 0

for i in range(len(A)):
	B = A[i:i+1]
	if (B=="a" or B=="e" or B=="i" or B=="o" or B=="u") :
		count+=1

print(count)