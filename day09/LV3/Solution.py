"""
다음과 같이 정의 된 시퀀스 u를 고려하십시오.:

숫자 u (0) = 1은 u에서 첫 번째입니다.
u의 각 x에 대해 y = 2 * x + 1 및 z = 3 * x + 1도 u에 있어야합니다.
u에는 다른 숫자가 없습니다.
Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]

1은 3과 4를, 3은 7과 10을, 4는 9와 13을, 7은 15와 22를줍니다.

Task:
매개 변수 n이 주어지면 함수 dbl_linear (또는 dblLinear ...)는 정렬 된 (<) 시퀀스 u의 요소 u (n)을 반환합니다 (따라서 중복이 없음).

Example:
dbl_linear(10) should return 22

Note:
효율성에 주의하세요
"""

import heapq
def solution1(n):
    u = [1]
    heapq.heapify(u)

    for _ in range(n):
        x = heapq.heappop(u)
        heapq.heappush(u, 2 * x + 1)
        heapq.heappush(u, 3 * x + 1)
        u = list(set(u))
        heapq.heapify(u)
    return heapq.heappop(u)

from collections import deque
def solution2(n):
    x = 1
    dq1 = deque()
    dq2 = deque()

    for _ in range(n):
        dq1.append(2 * x + 1)
        dq2.append(3 * x + 1)

        x = min(dq1[0], dq2[0])

        if x == dq1[0]:
            x = dq1.popleft()
        if x == dq2[0]:
            x = dq2.popleft()
    return x


if __name__ == "__main__":
    print(solution1(10000))