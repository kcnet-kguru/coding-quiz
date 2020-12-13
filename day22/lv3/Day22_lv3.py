def list_squared(m,n):
    resultList = []
    for i in range(m,n+1):
        divisors = []
        for j in range(1, i+1):
            if i % j == 0 :
                divisors.append(j*j)
        divisorsSum = sum(divisors)**0.5
        if divisorsSum.is_integer():
            resultList.append([i,int(divisorsSum*divisorsSum)])
    return resultList
