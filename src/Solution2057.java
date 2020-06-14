import java.io.*;
import java.util.*;

public class Solution2057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        List<Integer> listOut = new ArrayList();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            String[] strTemp = str.split(" ", -1);
            List<String> list = new ArrayList<>(Arrays.asList(strTemp));

            if(Integer.parseInt(list.get(0))==1){
                int a = Integer.parseInt(list.get(1));
                if(treeMap.containsKey(a)){
                    treeMap.put(a, treeMap.get(a) + 1);
                }else {
                    treeMap.put(a, 1);
                }
                // System.out.println(treeMap);
                // System.out.println(treeMap.firstKey());
                // System.out.println(treeMap.get(treeMap.firstKey()));
            }

            if(Integer.parseInt(list.get(0))==2){
                // System.out.println(treeMap.firstKey());
                listOut.add(treeMap.firstKey());
                if(treeMap.get(treeMap.firstKey()) >= 1){
                    treeMap.put(treeMap.firstKey(), treeMap.get(treeMap.firstKey()) - 1);
                }
                if(treeMap.get(treeMap.firstKey()) == 0){
                    treeMap.remove(treeMap.firstKey());
                }
                // System.out.println(treeMap);
            }
        }

        for(int e : listOut){
            System.out.println(e);
        }
    }
}
