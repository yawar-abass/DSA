package Hashing;

import java.util.ArrayList;
import java.util.Objects;

// HashTable Implementation , Separate Collision , Rehashing
public class Map1<K,V> {
    static class HashNode<K,V>{ // create a hashNode with value, Key, hashcode, next pointer
        K key;
        V value;
        HashNode<K,V> next;
        final int hashCode;

       public HashNode(K key,V value,int hashCode) {
           this.key= key;
           this.hashCode= hashCode;
           this.value = value;
       }
   }
   // Bucket Array --> Arraylist with hashNode
    ArrayList<HashNode<K,V>> bucketArray;
    int bucketSize; // size of Bucket Array
    int size;// Size of --> How many elements inserted
   public Map1(){ // Constructor
       bucketSize =5;
       size =0;
       bucketArray = new ArrayList<>();
       for (int i = 0; i <bucketSize; i++) { // Put the all list as null
          bucketArray.add(null);
       }
   }
    // returns the size ---> How many elements Inserted
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
       return getSize()==0;
    }
    // Returns the hashcode of  key
    public int hashCode(K key){
       return Objects.hashCode(key);
    }
    // returns the index of bucket array with key k
    public int getBucketIndex(K key){
       int hash = hashCode(key);
       int index = hash % bucketSize;
       index = index<0?index*-1:index;// for negative index
       return index;
    }
    // Remove the key K
    public V remove(K key){
        // get the index where we want to delete the key
       int bucketIndex = getBucketIndex(key);
       int hashCode = hashCode(key);
       // get the element in bucketArray at bucketIndex
       HashNode<K, V> head = bucketArray.get(bucketIndex);
        HashNode<K, V> prev= null;
        while (head!=null){
            if(head.key.equals(key) && hashCode == head.hashCode){
                break;
            }
            prev = head;
            head = head.next;
        }
        // If key was not there
        if(head ==null){
            return null;
        }
        size--;
        if(prev!=null){
            prev.next = head.next;
        }else {
            bucketArray.set(bucketIndex,head.next);
        }
        return head.value;
    }
    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key) && hashCode == head.hashCode){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public void add(K key, V value){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head!=null){
            if(head.key.equals(key) &&  hashCode == head.hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head= bucketArray.get(bucketIndex);
        HashNode<K,V> node = new HashNode<>(key, value, hashCode);
        node.next = head;
        bucketArray.set(bucketIndex,node);
        double lf = (1.0*size)/bucketSize;// Calculate the current Load Factor
        if(lf>0.75){// create a new Bucket array with double size of current bucketArray
            ArrayList<HashNode<K,V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            bucketSize =2*bucketSize;
            size =0;
            for (int i = 0; i <bucketSize; i++) {
                bucketArray.add(null);
            }
            for (HashNode<K,V> n:temp) {
                while (n!=null){
                    add(n.key,n.value);
                    n= n.next;
                }
            }
        }

    }
    public void printHashTable(){
        for (int i = 0; i <bucketSize ; i++) {
            HashNode<K,V> temp = bucketArray.get(i);
            while (temp!=null){
                System.out.println("Key: '"+temp.key+ "', Value: '"+ temp.value+"'");
                temp= temp.next;
            }
        }

    }
    // Driver Code
    public static void main(String[] args) {
        Map1<String , Integer> map1 = new Map1<>();
        map1.add("this", 1);
        map1.add("is",2);
        map1.add("yawar",3);
        map1.printHashTable();
        System.out.println("Removed --> "+map1.remove("is"));
        System.out.println("New HashTable");
        map1.printHashTable();
    }

}
