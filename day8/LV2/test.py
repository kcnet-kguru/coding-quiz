import unittest
import Solution
import datetime
from copy import deepcopy
"""
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
"""

test_case = [
    (2, 10, [7,4,5,6], 8),
    (100, 100, [10], 101),
    (100, 100, [10,10,10,10,10,10,10,10,10,10], 110)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0],case[1],case[2]), case[3])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

if __name__ == '__main__':
    unittest.main()