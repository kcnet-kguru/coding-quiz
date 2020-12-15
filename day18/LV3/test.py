import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    (11, [1,2,4,10]),
    (50, [1,3,5,8,49]),
    (4, None)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.decompose(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()