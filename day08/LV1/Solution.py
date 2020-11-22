"""
tripleTrouble("this","test","lock"), "ttlheoiscstk"
tripleTrouble("aa","bb","cc"), "abcabc"
tripleTrouble("Bm", "aa", "tn"), "Batman"
tripleTrouble("LLh","euo","xtr"), "LexLuthor"
"""
def solution1(str1, str2, str3):
    return ''.join(map(lambda x: ''.join(x),zip(str1,str2,str3)))