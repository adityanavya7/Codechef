test = int(input())

for i in range(test):
    first, second = map(int, input().split())
    
    evenFirst = first//2
    evenSecond = second//2

    oddFirst = first - evenFirst
    oddSecond = second - evenSecond

    print((evenFirst*evenSecond) + (oddFirst*oddSecond))