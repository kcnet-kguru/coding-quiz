def parts_sums(ls):
    listSum = sum(ls)
    size = len(ls)
    partsSums = []
    for idx in range(0,size+1) :
        if idx ==0:
            partsSums.append(listSum)
        else:
            partsSums.append(partsSums[idx-1]-ls[idx-1])
    return partsSums