

class Main{
    public static void main(String[] args){
        MinecraftPlayer myguy = new MinecraftPlayer("steve", 5, 0);
        System.out.println(myguy.username);
        System.out.println(myguy.sheepkilled);
        int x = myguy.damage(5);
        System.out.println("Players Health: " + x);
        int y = myguy.DigDirtBlocks();
        System.out.println("you just dug a new dirt block, you have: " + y + " dirt blocks.");
 
}
}