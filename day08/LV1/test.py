import unittest
import Solution
import datetime
from copy import deepcopy
"""
tripleTrouble("this","test","lock"), "ttlheoiscstk"
tripleTrouble("aa","bb","cc"), "abcabc"
tripleTrouble("Bm", "aa", "tn"), "Batman"
tripleTrouble("LLh","euo","xtr"), "LexLuthor"
"""

test_case = [
    ("this","test","lock","ttlheoiscstk"),
    ("aa","bb","cc","abcabc"),
    ("Bm", "aa", "tn", "Batman"),
    ("LLh","euo","xtr","LexLuthor")
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