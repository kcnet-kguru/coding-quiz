import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    (10,22),
    (20,57),
    (30,91),
    (50,175),
    (10000,157654)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    def test2(self):
        print("\nSolution #2 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution2(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()