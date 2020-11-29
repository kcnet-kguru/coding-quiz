import unittest
import day14_lv3
import datetime

test_case = [
    (["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 1,"Sheldon"),
(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 52,"Penny"),
(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 7230702951,"Leonard")
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day14_lv3.who_is_Next(case[0],case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()