#print number x [0 to 149]

for x in range(150):
        print (x)


print("------")
#print number x [5 to 1000]

for x in range(5,1000):
    if x % 5 == 0:
        print (x)  

print("------")
# Counting, the Dojo Way print integers 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".

for x in range(1,100):
    if x % 10 == 0:
        print ("Coding Dojo")
    elif x % 5 == 0:
        print ("Coding")
    else:
        print (x)

print("------")
# Whoa. That Sucker's Huge - Add odd integers from 0 to 500,000, and print the final sum.
sum=0
for x in range(0,500000):
    if x % 2 != 0:
        sum+=x
print (sum)

print("------")
# Countdown by Fours - Print positive numbers starting at 2018, counting down by fours.

count=0
for x in range(2018,0,-4):
    if x % 4 != 0:
        count=count+1
print (count)


print("------")
'''
Flexible Counter - Set three variables: lowNum, highNum, mult. 
Starting at lowNum and going through highNum, 
print only the integers that are a multiple of mult. For example,
if lowNum=2, highNum=9, and mult=3, the loop should print 3, 6, 9 (on successive lines)
'''

lowNum=2
highNum=9
mult=3
for x in range(lowNum,highNum+1):
    if x % mult == 0:
        print (x)    