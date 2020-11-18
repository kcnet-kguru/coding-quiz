import unittest
import Solution
import datetime
from copy import deepcopy
"""
Test
humanReadable(0) => '00:00:00'
humanReadable(5) => '00:00:05'
humanReadable(60) => '00:01:00'
humanReadable(86399) => '23:59:59'
humanReadable(359999) => '99:59:59'
"""

test_case = [
    (0,'00:00:00'),
    (5, '00:00:05'),
    (60, '00:01:00'),
    (86399, '23:59:59'),
    (359999, '99:59:59')
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