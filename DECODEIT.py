# cook your dish here

llist = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p']

for test in range(int(input())) :
    
    N = int(input())
    String = input()
    res = ''
    
    for i in range(0, N-3, 4):
        res += llist[int(String[i:i+4], 2)]
        
    print(res)