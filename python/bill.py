print('Welcome to store\n')
print('Available items\n')
p=0
k=0
q=12
while p!=1:
    ch=input('enter the operation\n 1.laptop  \n 2.mobile \n 3.exit\n')
    if ch == "1":
        
        print('the available quantity is ',q)
        print('\ncost per quantity= 45000\n')
        print('tax=250\n')
        print('discount available 1000\n')
        a=int(input('enter the quantity\n'))
        while k!=1:
            ok=input('enter 1 for confirm esle enter 0\n')
            if ok=="1":
                q=q-a
                total=a*((45000+250)-1000)
                k=1
                print('total bill amount with discount=',total)
            elif ok=="0":
                k=1
            else:
                print('entre the correct choice\n')
    elif ch == "2":
        
        print('the available quantity is ',q)
        print('\ncost per quantity= 15000\n')
        print('tax=150\n')
        print('discount available 500\n')
        a=int(input('enter the quantity\n'))
        while k!=1:
            ok=input('enter 1 for confirm esle enter 0\n')
            if ok=="1":
                q-=q
                total=a*((15000+150)-500)
                print('total bill amount with discount=',total)
            elif ok=="0":
                k=1
            else:
                print('entre the correct choice\n')
    elif ch == "3":
        p=1
    else :
        print('enter correct choice')
