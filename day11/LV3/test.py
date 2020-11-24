import unittest
import Day11_lv3
import datetime
from copy import deepcopy
"""
Test
removeNb(26) should return [[15, 21], [21, 15]]
"""

test_case = [
    (26,[[15, 21], [21, 15]])
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Day11_lv3.removeNb(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    def test2(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Day11_lv3.removeNb2(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    def test3(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Day11_lv3.removeNb3(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()