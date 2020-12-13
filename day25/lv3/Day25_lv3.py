def first_non_repeating_letter(word):
    for obj in list(word) :
        if word.count(obj) == 1:
            return obj
    return None


