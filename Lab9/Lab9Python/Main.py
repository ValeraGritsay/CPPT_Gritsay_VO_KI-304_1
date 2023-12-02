from Hair import Hair  
from Tail import Tail 
from LabCat import LabCat  

def main():
    hair_obj = Hair("Gray", "short")  
    tail_obj = Tail(15, "fluffy")  
    lab_cat_obj = LabCat("Barsik", 3, "Persian", hair_obj, tail_obj, "Biological research")  
    print("Information about the experimental cat:")
    print(lab_cat_obj.get_full_info())


    lab_cat_obj.set_research_area("Chemical research")
    lab_cat_obj.set_new_name("Musik")
    print("Updated information about the experimental cat:")
    print(lab_cat_obj.get_full_info())

if __name__ == "__main__":
    main()
