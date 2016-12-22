/**
 * Created by Катя on 12.12.2016.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class Time {
    public static void main(String[] args) {

        List<Integer> intArrayList=new ArrayList<>();
        List<Integer> intLinkedList=new LinkedList<>();
        List<String> stringArrayList=new ArrayList<>();
        List<String> stringLinkedList=new LinkedList<>();
        long startTime;
        long finishTime;
        //add
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intArrayList.add(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList added 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intLinkedList.add(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList added 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringArrayList.add("GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList added 1000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringLinkedList.add("GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList added 1000 string elements. Time= "+(finishTime-startTime));


//get
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intArrayList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList got 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intLinkedList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList got 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringArrayList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList got 1000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringLinkedList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList got 1000 string elements. Time= "+(finishTime-startTime));

        //set
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intArrayList.set(i,i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList set 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            intLinkedList.set(i,i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList set 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringArrayList.set(i,"GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList set 1000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<1000; i++){
            stringLinkedList.set(i,"GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList set 1000 string elements. Time= "+(finishTime-startTime));

        //remove
        startTime= System.currentTimeMillis();
        for(int i=999; i>=0; i--){
            intArrayList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList removed 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=999; i>=0; i--){
            intLinkedList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList removed 1000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=999; i>=0; i--){
            stringArrayList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList removed 1000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=999; i>=0; i--){
            stringLinkedList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList removed 1000 string elements. Time= "+(finishTime-startTime));


        intArrayList.clear();
        intLinkedList.clear();
        stringArrayList.clear();
        stringLinkedList.clear();


        //add
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intArrayList.add(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList added 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intLinkedList.add(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList added 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringArrayList.add("GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList added 10000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringLinkedList.add("GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList added 10000 string elements. Time= "+(finishTime-startTime));


//get
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intArrayList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList got 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intLinkedList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList got 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringArrayList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList got 10000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringLinkedList.get(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList got 10000 string elements. Time= "+(finishTime-startTime));

        //set
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intArrayList.set(i,i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList set 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            intLinkedList.set(i,i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList set 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringArrayList.set(i,"GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList set 10000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            stringLinkedList.set(i,"GoIt");
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList set 10000 string elements. Time= "+(finishTime-startTime));

        //remove
        startTime= System.currentTimeMillis();
        for(int i=9999; i>=0; i--){
            intArrayList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intArrayList removed 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=9999; i>=0; i--){
            intLinkedList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("intLinkedList removed 10000 integer elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=9999; i>=0; i--){
            stringArrayList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringArrayList removed 10000 string elements. Time= "+(finishTime-startTime));
        startTime= System.currentTimeMillis();
        for(int i=9999; i>=0; i--){
            stringLinkedList.remove(i);
        }
        finishTime=System.currentTimeMillis();
        System.out.println("stringLinkedList removed 10000 string elements. Time= "+(finishTime-startTime));
    }







}
