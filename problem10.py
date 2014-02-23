#!/usr/bin/env pypy
import math

SQRT = 1415 + 1
nums = [1] * (2000000 + 1)
nums[0] = 0
nums[1] = 0

for i in range(2,1416):
    k = i*2
    while (k < len(nums)):
        nums[k] = 0
        k = k + i

primes = []


for i in range(0,len(nums)):
    if nums[i] == 1:
        primes.append(i)
        
print len(primes)
total = 0
print primes[0:10]
print primes[-10:]
for i in range(0, len(primes)):
    total += primes[i]

print total
