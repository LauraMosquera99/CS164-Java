# -*- coding: utf-8 -*-
from math import *
import csv


def read_file(filename):
    lst = [] 
    with open(filename, 'r') as f:
        for row in f: 
            row = row.strip("\n")
            if not row:
                continue
            lines = row.split(",")
            lst.append(lines)
    return lst
    
def get_city_info(data, city_name):
    for row in data:
        if row[0].lower() == city_name.lower():
            return row
    for row in data:
        if row[0] == "Fort Collins":
            return row
            

def get_city_latitude(city_info):
    return city_info[1]

def get_city_longitude(city_info):
    return city_info[2]

def convert_degrees_to_decimals(str_value):
    s = str_value.strip()
    s = s.replace("'", "'").replace("'", "'").replace(""", '"').replace(""", '"')
    dirch = s[-1]
   
    #separators
    d_i = s.find('°')
    m_i = s.find("'")
    s_i = s.find('"')
    
    #slicing pieces
    deg = float(s[:d_i])
    mins = float(s[d_i + 1:m_i])
    secs = float(s[m_i + 1: s_i])
    
    #decimal combining 
    val = deg + mins/60 + secs/3600 
    if dirch in ('S','W'): 
        val = -val
    return val


def distance_between(data, city1, city2):
    city1_info = get_city_info(data, city1)
    city1_latitude = get_city_latitude(city1_info)
    city1_longitude = get_city_longitude(city1_info)
    city2_info = get_city_info(data, city2)
    city2_latitude = get_city_latitude(city2_info)
    city2_longitude = get_city_longitude(city2_info)

    lat1 = convert_degrees_to_decimals(city1_latitude)
    lon1 = convert_degrees_to_decimals(city1_longitude)
    lat2 = convert_degrees_to_decimals(city2_latitude)
    lon2 = convert_degrees_to_decimals(city2_longitude)

    EARTH_RADIUS = 3961 # radius of the earth at 39 degrees latitude in miles - to use Kilometers: 6373
    dlat = radians(lat2 - lat1)
    dlon = radians(lon2 - lon1)
    a = pow(sin(dlat/2), 2) + cos(radians(lat1)) * cos(radians(lat2)) * pow(sin(dlon/2), 2)
    c = 2 * atan2(sqrt(a), sqrt(1-a))
    return EARTH_RADIUS * c


def run_tests():
    data = read_file('cities.csv')
    print("TESTING", data)
    print(convert_degrees_to_decimals('105°5\'3.9084\"W'))
    
    return False



if __name__ == '__main__':
    run_tests()

    data = read_file('cities.csv')
