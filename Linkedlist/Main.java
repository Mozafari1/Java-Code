package com.Rahmat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   LinkedList<String> Sted = new LinkedList<String>();
        LinkedList<String> nySted = new LinkedList<String>();

        {
            System.out.println("Inorder");
            addInOrder(nySted, "Stockholm");
            addInOrder(nySted, "Trondheim");
            addInOrder(nySted, "Roma");
            addInOrder(nySted, "Madrid");
            addInOrder(nySted, "Condanda");
            addInOrder(nySted, "Japan");
            addInOrder(nySted, "Mascow");
            printList(nySted);

            addInOrder(nySted, "Roma");
            addInOrder(nySted, "Oslo");


            printList(nySted);
            besøk(nySted);
        }
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Besøker nå "+i.next());

        }
        System.out.println("==-----------------==");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String NySted){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int Sammenligne = stringListIterator.next().compareTo(NySted);
            if(Sammenligne==0){
                System.out.println(NySted + " er allerede inkludert i destinasjonen");
                return false;
            }else if(Sammenligne>0){
                stringListIterator.previous();
                stringListIterator.add(NySted);
                return true;
            }else if(Sammenligne<0){
            }
        }
        stringListIterator.add(NySted);
        return true;
    }

    private static void besøk(LinkedList by){
        Scanner scanner = new Scanner(System.in);
        boolean quit  = false;
        boolean forrigje = true;
        ListIterator<String > listIterator = by.listIterator();
        if(by.isEmpty()){
            System.out.println("Byen er ikke på lista");
            return;
        }else{
            System.out.println("Nå besøker: "+listIterator.next());
        printMenu();

        }
        while (!quit){
            int valg= scanner.nextInt();
            scanner.nextLine();
            switch (valg){
            case 0:
                System.out.println("Ferie er slutt");
        quit = true;
        break;
                case 1:
                    if(!forrigje){
                        if(listIterator.hasNext()){
                        listIterator.next();
                        }
                        forrigje = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Nå besøker "+listIterator.next());
                        }
                        else  {
                        System.out.println("Lista er nåd");
                        forrigje = false;

                    }
                    break;
                case 2:
                    if(forrigje){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forrigje = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Nå besøker "+ listIterator.previous());
                    }else{
                        System.out.println("Vi er på starten av lista");
                        forrigje = true;
                }
                break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Tilgjengelige valg\npress");
        System.out.println("0 - for å avslutte\n"+
        "1 - for å gå til neste by\n"+
                "2 - for å gå til forrige by\n"+
                "3 - for å gå til menu"
        );
    }
}
