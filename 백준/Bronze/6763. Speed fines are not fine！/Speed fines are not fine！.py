A = int(input())
B = int(input())

result = B - A
if(result <= 0): print("Congratulations, you are within the speed limit!")
elif(result <= 20): print("You are speeding and your fine is $100.")
elif(result <=30): print("You are speeding and your fine is $270.")
else: print("You are speeding and your fine is $500.")