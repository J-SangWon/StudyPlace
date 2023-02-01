cabinet = {3:"person1", 100:"person2"}
print(cabinet[3])
print(cabinet[100])

print(cabinet.get(3))
print(cabinet.get(5, "사용 가능"))

print(3 in cabinet)
print(5 in cabinet)

cabinet = {"A-3":"person1", "B-100":"person2"}
print(cabinet["A-3"])
print(cabinet["B-100"])

print(cabinet)

del cabinet["A-3"]

print(cabinet.keys())
print(cabinet.values())
print(cabinet.items())

cabinet.clear()
print(cabinet)