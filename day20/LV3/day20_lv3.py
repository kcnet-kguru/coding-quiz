def josephus_survivor(people, n):
    delNum = 0
    peopleList = list(range(1,people+1))
    
    for obj in range(1,people):
        delNum = (delNum+n-1)%len(peopleList)
        del peopleList[delNum]

        if len(peopleList) == 1:
            return peopleList.pop()
