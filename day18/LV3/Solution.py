import math
def decompose(n):
    target_num = n ** 2
    result = [n-1]

    while target_num > 0:
        target_num -= result[-1] ** 2
        if target_num == 0:
            return sorted(result)
        if int(math.sqrt(target_num)) == result[0]:
            break
        result.append(int(math.sqrt(target_num)))

    return None