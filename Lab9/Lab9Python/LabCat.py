from Cat import Cat  

class LabCat(Cat):
    def __init__(self, name, age, breed, hair, tail, research_area):
        super().__init__(name, age, breed, hair, tail)
        self.research_area = research_area

    def get_full_info(self):
        return f"{super().get_full_info()}\nField of research: {self.research_area}"

    def set_research_area(self, new_research_area):
        self.research_area = new_research_area
      
    def set_new_name(self,new_name):
        self.name = new_name