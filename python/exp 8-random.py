import random
class MyError(Exception):
    def __init__(self,a):
        self.a=a
    def msg(self):
        print("value of a",self.a)
try:
    num=random.uniform(0.0,0.2)
    if (num<0.1):
        raise MyError(num)
    else :
        print("num =",num)
except MyError as e:
    print("Invalid no", e.a)
