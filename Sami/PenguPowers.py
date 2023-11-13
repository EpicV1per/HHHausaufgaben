def PenguPowers(x, i):
    answer = 1
    for num1 in range(i):
        temp = 0
        for num2 in range(x):
            temp += answer
        answer = temp
    return answer

print(PenguPowers(5,1))