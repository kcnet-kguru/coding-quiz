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

"""
김선진 사원 리뷰입니다 대리님.
Best Practice인지 확실치는 않지만 한가지 함수를 공유해드리려 합니다.
혹시 itertools에 순열과 조합의 함수가 있는 것을 알고 계신가요?
해당 함수를 사용하는 풀이방법도 존재합니다.
물론 complexity에 대해서는 한번 고민해 봐야할 문제인 것 같습니다.
"""
