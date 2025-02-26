numbers = []
numbers.append(list(map(int, input().split())))
while True:
	arr = list(map(int, input().split()))
	if arr[0] == 0:
		break
	else:
		numbers.append(arr)

for x in range(len(numbers)):
	newArr = sorted(numbers[x])
	if pow(newArr[0],2) + pow(newArr[1],2) == pow(newArr[2],2):
		print("right")
	else:
		print("wrong")