import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    ([0, 1, 3, 6, 10],[20, 20, 19, 16, 10, 0]),
    ([1, 2, 3, 4, 5, 6],[21, 20, 18, 15, 11, 6, 0]),
    ([744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358],[10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0])
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.parts_sums(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()