package Hashing;
// Rehashing
import java.util.ArrayList;

public class Map<K,V> {
   static class MapNode<K,V>{
        K key;
        V value;
        MapNode<K,V> next;
        MapNode(K key, V value){
            this.key= key;
            this.value = value;
            this.next =null;
        }
    }
    // Bucket Array
  private ArrayList<MapNode<K,V>> buckets;
   // Size of Elements Entered
   int size;
    // Bucket array size
   int bucketSize;
    final  double LF = 0.75;
    public Map(){
        bucketSize = 5;
        buckets = new ArrayList<>(bucketSize);
        for (int i = 0; i <bucketSize; i++) {
            buckets.add(null);
        }
            System.out.println("HashMap created");
            System.out.println("Number of pairs in the Map: " + size);
            System.out.println("Size of Map: " + bucketSize);
            System.out.println("Default Load Factor : " + LF + "\n");

    }
    // Get the Index
    public int getBucketIdx(K key){
        int hashcode = key.hashCode();
        return (hashcode % bucketSize);
    }
   public void insert(K key ,V value){
     int bucketIdx = getBucketIdx(key);
     MapNode<K,V> head = buckets.get(bucketIdx);
      while (head!=null){
        if(head.key.equals(key)){
            head.value = value;
            return;
        }
        head= head.next;
      }
      MapNode<K,V> node = new MapNode<>(key, value);
      head = buckets.get(bucketIdx);
       node.next = head;
      buckets.set(bucketIdx,node);

      System.out.println("Pair(" + key + ", " + value + ") inserted successfully.\n");
      size++;
      double lf = ((1.0)*size)/bucketSize;
       System.out.println("Current Load Factor = "+ lf);
       if(lf>LF){
           System.out.println("Current Load Factor is greater than Load Factor ");
           System.out.println("So rehashing will be done");
           rehash();
           System.out.println("New size of Map :" +bucketSize);
       }
       System.out.println("Number of pairs in the Map: " + size);
       System.out.println("Size of Map: " + bucketSize + "\n");
   }

    private void rehash() {
        System.out.println("\n ***Rehashing Started*** \n");
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<MapNode<K,V>>(2*bucketSize);
        for (int i = 0; i <2*bucketSize ; i++) {
            buckets.add(null);
        }
        size =0;
        bucketSize = 2*bucketSize;
        for (int i=0;i<temp.size();i++) {
            MapNode<K,V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
        System.out.println("\n ***Rehashing Done*** \n");
    }
    void printMap(){
        ArrayList<MapNode<K,V>> temp = buckets;
        System.out.println("Current HashMap:");
        for (int i = 0; i <temp.size(); i++) {
            MapNode<K,V> node = temp.get(i);
            while (node!=null){
                System.out.println("key = " + node.key + ", val = " + node.value);
                node = node.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<Integer,String>  map = new Map<>();
        map.insert(1,"Yawar");
        map.printMap();
        map.insert(2,"Shakir");
        map.printMap();
        map.insert(3,"Danish");
        map.printMap();
        map.insert(4,"Aakash");
        map.printMap();
        map.insert(5,"Aabid");
        map.printMap();
    }

}
