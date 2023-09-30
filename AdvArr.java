//add your package if needed
//package ;
class IntArray{
    //Add an item to an Array and also increment the Array length with it
    public static int[] add(int[] arr, int num){
        int arrLen = arr.length;
        int[] tmpArr = new int[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static int[] addAt(int[] arr, int num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        int[] tmpArr = new int[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static int[] remove(int[] arr, int num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        int[] tmpArr = new int[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static int[] removeItem(int[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        int[] tmpArr = new int[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static int[] replaceItem(int[] arr, int item,int num){
        int arrLen = arr.length;
        int[] tmpArr = new int[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class BoolArray{
    //Add an item to an Array and also increment the Array length with it
    public static boolean[] add(boolean[] arr, boolean num){
        int arrLen = arr.length;
        boolean[] tmpArr = new boolean[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static boolean[] addAt(boolean[] arr, boolean num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        boolean[] tmpArr = new boolean[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static boolean[] removeItem(boolean[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        boolean[] tmpArr = new boolean[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static boolean[] replaceItem(boolean[] arr, boolean item,int num){
        int arrLen = arr.length;
        boolean[] tmpArr = new boolean[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class ByteArray{
    //Add an item to an Array and also increment the Array length with it
    public static byte[] add(byte[] arr, byte num){
        int arrLen = arr.length;
        byte[] tmpArr = new byte[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static byte[] addAt(byte[] arr, byte num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        byte[] tmpArr = new byte[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static byte[] remove(byte[] arr, byte num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        byte[] tmpArr = new byte[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static byte[] removeItem(byte[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        byte[] tmpArr = new byte[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static byte[] replaceItem(byte[] arr, byte item,int num){
        int arrLen = arr.length;
        byte[] tmpArr = new byte[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class ShortArray{
    //Add an item to an Array and also increment the Array length with it
    public static short[] add(short[] arr, short num){
        int arrLen = arr.length;
        short[] tmpArr = new short[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static short[] addAt(short[] arr, short num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        short[] tmpArr = new short[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static short[] remove(short[] arr, short num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        short[] tmpArr = new short[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static short[] removeItem(short[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        short[] tmpArr = new short[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static short[] replaceItem(short[] arr, short item,int num){
        int arrLen = arr.length;
        short[] tmpArr = new short[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class LongArray{
    //Add an item to an Array and also increment the Array length with it
    public static long[] add(long[] arr, long num){
        int arrLen = arr.length;
        long[] tmpArr = new long[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static long[] addAt(long[] arr, long num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        long[] tmpArr = new long[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static long[] remove(long[] arr, long num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        long[] tmpArr = new long[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static long[] removeItem(long[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        long[] tmpArr = new long[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static long[] replaceItem(long[] arr, long item,int num){
        int arrLen = arr.length;
        long[] tmpArr = new long[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class FloatArray{
    //Add an item to an Array and also increment the Array length with it
    public static float[] add(float[] arr, float num){
        int arrLen = arr.length;
        float[] tmpArr = new float[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static float[] addAt(float[] arr, float num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        float[] tmpArr = new float[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static float[] remove(float[] arr, float num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        float[] tmpArr = new float[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static float[] removeItem(float[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        float[] tmpArr = new float[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static float[] replaceItem(float[] arr, float item,int num){
        int arrLen = arr.length;
        float[] tmpArr = new float[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class DoubleArray{
    //Add an item to an Array and also increment the Array length with it
    public static double[] add(double[] arr, double num){
        int arrLen = arr.length;
        double[] tmpArr = new double[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static double[] addAt(double[] arr, double num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        double[] tmpArr = new double[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static double[] remove(double[] arr, double num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        double[] tmpArr = new double[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static double[] removeItem(double[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        double[] tmpArr = new double[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static double[] replaceItem(double[] arr, double item,int num){
        int arrLen = arr.length;
        double[] tmpArr = new double[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}
class StringArray{
    //Add an item to an Array and also increment the Array length with it
    public static String[] add(String[] arr, String num){
        int arrLen = arr.length;
        String[] tmpArr = new String[arrLen+1];
        for (int i = 0; i < arrLen; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arrLen] = num;
        return tmpArr;
    }
    //Add an item at a special position in an array starting from 0
    public static String[] addAt(String[] arr, String num, int pos){
        int arrLen = arr.length;
        boolean added = false;
        String[] tmpArr = new String[arrLen+1];
        for (int i = 0; i < arrLen+1; i++){
            if (i!=pos){
                if (added){
                    tmpArr[i] = arr[i-1];
                }else{
                    tmpArr[i] = arr[i];
                }
            }else {
                tmpArr[i] = num;
                added = true;
            }
        }
        return tmpArr;
    }
    //Remove every given number from an array and return the new list with the decremented length
    public static String[] remove(String[] arr, String num){
        int amountToRemove = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(num)){
                amountToRemove++;
            }
        }
        int arrLen = arr.length-amountToRemove;
        String[] tmpArr = new String[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (!arr[i].equals(num)){
                tmpArr[i-1] = arr[i];
            }
        }
        return tmpArr;
    }
    //Remove a spezific position of an array and also decrement the array length
    public static String[] removeItem(String[] arr, int num){
        int arrLen = arr.length-1;
        int tmp = 0;
        String[] tmpArr = new String[arrLen];
        for (int i = 0; i < arr.length; i++){
            if (i != num){
                tmpArr[tmp] = arr[i];
                tmp++;
            }
        }
        return tmpArr;
    }
    public static String[] replaceItem(String[] arr, String item,int num){
        int arrLen = arr.length;
        String[] tmpArr = new String[arrLen];
        tmpArr = removeItem(arr, num);
        tmpArr = addAt(tmpArr, item, num);
        return tmpArr;
    }
}