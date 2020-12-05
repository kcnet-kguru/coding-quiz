def decompose(num):
    resultList = []
    numSquare= num**2
    tempNum = num-1
    while numSquare != 0:
        numSquare -= tempNum**2

        if numSquare < 0:
            numSquare += tempNum**2
        elif numSquare > 0:
            resultList.append(tempNum)
        else:
            resultList.append(tempNum)
            return resultList

        tempNum -= 1

        if tempNum < 1 :
            if not resultList:
                return None
            tempNum = resultList.pop()
            numSquare += tempNum**2
            if not resultList:
                return None
            tempNum = resultList.pop()
            numSquare += tempNum**2
            tempNum -=1

        
    return resultList

print(decompose(11)) #=> [1,2,4,10]
print(decompose(50)) #=> [1, 3, 5, 8, 49]
print(decompose(4)) #=> null
print(decompose(100)) 

