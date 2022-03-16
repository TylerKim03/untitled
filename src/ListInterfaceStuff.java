import javafx.beans.binding.ListExpression;

import java.util.*;

public class ListInterfaceStuff {
    public static void main(String[] args) {

        ListExpression<Object> myList = null;
        Iterator<Object> iter = myList.iterator();

        for (int i = 0; i <myList.size(); i++) {
            System.out.println(iter.next());
        }

        if(iter.hasNext()){
            System.out.println(iter.next() );

        } else {
            System.out.println("End");
        }

    }
}
