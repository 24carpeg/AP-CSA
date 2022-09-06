
public class MinecraftPlayer{
    String username;
    int sheepkilled;
    int dogstamed;
    boolean HouseBuilt;
    int Health;
    int DirtBlocks;
    
    MinecraftPlayer(String name, int sk, int db){
       username = name;
       sheepkilled = 2;
       dogstamed = 0;
       HouseBuilt = false;
       Health = 20;
       DirtBlocks = 0;
    }
   int damage(int dmg){
    Health = Health - dmg;
    System.out.println("oof!" + username + ":" + Health);
    return Health;
   }  

   int GetHealth(){
        return Health;
   }
    int DigDirtBlocks(){
        DirtBlocks = DirtBlocks + 1;
        return DirtBlocks;
}
    }    
    
    
    //return the health of the player

     

//to compile - javac filename
//to run - java mainclassname