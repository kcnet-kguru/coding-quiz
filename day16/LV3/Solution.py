from collections import deque

def parts_sums(ls):
    ls = deque(ls)
    ls_sum = sum(ls)
    answer = []

    while ls:
        answer.append(ls_sum)
        ls_sum -= ls.popleft()
    answer.append(0)

    return answer