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

"""
김선진 사원 리뷰입니다 대리님.
람다 함수를 꾸준히 사용하시는 부분을 보니 잘 활용하고 계신 것같습니다.
다만 알고리즘은 비슷하지만, 한번의 람다 함수를 사용하여 한 줄로 표현하는 방법도 존재합니다.
시간 나시면 고민해보시면 좋을 것 같습니다!
"""
