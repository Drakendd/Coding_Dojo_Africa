#1
def number_of_food_groups():
    return 5
print(number_of_food_groups())

#1 result is 5 function number_of_food_groups() no parameters  return 5 


#2
def number_of_military_branches():
    return 5
print(number_of_days_in_a_week_silicon_or_triangle_sides() + number_of_military_branches())

#2 name 'number_of_days_in_a_week_silicon_or_triangle_sides' is not defined


#3
def number_of_books_on_hold():
    return 5
    return 10
print(number_of_books_on_hold())

#3 return 5 function return the first value return


#4
def number_of_fingers():
    return 5
    print(10)
print(number_of_fingers())

#4 function number of fingers is return 5 

#5
def number_of_great_lakes():
    print(5)
x = number_of_great_lakes()
print(x)

#5 this function print 5 and none function is minez return by default is return none


#6
def add(b,c):
    print(b+c)
print(add(1,2) + add(2,3))

#6  TypeError: unsupported operand type(s) for +: 'NoneType' and 'NoneType' 

#7
def concatenate(b,c):
    return str(b)+str(c)
print(concatenate(2,5))

#7 dosen't return value because two varriables band c not in (str(b)+str(c))

#8
def number_of_oceans_or_fingers_or_continents():
    b = 100
    print(b)
    if b < 10:
        return 5
    else:
        return 10
    return 7
print(number_of_oceans_or_fingers_or_continents())

#8 function dosen't return nothing because exist more values of returns 
#  if delete return 7 this program is run and return this result 100 10 values of return

#9
def number_of_days_in_a_week_silicon_or_triangle_sides(b,c):
    if b<c:
        return 7
    else:
        return 14
    return 3
print(number_of_days_in_a_week_silicon_or_triangle_sides(2,3))
print(number_of_days_in_a_week_silicon_or_triangle_sides(5,3))
print(number_of_days_in_a_week_silicon_or_triangle_sides(2,3) + number_of_days_in_a_week_silicon_or_triangle_sides(5,3))

#9 function dosen't return nothing because exist more values of returns 
#  if delete return 3 this program is run and return this result 
# number_of_days_in_a_week_silicon_or_triangle_sides(2,3)  return 7
# number_of_days_in_a_week_silicon_or_triangle_sides(5,3)  return 14
# number_of_days_in_a_week_silicon_or_triangle_sides(2,3) + number_of_days_in_a_week_silicon_or_triangle_sides(5,3) return 7 + 14 = 21 

#10
def addition(b,c):
    return b+c
    return 10   # second error return 10 
print(addition(3,5)) 

#-------------------------------------------

def addition(b,c):
    return (b+c)
    
result=addition(3,5)
print(result)

#--------------------------------------------

#10 doesen't return nothing first exist two return values 

#11
b = 500    # intiallized b by 500
print(b)   # print b at screen 500
def foobar():  # declared function foobar
    b = 300    # intiallized b by 300 inside function
    print(b)   # to print b 300 
print(b)   # print b at screen 500 
foobar()   # print b at screen by 300 
print(b)   # print at screen 500 



#12
b = 500
print(b)     # print 500
def foobar():
    b = 300
    print(b)
    return b
print(b)  # print 500 
foobar()  # prirnt 300
print(b)  # print 500


#13
b = 500
print(b)  #print 500 
def foobar():
    b = 300
    print(b)
    return b
print(b)  # print 500
b=foobar()   # b=300
print(b)    # print at screen 300


#14
def foo():   # create function foo()
    print(1) # print 1 at screen  
    bar()    # print 3 at screen 
    print(2) # print 2 at screen 
def bar():   # create function bar() 
    print(3) # to print 3 at screen 
foo()   # call this function..


#15
def foo():   # create a function foo()
    print(1)  # to print 1 at screen 
    x = bar()  # intiallized varriable x by value of function bar()
    print(x)   # to print varriable of x at screen 
    return 10  # function foo() return 10 
def bar():     # create a function bar()
    print(3)   # to print 3 at screen 
    return 5   # value of return is 5
y = foo()      # intiallized varriable y by function foo()
print(y)       # print value 10 at screen 