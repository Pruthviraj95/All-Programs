class complex:
    def __int__(self):
        self.real=0
        self.img=0
    def get(self,real,img):
        self.real=real
        self.img=img
    def __add__(self,c):
        tmp=complex()
        tmp.real=self.real+c.real
        tmp.img=self.img+c.img
        return tmp
    def disp(self):
        print(self.real,"+",self.img,"i")
c1=complex()
c1.get(1,2)
c2=complex()
c2.get(3,4)
c3=c1+c2
print("result=")
c3.disp()
#print(dir(__add__()))
