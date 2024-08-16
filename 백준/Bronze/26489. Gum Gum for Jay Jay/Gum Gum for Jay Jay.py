count = 0

while True:
	try:
		A = input()
		count += 1
	except EOFError:
		break

print(count)