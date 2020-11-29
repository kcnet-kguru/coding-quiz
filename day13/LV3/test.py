import unittest
import day13_lv3
import datetime

test_case = [
    ([4, 7, 2, 9, 5, 2],[18, 11]),
([10, 1000, 2, 1], [1001, 12]),
([10, 1000, 2] , [12, 1000]),
([140, 649, 340, 982, 105, 86, 56, 610, 340, 879] , [3206, 981])
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day13_lv3.choiceGold(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()