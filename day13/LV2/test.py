import unittest
import Solution
import datetime
from copy import deepcopy
"""
foldArray([1, 2, 3, 4, 5], 1) => [6, 6, 3]
foldArray([1, 2, 3, 4, 5], 2) => [9, 6]
foldArray([1, 2, 3, 4, 5], 3) => [15]
foldArray([-9, 9, -8, 8, 66, 23], 1) => [14, 75, 0]
"""

test_case = [
    ([1, 2, 3, 4, 5], 1, [6, 6, 3]),
    ([1, 2, 3, 4, 5], 2, [9, 6]),
    ([1, 2, 3, 4, 5], 3, [15]),
    ([-9, 9, -8, 8, 66, 23], 1, [14, 75, 0] ),
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.foldArray(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()