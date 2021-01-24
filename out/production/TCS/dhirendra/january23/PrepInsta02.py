#cd C:\Users\dhsingh\Desktop\NQT\TCS\src\dhirendra.january23
#Sweet Seventeen Problem Statement
#Given a maximum of four digit to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.

#Test Cases
#Case 1
#Input – 1A
#Expected Output – 27
#Case 2
#Input – 23GF
#Expected Output – 10980
print('Hello World')
'''The int() function converts the specified value into an integer number.
We are using the same int() method to convert the given input.
int() accepts two arguments, number and base.
Base is optional and the default value is 10.
In the following program we are converting to base 17'''

num = str(input())
print(int(num,17))