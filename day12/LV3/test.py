import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    ("56 65 74 100 99 68 86 180 90","100 180 90 56 65 74 68 86 99"),
    ("103 123 4444 99 2000", "2000 103 123 4444 99"),
    ("2000 10003 1234000 44444444 9999 11 11 22 123", "11 11 2000 10003 22 123 1234000 44444444 9999")
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.orderWeight(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()