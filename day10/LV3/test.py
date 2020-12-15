import unittest
import Solution1
import datetime
from copy import deepcopy
"""
Test
humanReadable(0) => '00:00:00'
humanReadable(5) => '00:00:05'
humanReadable(60) => '00:01:00'
humanReadable(86399) => '23:59:59'
humanReadable(359999) => '99:59:59'
"""

test_case = [
("my&friend&Paul has heavy hats! &", "my friend John has many many friends &", "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"),
("mmmmm m nnnnn y&friend&Paul has heavy hats! &", "my frie n d Joh n has ma n y ma n y frie n ds n&", "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"),
("Are the kids at home? aaaaa fffff", "Yes they are here! aaaaa fffff", "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"),
("Are they here", "yes, they are here", "2:eeeee/2:yy/=:hh/=:rr"),
("looping is fun but dangerous", "less dangerous than coding", "1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg"),
(" In many languages", " there's a pair of functions", "1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt")
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution1.mix(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
if __name__ == '__main__':
    unittest.main()