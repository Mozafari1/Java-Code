package com.Rahmat;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<String>();
    public void addGrocery (String item){
        grocerylist.add(item);

    }
    public ArrayList<String> getGrocerylist(){
        return grocerylist;
    }
    public void printGroc (){
        System.out.println("You have "+ grocerylist.size()+ " items");
    for(int i =0;i <grocerylist.size(); i++){
        System.out.println(i+1+ ", "+ grocerylist.get(i));
    }
    }
    public void modify(String current, String newitem){
        int position = finditem(current);
        if(position>=0){
            modify(position, newitem);
        }
    }
private void modify(int position, String newitem){
        grocerylist.set(position, newitem);
    System.out.println("Grocery item "+ position+ " has been modified");
}
public  void remove(String item){
        int position = finditem(item);
        if(position>= 0){
            remove(position);
        }
}
private void remove(int position){
        grocerylist.remove(position);
}
private int finditem (String seachitem){
     return grocerylist.indexOf(seachitem);

    }

    public boolean onfile(String searchitem){
        int position = finditem(searchitem);
        if(position>=0)
        {
            return true;
        }
        return false;
    }
}
