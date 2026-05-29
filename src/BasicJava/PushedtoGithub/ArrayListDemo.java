package BasicJava.PushedtoGithub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Has many built in methods the intellij will suggest itself
        List<String> names =new ArrayList<String>();//can add any number of elements. Not fixed sized.
        names.add("Arpit");
        names.add("Norbu");
        names.add("Pravin");
        names.add("Sherpa");

        names.add(2, "Peter");// adds Peter in second index

        for (int i=0; i < names.size(); i++){
            System.out.println(names.get(i)); //How to iterate collection.
        }

        System.out.println(names);

        Collections.sort(names);// to sort in order. collections has built in methods.


    }
}
