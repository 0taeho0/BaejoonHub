arr1 = ["Algorithm", "DataAnalysis", "ArtificialIntelligence"
    			 , "CyberSecurity", "Network", "Startup","TestStrategy"]
arr3 = ["204","207","302","B101","303","501","105"]

a = int(input())
arr2 = [0] * a

for i in range(a):
    arr2[i] = input()
    for j in range(len(arr1)):
        if arr1[j] == arr2[i]:
            print(arr3[j])
            break
            