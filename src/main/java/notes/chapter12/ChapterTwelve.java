package notes.chapter12;

import java.util.*;

public class ChapterTwelve {

    /*
    collections are objects that hold references to other objects also known as data structures
    the objects within the collection are known as elements
    some collections can have duplicates elements some must have different elements

    collections is an interface

    Set is a collections that cannot hold duplicate elements
    think of a set as a deck of cards and theres 52 different cards inside

    List is a collections that lists are ordered and can contain duplicates elements
    think like a phone book and how you go from top to bottom in your contact list

    Queue is a collections of order elements that would be procecced in a way
    think like in a store and how a queue would work, first in first out

    Map isnt a true collections but it is similar and can be used like a collections
    map isnt inherited has key value pairs,

    Similar to arrayLists

     */
     /**
     Set Methods
      .add - adds an object to the collections
      .clear - clears all objects from collection
      .contains - returns a true values if a specified object is an element inside collection
      .isEmpty  - checks to see if the set is empty
      .interator - returns an interator object for the collection
      .remove - removes an element from the collection
      .size - finds the size for the collection
     */
    /**
     List Methods
     .add - adds an object to the collections
     .addAll(Collection c) - inserts all elments from collection inside the parameter
     .get - returns the index position
     .indexOf - returns true if the collection has no elemnets
     .lastIndexOf - returns the index of the first instance of an object in the list
     .listIterator - returns the index of the last instance of an object in the list
     .remove - removes an element from the collection using the index
     .set - assigns object to a location based on the index
     .sublist - returns a list containing elements from start to end
     */
    /**
     Queue Methods
     .add - adds elements to the end/tail
     .peek - used to see the next element up without removing it
     .element - similar to element but throws an error is queue is empty
     .remove - removes and returns the head of the queue, if empty error will be given
     .poll - similar to remove but returns null if empty
     * */

    /**
     Map Methods
     .clear - removes all key/value pairs
     .containsKey - returns if the map contains an element that has a key
     .containsValue - returns if the map contains an element that has a value
     .entrySet - returns a set that contains the entries in the map
     .get - returns the value associated with the key
     .isEmpty - returns if the map is empty
     .keyset - returns a set that contains the keys in the map
     .put - puts an entry into the map overwriting any previous values
     .putAll - puts all the entries from parameter into this map
     .putIfAbsent - puts an entry in the map if the ket doesnt already exist
     .remove - removes the entry whose key equals key
     */







    public static void main(String[] args) {
        //SET
        Set fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("orange");
        fruit.add("Apple");//since this is a set collection, apple is only stored once
       // System.out.println(fruit);
        setDemo(fruit);

        //LIST
        List newFruits = new ArrayList();
        newFruits.add(5);
        newFruits.add("Lime");
        newFruits.add("Lime");//since this is a list, its allowed to contain duplicates, lime is stored 3 times
        newFruits.add("banana");
        newFruits.add("Watermelon");
        System.out.println(newFruits);
        //System.out.println(newFruits.get(4));//lists can use index positions to get the element


        //QUEUE
        Queue names = new LinkedList();
        names.add("Henry");
        names.add("James");
        names.add("Maya");
        names.add("Hector");
       // System.out.println(names);
       // names.poll();
        //System.out.println(names);
        //System.out.println(names.peek());

        //MAP

        Map qty = new HashMap();
        qty.put(1, 5);
        qty.put("bananas", 9);
        qty.put("Oranges", 5);
        qty.put("Limes", 1);

        qty.remove("Henry");
       // System.out.println(qty);
      //  System.out.println(qty.entrySet());

        mapDemo(qty);


    }

    public static void setDemo(Set<String> j){// this works with any collection
       var i = j.iterator();
       while (i.hasNext()){//similar to a forEach loop
           System.out.println(i.next());
       }
       for(String p : j){
           System.out.println(p);
       }
        j.forEach(f -> System.out.println(f)); //this is a forEach loop but requires an action inside like weve put
        j.forEach(System.out::println);//this is similar to above but this requires a method
    }

    public static void mapDemo(Map<String, Integer> k){
        for(var entry : k.entrySet()){
            System.out.println(entry.getValue());
        }
        k.forEach((s,v) -> System.out.println("Fruit: " + k + ", Quantity " + v));
    }
}
