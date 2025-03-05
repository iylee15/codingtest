n = int(input())
numbers = []
for x in range (n):
    a, b = map(int, input().split())
    numbers.append(a+b)

for x in range (n):
    print(numbers[x])