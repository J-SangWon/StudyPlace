inFp = None
inList = ""

inFp = open("C:/Temp/data1.txt","r",encoding="utf-8")

inList = inFp.readlines()
print(inList)

inFp.close()