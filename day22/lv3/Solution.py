"""
list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]
listSquared(250, 500) --> [[287, 84100]]
"""
from math import sqrt
def getDivisor(num):
    return [i for i in range(1,num+1) if num % i == 0]

def getSquared(num):
    if sqrt(num) == int(sqrt(num)):
        return num
    return -1

def listSquared(start_num, end_num):
    answer = []
    for i in range(start_num, end_num + 1):
        squared = getSquared(sum(map(lambda x: x**2, getDivisor(i))))
        if squared != -1:
            answer.append([i, squared])
    return answer