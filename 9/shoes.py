class Shoes:
    def __init__(self, brand, size, color):
        self.brand = brand
        self.size = size
        self.color = color

    def get_description(self):
        return f"Brand: {self.brand}, Size: {self.size}, Color: {self.color}"

    def wear(self):
        print(f"Wearing {self.color} {self.brand} shoes")

if __name__ == "__main__":
    shoes = Shoes("Nike", 42, "Black")
    print("Shoes Information:")
    print(shoes.get_description())
    shoes.wear()
