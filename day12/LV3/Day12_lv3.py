"""
orderWeight("103 123 4444 99 2000") => 2000 103 123 4444 99
orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123") => "11 11 2000 10003 22 123 1234000 44444444 9999"
"""
from functools import reduce

def orderWeight(inputList):
    orderList = inputList.split(' ')
    weightTupleList = list(map(lambda weight:(weight,reduce(lambda x,y:x+y,map(int,list(weight)))), orderList))
    weightTupleList.sort(key=lambda x:(x[1],x[0]))
    return ' '.join([weight[0] for weight in weightTupleList])
