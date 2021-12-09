import random

a = [random.randint(1,1000) for i in range (0,1000000)]
print(a)

n = len(a)
for i in range (n-1):
    for z in range ((n-1)-i):
        if a[z] > a[z+1]:
            a[z], a[z+1] = a[z+1], a[z]

print(a)