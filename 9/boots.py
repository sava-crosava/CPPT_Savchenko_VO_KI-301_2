from shoes import Shoes

class Boots(Shoes):
    def __init__(self, brand, size, color, waterproof):
        super().__init__(brand, size, color)
        self.waterproof = waterproof

    def get_description(self):
        shoes_description = super().get_description()
        return f"{shoes_description}, Waterproof: {self.waterproof}"

if __name__ == "__main__":
    boots = Boots("Timberland", 41, "Brown", True)
    print("Boots Information:")
    print(boots.get_description())
    boots.wear()
