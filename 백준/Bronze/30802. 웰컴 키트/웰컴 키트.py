import math

N = int(input())
S, M, L, XL, XXL, XXXL = map(int, input().split())
T, P = map(int, input().split())

tShirt = 0
tShirt = (math.ceil(S/T) + math.ceil(M/T) + math.ceil(L/T) + math.ceil(XL/T)
+ math.ceil(XXL/T) + math.ceil(XXXL/T))

penBunch = N//P
pens = N%P

print(tShirt)
print(penBunch, pens)