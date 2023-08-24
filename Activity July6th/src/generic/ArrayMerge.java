/*
 * Purpose: takes two lists of the same type and merges them into a single list. 
 * This method alternates the elements of each list.
 * Script Date: August 16, 2023
 * Developed by: Lisi Cao
 */

 package generic;

 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class ArrayMerge {
	 // merge method
     public static <T> List<T> merge(List<T> list1, List<T> list2) {
 
         // verify if null
         if (list1 == null || list2 == null) {
             throw new IllegalArgumentException("Input lists cannot be null");
         }
 
         // create iterators for each list
         List<T> mergeList = new ArrayList<>();
         Iterator<T> it1 = list1.iterator();
         Iterator<T> it2 = list2.iterator();
         // add elements to the mergeList
         while (it1.hasNext() || it2.hasNext()) {

             if (it1.hasNext()) {
                 mergeList.add(it1.next());
             }
 
             if (it2.hasNext()) {
                 mergeList.add(it2.next());
             }
         }
 
         /*
          * 
          * while (it1.hasNext() && it2.hasNext()) { mergeList.add(it1.next());
          * mergeList.add(it2.next()); }
          * 
          * while (it1.hasNext()) { mergeList.add(it1.next()); }
          * 
          * while (it2.hasNext()) { mergeList.add(it2.next()); }
          */
 
         return mergeList;
     }
 
     // test method, print out the result
     public static <T> void testMerge(List<T> list1, List<T> list2) {
        
         try {
             List<T> mergedList = ArrayMerge.merge(list1, list2);
             System.out.println("List 1: " + list1);
             System.out.println("List 2: " + list2);
             System.out.println("Merged: " + mergedList);
         } catch (Exception e) {
             System.out.println("Exception when merging: " + e.getMessage());
         }
         System.out.println("--------------------------");
     }
     // main method to test
     public static void main(String[] args) {
         // Standard test
         testMerge(List.of(1, 3, 5), List.of(2, 4, 6));
 
         // Length mismatch
         testMerge(List.of(1, 3, 5, 7, 9), List.of(2, 4, 6));
         testMerge(List.of(1, 3), List.of(2, 4, 6, 8, 10));
 
         // Empty lists
         testMerge(new ArrayList<Integer>(), new ArrayList<Integer>());
         testMerge(new ArrayList<Integer>(), List.of(2, 4, 6));
         testMerge(List.of(1, 3, 5), new ArrayList<Integer>());
 
         // Include null values
         List<String> list1 = new ArrayList<>();
         list1.add("a");
         list1.add(null);
         list1.add("c");
 
         List<String> list2 = new ArrayList<>();
         list2.add("d");
         list2.add("e");
         list2.add(null);
 
         testMerge(list1, list2);
 
         // Other data types
         testMerge(List.of(1.1, 3.3, 5.5), List.of(2.2, 4.4, 6.6));
         testMerge(List.of('a', 'b', 'c'), List.of('d', 'e', 'f'));
 
         // Negative test (should handle gracefully)
         testMerge(null, List.of(2, 4, 6));
         testMerge(List.of(1, 3, 5), null);
         testMerge(null, null);
     }
 }
