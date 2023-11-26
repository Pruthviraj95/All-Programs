#amstrong 1 , 153, 370, 371
#pruthviraj talap 229
n=int(input('enter the number: '))
sum=0
temp=n
while temp>0:
    digit=temp%10
    sum+=digit**3
    temp//=10

if n==sum:
    print(n,'is an armstong number')
else:
    print(n,'is not amstrong no')
    
