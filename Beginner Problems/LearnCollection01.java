import java.util.*;

public class LearnCollection01 {
    static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        //Reference ArrayList hai aur implementation ArrayList type ka

        LinkedList<Integer> arr1=new LinkedList<>();
        //same as ArrayList

        //add
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);

        //remove
        arr.remove(0);
        System.out.println(arr);

        //addAll
        arr1.add(100);
        arr1.add(200);
        arr1.add(300);
        arr1.addAll(arr);
        System.out.println(arr1);

        //removeAll
        arr1.removeAll(arr);
        System.out.println(arr1);

        //clear
        arr1.clear();
        System.out.println(arr1.size());

        //traverse list using iterator
        Iterator<Integer>iterator=arr.iterator();
        while(iterator.hasNext()){
            System.out.println("Element :"+iterator.next());
        }

        List<Integer> list=new ArrayList<>();
        //Reference List hai aur implementation ArrayList type ka

        //set and get
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list.get(0));
        System.out.println("Before set :"+list);
        list.set(0,110);
        System.out.println("After set :"+list);

        //toArray
        Object[] arrr =list.toArray();
        for(Object obj:arrr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list.contains(110));
        System.out.println(list.contains(1100));

        //sort
        list.add(45);
        list.add(23);
        list.add(12);
        System.out.println("Entire List "+list);
        Collections.sort(list);
        System.out.println("Entire List "+list);

        //clone
        ArrayList<Integer> arr2= (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
        //this way cloning not work in LinkedLlist

        System.out.println(arr2);

        //isEmpty
        System.out.println(arr2.isEmpty());

        //indexOf
        System.out.println(arr2.indexOf(110));

        //addFirst and addLast
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(10);
        ll.add(34);
        ll.add(76);
        ll.addFirst(12);
        ll.addLast(45);
        System.out.println(ll);

        //removeFirst and removeLast
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        //getFirst and getLast
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        //peek(return 1st element)
        System.out.println(ll.peek());

        //poll(return 1st element and also remove it)
        System.out.println(ll.poll());

        Stack<Integer>stack=new Stack<>();
        //same as ArrayList it just Follow LIFO principle

        //stack specific methods
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search(10)); //return index if value present otherwise -1

        System.out.println(stack.empty());


        Collection<Integer> collection=new ArrayList<>();
        //Reference Collection hai aur implementation ArrayList type ka

        Vector<Integer>vector=new Vector<>();
        //same as ArrayList just it synchronize the methods

    }
}
