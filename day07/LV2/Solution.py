from collections import Counter
def solution1(_str):
    return list(map(lambda x: x > 1, Counter(_str.lower()).values())).count(True)

def solution2(_str):
    return sum([1 for i in Counter(_str.lower()).values() if i > 1])