package ThirtyDaysOfCode.A8_DictionariesAndMaps;

import java.util.*;

class Solution8 {
    public static void main(String []argh){
        Map<String,Integer> map = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s)){
                System.out.println(s + "=" + map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}