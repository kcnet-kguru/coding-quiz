import unittest
import Day21_lv3
import datetime

test_case = [
   ( 'Pig latin is cool', 'igPay atinlay siay oolcay'),
('Hello world !' ,'elloHay orldway !')
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Day21_lv3.pigIt(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()