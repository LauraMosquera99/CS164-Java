'''
method 1: makelist()
'''
def makelist(number):
    newlist = []
    for i in range(number):
        newlist.append(i)
    return newlist


'''
method 2 - rocketcountdown()
param - int (the number used to count down from)
return string
'''
'''
STUDENT TODO METHOD 2
'''
def rocketcountdown(countdown):
    empty_list = []
    for i in range(countdown, 0, -1):
        empty_list.append(i)
    empty_list.append("We have lift off!")
    return empty_list
print(rocketcountdown(5))

'''
method 3 - doubleloop()
params - 2 ints one for a loop length and the other is the multiplier
return a list
'''
'''
STUDENT TODO METHOD 3
'''
def doubleloop(len1,len2):
    int_list = []
    for i in range(len1):
        for j in range(len2):
            int_list.append(f'{i},{j}')
    return int_list

'''
method 4: howmanycombos()
params- 3 integers representing the code to unlock a padlock
returns - a list of all possible combinations
'''
'''
STUDENT TODO METHOD 4
'''
def howmanycombos(l1, l2, l3):
    empty_list = []
    for i in range(l1):
        for j in range(l2):
           for l in range(l3):
              empty_list.append(f"{i}:{j}:{l}")
    return empty_list
print(howmanycombos(2,2,2))

'''
cansofpop()
params
    number - total number of pops
    takedown - interval of how many pops to take down
'''
'''
STUDENT TODO METHOD 5
'''
def cansofpop(number, takedown):
    empty_list = []
    while number > 0:
        next_number = number - takedown
        if next_number < 0:
            next_number = 0
        empty_list.append('{0} cans of pop on the wall {0} cans of pop, take {1} down and pass them around, {2} cans of pop on the wall')
        number -= takedown
        if number < 0:
            number = 0
    #print("Cans of pop")
    return empty_list
print(cansofpop(10,3))


def main():
    '''
    This is where you can write your own tests for your methods!
    '''


if __name__ == '__main__':
    main()
