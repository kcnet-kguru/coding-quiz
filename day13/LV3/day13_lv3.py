import copy

def choiceGold(goldList):
    tempGoldList = goldList.copy()
    aGold = 0
    bGold = 0
    cnt = 1
    while(tempGoldList):
        chooseIndex = 0;
        size = len(tempGoldList)
        if size > 1:
            index = maxPriceindex(tempGoldList)
            if index == 1:
                index = size -1
            elif index == size-2:
                index =0
        else:
            index =0
        if cnt %2 == 1:
            aGold += tempGoldList[index]
        else:
            bGold += tempGoldList[index]
        del tempGoldList[index]
        cnt += 1
    return [aGold,bGold]

def maxPriceindex(goldList):
    size = len(goldList)
    index = 0
    if goldList[0] > goldList[size-1]:
        if goldList[1] > goldList[size-2]:
            if goldList[0] > goldList[1]:
                index = 0
            else:
                index =1
        else:
            if goldList[0] > goldList[size-2]:
                index =0
            else:
                index = size-2
    else:
        if goldList[1] > goldList[size-2]:
            if goldList[size-1] > goldList[1]:
                index =size-1
            else:
                index =1
        else:
            if goldList[size-1] > goldList[size-2]:
                index = size-1
            else:
                index = size -2
    return index