numbers = []
for i in range(9):
    numbers.append(int(input()))
max = max(numbers)
print(max)
print(numbers.index(max)+1)