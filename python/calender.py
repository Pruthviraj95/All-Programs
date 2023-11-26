p=0
d=input('enter the starting day in small leters :-  ')
n=int(input('enter the number of days in month :-  '))
if(d=='monday'or d=='1'):
    p=1
elif(d=='tuesday'or d=='2'):
    p=2
elif(d=='wednesday'or d=='3'):
    p=3
elif(d=='thursday'or d=='4'):
    p=4
elif(d=='friday'or d=='5'):
    p=5
elif(d=='saturday'or d=='6'):
    p=6
elif(d=='sunday'or d=='7'):
    p=7
for a in range(1,n+1):
    if(a==n+1):
        break
    if(p!=8):
        if(p==1):
            print('day ',a,' - monday')
            p=p+1
        elif(p==2):
            print('day ',a,' - tuesday')
            p=p+1
        elif(p==3):
            print('day ',a,' - wednesday')
            p=p+1
        elif(p==4):
            print('day ',a,' - thursday')
            p=p+1
        elif(p==5):
            print('day ',a,' - friday')
            p=p+1
        elif(p==6):
            print('day ',a,' - saturday')
            p=p+1
        elif(p==7):
            print('day ',a,' - sunday')
            p=p+1
    else:
        p=1

print('\n\nend\n\n')
        
