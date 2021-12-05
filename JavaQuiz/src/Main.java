import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        TreeMap<String, Long>  map=new TreeMap<>((String o1,String o2)->{
            return o1.compareTo(o2);
        });

        String[] data=new String[2];
        while(true)
        {String str=input.nextLine();
            if(str.equals("end"))
                break;
            else
                data=str.split(" ");
            map.put(data[0], Long.parseLong(data[1]));
        }

        while(true) {
            String str=input.nextLine();
            if(str.equals("end"))
                break;
            else
                data=str.split(" ");
            map.put(data[0], Long.parseLong(data[1]));
        }

        Set<String> keys=map.keySet();
        for(String p:keys)
            System.out.println(p+" "+map.get(p));
    }
}