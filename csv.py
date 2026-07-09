=## Files and CSV lab for CS 150B.                     # Header: lab title
##                                                   # Header spacer
## In this lab, you will get practice opening files  # Header: lab goal
## and using the data in those files                 # Header: continuation
##                                                   # Header spacer
## @author Laura Mosquera                            # Metadata: author
##         YOUR_EMAIL                                # Metadata: email placeholder
## @version 251015                                   # Metadata: version/date

import csv  ## remove comment before import when starting step 3  # Import CSV module for reading CSV files


# Step 1
def file_addition(filename):                         # Define function that sums first two lines of a file
    with open(filename, 'r') as file:               # Open file for reading, auto-close on exit
        lines = file.readlines()                    # Read all lines into a list of strings
        numb1 = int(lines[0].strip())               # Parse first line as int after trimming whitespace
        numb2 = int(lines[1].strip())               # Parse second line as int after trimming whitespace
                                                    # (Assumes file has at least two lines of valid ints)
    return numb1 + numb2                            # Return sum of the two integers


# Step 2
def line_counter(filename):                         # Define function that counts lines in a file
    with open(filename, 'r') as file:               # Open file for reading
        all_line = len(file.readlines())            # Read all lines and take the count
    return all_line                                 # Return line count


# Step 3
def csv_data(filename):                             # Define function that inspects CSV dimensions
    with open(filename, 'r') as file:               # Open CSV file for reading
        prev_len = None                              # Placeholder (unused) for previous row length
        count_lines = 0                              # Initialize non-empty row counter
        max_row_length = 0                           # Initialize tracker for widest row length
        csv_reader = csv.reader(file)                # Create CSV reader iterator

        for row in csv_reader:                       # Iterate over each parsed CSV row (list of strings)
            if not row:                              # If the row is empty
                continue                             # Skip to next row
            count_lines += 1                         # Count this non-empty row
            numbs_row = len(row)                     # Compute current row length (unused)
            max_row_length = max(max_row_length, len(row))  # Update maximum row width if larger

    return count_lines, max_row_length               # Return tuple: (non-empty row count, max columns)


# Step 4
def get_filtered_CSV(filename, filter_by):          # Define function to filter rows by first column value
    lst = []                                        # Accumulator for matching rows
    with open(filename, 'r') as file:               # Open CSV file for reading
        csv_file = csv.reader(file)                 # Create CSV reader
        for row in csv_file:                        # Iterate rows
            if not row or not row[0].strip():       # Skip empty rows or rows with empty first cell
                continue
            first = row[0].strip()                   # Normalize first column value
            if first == filter_by:                  # Check for exact match
                lst.append(row)                     # Keep matching row

    return lst                                      # Return list of matching rows


# Step 5
def find_flight(filename, airlines, city, earliest, latest):  # Find first flight meeting filters
    flights = get_filtered_CSV(filename, airlines)  # Pre-filter rows by airline in column 0

    for row in flights:                             # Iterate candidate flights
        c = row[1].strip()                          # Cache city (unused variable)
        t = row[2].strip()                          # Cache time (unused variable)
        if row[1].strip() == city and (earliest <= row[2].strip() < latest):  # City match and time window
            return row                               # Return first matching flight


# Add your own tests to this method
def run():                                          # Simple runner for local testing
    print(file_addition("num.txt"))                 # Test Step 1
    print(line_counter("harryPotter.txt"))          # Test Step 2
    print(csv_data("myfile.csv"))                   # Test Step 3
    print(get_filtered_
