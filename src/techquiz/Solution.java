package techquiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by viral on 4/21/2016.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static double pow(double x, int n) {
        if (n == 0){
            return 1.0;
        }
        double answer = x;
        for (int i = 1; i < Math.abs(n); i++) {
            answer = x * answer;
        }
        if (n > 0){
            return answer;
        }else{
            return 1/answer;
        }
    }

    public static boolean isStringPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0, j = charArray.length-1; i < str.length()/2; i++, j--) {
            if (charArray[j] != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean areAllCharUnique(String str){
        if (str == null || str.length() == 0){
            return true;
        }

        Set<Character> characterSet = new HashSet<>();
        for (char c : str.toCharArray()){
            if (characterSet.contains(c)){
                return false;
            }else {
                characterSet.add(c);
            }
        }
        return true;
    }

    public static int[] merge(int[] arrLeft, int[] arrRight){
        int[] mergedArray = new int[arrLeft.length + arrRight.length];
        int mergePointer = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer < arrLeft.length && rightPointer < arrRight.length){
            if (arrLeft[leftPointer] < arrRight[rightPointer]){
                mergedArray[mergePointer] = arrLeft[leftPointer];
                leftPointer++;
            }else if (arrLeft[leftPointer] > arrRight[rightPointer]){
                mergedArray[mergePointer] = arrRight[rightPointer];
                rightPointer++;
            }else {
                mergedArray[mergePointer++] = arrLeft[leftPointer++];
                mergedArray[mergePointer] = arrRight[rightPointer++];
            }
            mergePointer++;
        }

        while (leftPointer < arrLeft.length){
            mergedArray[mergePointer] = arrLeft[leftPointer];
            leftPointer++;
            mergePointer++;
        }

        while (rightPointer < arrRight.length){
            mergedArray[mergePointer] = arrRight[rightPointer];
            rightPointer++;
            mergePointer++;
        }

        return mergedArray;
    }

    static int singleNumber(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
