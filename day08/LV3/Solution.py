num = 60

def solution1(num):
    HH = num // 3600
    MM = (num//60) % 60
    SS = num % 60
    return f"{HH:02d}:{MM:02d}:{SS:02d}"

def solution2(num):
    MM, SS = divmod(num, 60)
    HH, MM = divmod(MM, 60)
    return f"{HH:02d}:{MM:02d}:{SS:02d}"