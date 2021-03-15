package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Position;

public class main {

    // Inner classes: Agrega clases dentro de otra, en este ejemplo es node, iterator y reverseIterator en LinkedList.
    // Outer classes

    public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();
        // Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes no pueden ser cambiadas o alteradas

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);
        lista1.add(100);

        lista2.add(" Hola ");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming ");
        lista2.add(" Adios");

        LinkedList<Integer>.Iterator it = lista1.getIterator();



        while(it.hasNext()){
            LinkedList<Integer>.Iterator backupIt = lista1.new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<Integer>.ReverseIterator reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<String>.Iterator itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }
    }
}