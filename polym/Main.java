package com.Rahmat;

import com.sun.org.apache.xpath.internal.operations.Mod;

class Move{
    private String name;
    public Move(String name){
        this.name = name;
    }
    public String plot(){
        return "This message show up when some move has noe plot";
    }

    public String getName() {
        return name;
    }
}
class Skyfall extends Move{
    public Skyfall(){
        super("007");
    }
    public String plot(){
        return "About skyfall";
    }
}
class Harry extends Move{
    public Harry(){
        super("H P");
    }
    public String plot(){
        return "About HP";
    }
}
class Avator extends Move{
    public Avator(){
        super("Avator");
    }
    public String plot(){
        return "About avator";
    }
}
class NoPlot extends Move{
    public NoPlot(){
        super("NoPlot");
    }

}
public class Main {

    public static void main(String[] args) {
for(int i =1; i<9; i++){
    Move move = randomFilm();
    System.out.println("Move #"+i +" : "+move.getName()+"\n"+"plot: "+ move.plot()+"\n");
}
    }

    public static Move randomFilm(){
        int randomnumber  = (int )(Math.random()*4)+1;
        System.out.println("rundom number "+ randomnumber);
        switch (randomnumber){
            case 1: return  new Skyfall();
            case 2: return new Harry();
            case 3: return new Avator();
            case 4: return new NoPlot();
            default:
                return null;
        }
    }
}
