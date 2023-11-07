from shoes import Shoes
from boots import Boots

if __name__ == "__main__":
    shoes = Shoes("Adidas", 40, "White")
    boots = Boots("Columbia", 43, "Black", False)

    print("Shoes Information:")
    print(shoes.get_description())
    shoes.wear()

    print("\nBoots Information:")
    print(boots.get_description())
    boots.wear()
