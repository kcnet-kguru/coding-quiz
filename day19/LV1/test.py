import unittest
import day19_lv1
import datetime

test_case = [
   ( "CbgA5<1d-tOwUZTS8yQ", [8,6,3,2]),
("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H" ,[9,9,6,9]),
("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD" , [15,8,6,9]),
("$Cnl)Sr<7bBW-&qLHI!mY41ODe", [10,7,3,6]),
("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft", [7,13,4,10])
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(day19_lv1.Solve(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    
if __name__ == '__main__':
    unittest.main()