package algoritms;

import java.util.ArrayList;
import java.util.Arrays;

public class ChunkArray {
    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 15, 16, 17, 22, 33, 44, 55};
        int size = 4;
        System.out.println(Arrays.deepToString(chunkArray(array, size).toArray()));
//        [[11, 12, 13, 14], [15, 16, 17, 22], [33, 44, 55]]

        ArrayList<int[]> result = chunkArray(array, 5);
        System.out.println(Arrays.deepToString(result.toArray()));
//        [[11, 12, 13, 14, 15], [16, 17, 22, 33, 44], [55]]

        System.out.println(Arrays.toString(result.get(0)));
//        [11, 12, 13, 14, 15]
    }

    public static ArrayList<int[]> chunkArray(int[] array, int size) {
        int startIndex = 0;
        ArrayList<int[]> arrayList = new ArrayList<>();
        while (array.length > startIndex) {
            int endIndex = Math.min(startIndex + size, array.length);
            int[] arraySlice = Arrays.stream(array, startIndex, endIndex).toArray();
//            int[] arraySlice = Arrays.copyOfRange(array, startIndex, endIndex);
            arrayList.add(arraySlice);
            startIndex += size;
        }
        return arrayList;
    }
}
