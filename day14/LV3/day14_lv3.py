import math

def who_is_Next(peopleList, number):
    n = int(math.log2((number-1)/5+1))
    startNumber = ((2**n-1)*5+1)
    index = int((number - startNumber)/2**n)
    return peopleList[index]
