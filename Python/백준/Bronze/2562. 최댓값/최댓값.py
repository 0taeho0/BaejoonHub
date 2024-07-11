def main():
    arr = []
    for _ in range(9):
        num = int(input())
        arr.append(num)
    
    max_value = 0
    max_index = 0
    
    for i in range(len(arr)):
        if arr[i] > max_value:
            max_value = arr[i]
            max_index = i + 1
    
    print(max_value)
    print(max_index)

if __name__ == "__main__":
    main()