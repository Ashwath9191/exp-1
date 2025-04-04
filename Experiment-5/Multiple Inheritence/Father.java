class Father:
    def skills(self):
        print("Father: Gardening, Carpentry")

class Mother:
    def skills(self):
        print("Mother: Cooking, Painting")

class Child(Father, Mother):
    def skills(self):
        super().skills()  # Will call Father.skills() due to method resolution order (MRO)
        Mother.skills(self)  # Explicitly calling Mother.skills()
        print("Child: Programming")

# Create object
c = Child()
c.skills()
