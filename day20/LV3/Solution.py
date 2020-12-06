def josephus_survivor(n,k):
    people = [i for i in range(1, n+1)]
    idx = 0
    while len(people) > 1:
        idx = (idx + k - 1) % len(people)
        people.pop(idx)
        
    return people[0]