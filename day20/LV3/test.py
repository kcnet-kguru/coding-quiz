import unittest
import day20_lv3
import datetime

test_case = [
    (7,3,4),
    (11,19,10),
    (40,3,28),
    (14,2,13),
    (100,1,100),
    (1000000,1,1000000),
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day20_lv3.josephus_survivor(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()