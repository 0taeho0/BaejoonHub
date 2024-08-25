A, B, C = map(int, input().split())

start_m = 11 * 60 + 11 + 11 * 1440
result = A * 60 * 24 + B * 60 + C - start_m

print(result if result >= 0 else -1)