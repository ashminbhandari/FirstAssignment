import java.util.ArrayList;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array.length >= 1 ? array[0] : "";
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array.length >= 2 ? array[1] : "";
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array.length >= 1 ? array[array.length - 1] : "";
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array.length >= 2 ? array[array.length - 2] : "";
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] arry = new String[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arry[j] = array[i];
            j += 1;
        }

        return arry;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int fingerA = array.length / 2;
        int fingerB = array.length / 2;

        if (array.length % 2 == 0) {
            fingerA -= 1;
        }

        while (fingerA != 0) {
            if (array[fingerA] != array[fingerB]) return false;
            fingerA -= 1;
            fingerB += 1;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int count[] = new int[26];

        for (String s : array) {
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) count[s.charAt(i) - 97]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                cnt += 1;
            }
        }

        return cnt;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> retArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                retArray.add(array[i]);
            }
        }

        return retArray.toArray(new String[retArray.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if (array.length <= 1) {
            return array;
        }

        ArrayList<String> retStrArray = new ArrayList<String>();
        retStrArray.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != retStrArray.get(retStrArray.size() - 1)) {
                retStrArray.add(array[i]);
            }
        }

        return retStrArray.toArray(new String[retStrArray.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> retArray = new ArrayList<>();
        String cur = array[0];

        for (int i = 1; i <= array.length; i++) {
            if (i < array.length && cur.charAt(0) == array[i].charAt(0)) {
                cur += array[i];
                System.out.println(cur);
            } else {
                retArray.add(cur);
                if (i < array.length) cur = array[i];
            }
        }

        return retArray.toArray(new String[retArray.size()]);
    }
}
