import unittest
import Solution
import datetime
from copy import deepcopy
"""
josephus_survivor(7, 3) => 4
josephus_survivor(11, 19) => 10
josephus_survivor(40, 3) => 28
josephus_survivor(14, 2) => 13
josephus_survivor(100, 1) => 100
"""
test_case = [
    (7,3,4),
    (11,19,10),
    (40,3,28),
    (14,2,13),
    (100,1,100)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.josephus_survivor(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()