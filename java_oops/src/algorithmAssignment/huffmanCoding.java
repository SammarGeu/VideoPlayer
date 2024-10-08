//Ques 26- Huffman Coding
package algorithmAssignment;
import java.util.*;
public class huffmanCoding {
    public static void main(String[] args)throws Exception {
        String str = "djnciqd";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);
    }
}
class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i=0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            if(fmap.containsKey(cc)) {
                int ov = fmap.get(cc);
                ov += 1;
                fmap.put(cc, ov);
            } else {
                fmap.put(cc, 1);
            }
        }

        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for(Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while(minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String osf) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf+"0");
        initEncoderDecoder(node.right, osf+"1");
    }

    public String encode(String source) {
        String ans = "";

        for(int i=0; i<source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }

        return ans;
    }

    public String decode(String codedString) {
        String key = "";
        String ans = "";
        for(int i=0; i<codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if(decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
 class Heap<T extends Comparable<T>>{

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }
    public int size(){
        return list.size();
    }
    private void upheap(int index){

        if(index == 0){
            return;
        }

        int p = parent(index);

        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from empty Heap");
        }
        T temp = list.get(0);

        T last = list.remove(list.size() - 1);

        if(!list.isEmpty()){
            list.set(0, last);

            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {

        int min = index;
        int left = left(index);
        int right = right(index);

        // check is left < min
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        // check if right < min
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(min, index);

            downheap(min);
        }
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private int left(int index){
        return index * 2 + 1;
    }

    private int right(int index){
        return index * 2 + 2;
    }

    public ArrayList<T> heapSort() throws Exception {

        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

}





