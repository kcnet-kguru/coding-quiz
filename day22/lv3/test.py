import unittest
import Day22_lv3
import datetime

test_case = [
   ( 1,250,[[1, 1], [42, 2500], [246, 84100]]),
(42, 250, [[42, 2500], [246, 84100]]),
(250, 500, [[287, 84100]])
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Day22_lv3.list_squared(case[0],case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()