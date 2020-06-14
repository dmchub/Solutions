import java.io.*;
import java.util.*;

public class Solution2057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ls = new ArrayList<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            String[] strTemp = str.split(" ", -1);
            List<String> list = new ArrayList<>(Arrays.asList(strTemp));
            if(Integer.parseInt(list.get(0))==1){
                int a = Integer.parseInt(list.get(1));
                ls.add(a);
            }
            if(Integer.parseInt(list.get(0))==2){
                System.out.println(Collections.min(ls));
                // ls.remove(minValue);

            }
        }
    }
}
