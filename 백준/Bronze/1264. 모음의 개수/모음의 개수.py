while True:
    A = input()
    count = 0

    if A == "#":
       break

    A = A.lower()
    for char in A:
        if char in 'aeiou':
            count += 1

    print(count)