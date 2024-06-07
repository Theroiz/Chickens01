public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = 0;
        //segunda feira
        totalEggs = (chickenCount*eggsPerChicken);
        //terça feira
        chickenCount++;
        totalEggs += (chickenCount*eggsPerChicken);
        //quarta feira
        chickenCount /= 2;
        totalEggs += (chickenCount*eggsPerChicken);
        System.out.println("Ovos totais: "+totalEggs);
        
    }   
}
