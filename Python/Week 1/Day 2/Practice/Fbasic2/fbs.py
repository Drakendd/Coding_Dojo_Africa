# Countdown
def countdown(num):
    return list(range(num, -1, -1))

# Print and Return
def print_and_return(arr):
    print(arr[0])
    return arr[1]

# First Plus Length
def first_plus_length(arr):
    return arr[0] + len(arr)

# Values Greater than Second
def values_greater_than_second(arr):
    if len(arr) < 2:
        return False
    else:
        count = 0
        new_list = []
        for val in arr:
            if val > arr[1]:
                count += 1
                new_list.append(val)
        print(count)
        return new_list

# This Length, That Value
def length_and_value(size, value):
    return [value] * size

# Examples
print(countdown(5))  # Example: [5, 4, 3, 2, 1, 0]
print(print_and_return([1, 2]))  # Example: 1 (printed), 2 (returned)
print(first_plus_length([1, 2, 3, 4, 5]))  # Example: 6
print(values_greater_than_second([5, 2, 3, 2, 1, 4]))  # Example: 3 (printed), [5, 3, 4] (returned)
print(values_greater_than_second([3]))  # Example: False
print(length_and_value(4, 7))  # Example: [7, 7, 7, 7]
print(length_and_value(6, 2))  # Example: [2, 2, 2, 2, 2, 2]
