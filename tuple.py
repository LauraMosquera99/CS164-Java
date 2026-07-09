#a tuple is an immutanble list, meaning I cannot change anything after creating it, think about it as a sealed lunchbox.
first_name = input()
last_name = input()
license_plate = input()

person1 = (first_name, last_name, license_plate)

print(f"First name: {person1[0]}, Last name: {person1[1]}, License plate: {person1[2]}")

#to call a namedtuple
from collections import namedtuple
person1 = namedtuple("person", "first_name", "last_mane", "license_plate")
#think of the namedtuple as the mold and the tuple as the information that uses the mold.

#sets stores unique values and does not produce duplicates when calling a set.
my_set = [a, b,c,a,b,c,d,e,e,e]
clean_set = set(my_set)
print(clean_set)