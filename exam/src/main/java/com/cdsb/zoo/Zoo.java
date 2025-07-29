package com.cdsb.zoo;


public class Zoo {
    
public String habitat;
public String food;
public static String animals;

        public static void main(String[] args) { 

        
        Habitat terrestrial = new Habitat("Es terrestre", 12);
        Habitat aquatic = new Habitat("Es acuático", 6);
        Habitat terrarium = new Habitat("Es terrario", 3);           
        
        Animals lions=new Animals("Leones", "Mamiferos", "Carnivoros", false, "Terrestres", 5);
       Animals elephants=new Animals("Elefantes","Mamiferos", "Herbivoros", true, "Terrestres", 21);
         Animals zebras=new Animals("Cebras", "Mamiferos", "Herbivoros", false, "Terrestres", 6);
        Animals parrots=new Animals("Loros", "Aves", "Herbivoros", true, "Voladores", 8);
    Animals toucans=new Animals("Tucanes", "Aves", "Herbivoros", true, "Voladores", 8);
        Animals snakes=new Animals("Serpientes", "Reptiles", "Herbivoros", false, "Terrestres", 8);
         Animals iguanas=new Animals("Loros", "Aves", "Herbivoros", false, "Terrestres", 8);
         Animals dolphins=new Animals("Delfines", "Mamiferos", "Carnivoros", false, "Acuaticos", 7);
        
         System.out.println(terrestrial.addAnimal(lions));
         System.out.println(terrestrial.addAnimal(elephants));
        System.out.println(terrestrial.addAnimal(zebras));
        System.out.println(terrarium.addAnimal(parrots));
        System.out.println(terrarium.addAnimal(toucans));
         System.out.println(terrestrial.addAnimal(snakes));
         System.out.println(terrestrial.addAnimal(iguanas));
        System.out.println(terrestrial.addAnimal(dolphins));
        System.out.println(aquatic.addAnimal(dolphins));
     

        
       
         
       
                        
                }
                
        
                
        

    

}
