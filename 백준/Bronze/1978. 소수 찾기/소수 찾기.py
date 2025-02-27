import math

def isPrime(n):
	if n == 0 or n == 1 :
		return False
	for i in range (2, int(math.sqrt(n))+1):
		if n%i == 0:
			return False
	return True

N = int(input())
numbers = list(map(int, input().split()))
count = 0

for i in range(N):
	if isPrime(numbers[i]):
		count+=1

print(count)