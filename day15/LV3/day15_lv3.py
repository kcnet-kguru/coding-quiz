def choose_best_sum(distance, visitCount, distanceList):
    sumList = []
    tempCnt = 0
    for idx,obj in enumerate(distanceList):
        sum = obj
        tempCnt = 1
        for idx2,obj2 in enumerate(distanceList[idx+1:]):
            if tempCnt < visitCount:
                sum += obj2
                tempCnt += 1
            else:
                sum -= distanceList[idx+1:][idx2-1]
                sum += obj2
            if tempCnt == visitCount and sum <= distance:
                sumList.append(sum)
    if len(sumList) == 0  :
        return None
    return max(sumList)