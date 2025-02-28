N = int(input())
count = 0
for x in range(2, 501):
	for y in range(1, x):
		if x**2 - y**2 == N :
			count = count+1
print(count)