def count_the_same_alpha(text) :

    lower_txt = list(text.lower())
    set_txt = list(set(lower_txt))
    set_count = [lower_txt.count(i) for i in set_txt]
    for i in range(len(set_count) - 1):
        if (set_count[i] >= 2):
            print(set_txt[i], " 는 ", set_count[i], " 번 출현합니다.")

    return 0
if __name__=='__main__' :

    text1 = "aabBcde"
    text2 = "indivisibility"
    text3 = "Indivisibilityyy"
    count_the_same_alpha(text3)


