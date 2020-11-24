def removeNb(n):
    resultList = []
    sum = n*(n+1)/2
   
    for a in range(1,n+1) :
        for b in range(1,n+1) :
            if a!=b :
                if a*b ==sum-a-b:
                    resultList.append([a,b])
    return resultList

def removeNb2(n):
    resultList = []
    sum = n*(n+1)/2
   
    for a in range(1,n+1) :
        b = (sum-a)/(a+1)
        if a != b and b == round(b) and b <=n :
            resultList.append([a,b])
    return resultList

def removeNb3(n):
    resultList = []
    sum = n*(n+1)/2
   
    resultList = [[a,b] for a in range(1,n+1) if (b := (sum-a)/(a+1)) <=n and a != b and b == round(b)]
             
    return resultList