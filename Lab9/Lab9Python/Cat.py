class Cat:
    def __init__(self, name, age, breed, hair, tail):
        self.name = name
        self.age = age
        self.breed = breed
        self.hair = hair
        self.tail = tail

    def get_full_info(self):
        return f"Name: {self.name}\nAge: {self.age}\nBreed: {self.breed}\nHair Color: {self.hair.color}\nHair Length: {self.hair.length}\nTail Length: {self.tail.length}\nTail Texture: {self.tail.texture}"
