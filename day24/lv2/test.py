import unittest
import Solution
import datetime
from copy import deepcopy
"""
alphabetWar("s*zz");           //=> Right side wins!
alphabetWar("*zd*qm*wp*bs*"); //=> Let's fight again!
alphabetWar("zzzz*s*");       //=> Right side wins!
alphabetWar("www*www****z");  //=> Left side wins!
"""


test_case = [
    ("s*zz", "Right side wins!"),
    ("*zd*qm*wp*bs*", "Let's fight again!"),
    ("zzzz*s*", "Right side wins!"),
    ("www*www****z", "Left side wins!")
]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy_case = deepcopy(test_case)
        for idx, case in enumerate(copy_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.alphabetWar(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()