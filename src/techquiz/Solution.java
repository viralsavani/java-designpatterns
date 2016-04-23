package techquiz;

import java.util.*;

/**
 * Created by viral on 4/21/2016.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static String computeBinary(int val) {
        StringBuilder sb = new StringBuilder();
        int n = val;
        while (n > 0){
            sb.insert(0,n&1);
            n = n >> 1;
        }
        return sb.toString();
    }

    public static int binarySearch(int[] array, int size, int value){
        int low = 0;
        int high = size - 1;

        while (low <= high){
            final int mid = (low + high) >>> 1;
            final int midVal = array[mid];
            if (midVal < value){
                low = mid + 1;
            }else if (midVal > value){
                high = mid - 1;
            }else {
                return mid; // value found
            }
        }
        return ~low;    // value not found
    }

    public static String compressString(String text) {
        StringBuilder sb = new StringBuilder();
        char[] characters = text.toCharArray();
        Arrays.sort(characters);
        char currentChar = characters[0];
        int counter = 1;

        for (int i = 1; i < characters.length; i++) {
            if (currentChar == characters[i]){
                counter++;
            }else {
                sb.append(currentChar).
                        append(counter > 1? String.valueOf(counter) : "");
                currentChar = characters[i];
                counter = 1;
            }
        }
        sb.append(currentChar).
                append(counter > 1? String.valueOf(counter) : "");
        return sb.toString();
    }

    public static boolean isIntPalindrome(int x){
        return x == reverseInt(x);
    }

    public static int reverseInt(int x) {
        int reversed = 0;
        int absX = Math.abs(x);
        while (absX != 0){
            int modulo = absX%10;
            reversed = reversed*10 + (modulo);
            absX = absX/10;
        }
        if (x < 0){
            return -reversed;
        }
        return reversed;
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
