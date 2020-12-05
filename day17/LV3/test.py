import unittest
import day17_lv3
import datetime

test_case = [
    ([[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]] ,-1),
 ([[2, 2, 1],
 [1, 1, 2],
 [2, 1, 1]] ,0),
 ([[2, 2, 1],
 [1, 1, 0],
 [2, 2, 2]] ,2),
 ([[1, 2, 1],
 [1, 1, 2],
 [2, 2,1]] ,1)   ]
class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day17_lv3.ticTacToe(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()