
def count_the_letter(sentence, answer):

    distinct = list(set([word for word in sentence]))
    letter_num = [i for i in sentence]
    for letter in distinct:
        indices = []
        for i in range(len(sentence)):
            if(letter==sentence[i]):
                indices.append(i)
        write_num = 1
        for i in indices:
            letter_num[i] = str(write_num)
            write_num += 1
        my_result = ''.join(letter_num)
        if (my_result) == answer:
            check = "correct"
        else:
            check = "wrong"
    print(" my_result : " , my_result)
    print(" check : " , check )

    return letter_num
if __name__ == '__main__':
    count_the_letter("Hello, World!" , "1112111121311" )
    count_the_letter("aaaaaaaaaaaa", "123456789101112")
    count_the_letter("Hello, World! It's me, JomoPipi!" ,"11121111213112111131224132411122")