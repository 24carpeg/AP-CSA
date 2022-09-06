
public class MinecraftPlayer{
    String username;
    int sheepkilled;
    int dogstamed;
    boolean HouseBuilt;
    int Health = 20;
    int DirtBlocks;
    
    Minecraftplayer(String username, int sk,int dt, boolean hb, int ht){
       username = name;
       sheepkilled = 2;
       dogstamed = 0;
       HouseBuilt = false;
       Health = 0;
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




    }
    
    
     //return the health of the player
   }

//to compile - javac filename
//to run - java mainclassname