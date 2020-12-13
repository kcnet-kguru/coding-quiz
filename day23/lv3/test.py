import unittest
import Solution
import datetime
from copy import deepcopy
"""
list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]
listSquared(250, 500) --> [[287, 84100]]
"""


test_case = [
    ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.maxSequence(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()