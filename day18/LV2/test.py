import unittest
import Solution
import datetime
from copy import deepcopy
test_case = [
    ("abcdefghijklmnopqrstuvwxy", "z"),
    ("abcdefghijklmnopqrstuvwxyz", ""),
    ("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "zz"),
    ("abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy","ayzz")
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.find(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()