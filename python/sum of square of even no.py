#sum of square of even nos
#pruthviraj 229
print("enter the starting and ending no")
i=int(input('enter starting no'))
j=int(input('enter the ending no'))
sum=0
print('even nos in the range are')
if(i%2!=0):
    i=i+1
    for k in range(i,j+1,2):
        print(k,end=' ')
        sum=sum+(k*k)
else:
    for k in range(i,j+1,2):
        sum=sum+(k*k)        
print('sum = ',sum)
