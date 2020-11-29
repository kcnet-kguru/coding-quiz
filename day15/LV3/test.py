import unittest
import day15_lv3
import datetime
ts = [50, 55, 56, 57, 58]

xs = [50]

ys = [91, 74, 73, 85, 73, 81, 87]
test_case = [
    (163, 3,ts,163),
(163,3,xs,None),
(230,3,ys,228)
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day15_lv3.choose_best_sum(case[0],case[1],case[2]), case[3])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()