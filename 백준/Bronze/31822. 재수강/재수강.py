A = input()
arr_length = int(input())
    
arr = []
for _ in range(arr_length):
    arr.append(input())
        
count = 0
for i in range(arr_length):
    if A[:5] == arr[i][:5]:
        count += 1
            
print(count)