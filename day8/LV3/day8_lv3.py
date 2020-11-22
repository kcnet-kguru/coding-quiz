

def humanReadable(num):
    HH=0
    MM=0
    SS=0
    if num >= 3600:
        HH = num//3600
        h_rest = num % 3600
        MM = h_rest // 60
        SS = h_rest % 60

    elif 60 <=  num < 3600:
        MM = num // 60
        SS = num % 60

    elif (0< num < 60) :
        SS = num

    if HH == 0 : HH = '00'
    elif 0< HH <10 : HH = '0'+str(HH)
    else :HH = str(HH)

    if MM == 0 : MM ='00'
    elif 0< MM <10 : MM = '0'+str(MM)
    else : MM = str(MM)

    if SS == 0 : SS = '00'
    elif 0 < SS < 10 : SS = '0'+str(SS)
    else : SS = str(SS)

    return  HH+":"+MM+":"+SS



if __name__ == '__main__':
    print(humanReadable(0))    # = > '00:00:00'
    print(humanReadable(5))    #= > '00:00:05'
    print(humanReadable(60))   # = > '00:01:00'
    print(humanReadable(86399))    # = > '23:59:59'
    print(humanReadable(359999))   # = > '99:59:59'