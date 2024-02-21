#1:
x = [[5, 2, 3], [10, 8, 9]]
students = [
    {'first_name': 'Michael', 'last_name': 'Jordan'},
    {'first_name': 'John', 'last_name': 'Rosales'}
]
sports_directory = {
    'basketball': ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer': ['Messi', 'Ronaldo', 'Rooney']
}
z = [{'x': 10, 'y': 20}]

#Change 10to15
x[1][0] = 15

#Change 'Jordan' to 'Bryant'
students[0]['last_name'] = 'Bryant'

#change 'Messi' to 'Andres'
sports_directory['soccer'][0] = 'Andres'

# Change the value 20 in z to 30
z[0]['y'] = 30

# Print
print("Updated x:", x)
print("Updated students:", students)
print("Updated sports_directory:", sports_directory)
print("Updated z:", z)

#2:
def iterateDictionary(some_list):
    for person in some_list:
        output = ""
        for key, value in person.items():
            output += f"{key} - {value}, "
        print(output[:-2])  
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
iterateDictionary(students)


#print(sports_directory)

#3 
def iterateDictionary2(key_name, some_list):
    for person in some_list:
        print(person[key_name])
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]

print("Values for key 'first_name':")
iterateDictionary2('first_name', students)

print("\nValues for key 'last_name':")
iterateDictionary2('last_name', students)
#4
def printInfo(some_dict):
    for key, values in some_dict.items():
        print(f"{len(values)} {key.upper()}")
        for value in values:
            print(value)
dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
printInfo(dojo)



