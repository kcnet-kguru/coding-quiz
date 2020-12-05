def Solve(str):
    upperCnt =0
    lowerCnt =0
    digit = 0
    specialCnt = 0
    for obj in list(str):
        if obj.isalpha():
            if obj.isupper():
                upperCnt += 1
            elif obj.islower():
                lowerCnt += 1 
        elif obj.isdigit():
            digit+= 1
        else:
            specialCnt += 1
    return [upperCnt,lowerCnt,digit,specialCnt]