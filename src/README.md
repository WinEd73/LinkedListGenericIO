pendientes:

pensar en buena implementacion para el insert basado en un elemento existente:

```java 
Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            LinkedList.ForwardtIterator backupIt = lista1.new ForwardtIterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }
