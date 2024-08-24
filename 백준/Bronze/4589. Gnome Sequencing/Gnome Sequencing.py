N = int(input())

print("Gnomes:")
for i in range(N):
    A, B, C = map(int, input().split())
    if((A<B and B<C) or (A>B and B>C)): print("Ordered")
    else: print("Unordered")