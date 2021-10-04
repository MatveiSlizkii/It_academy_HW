package home_work_4;

import java.util.Arrays;

public class DataContainer<T> {
    T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    int add(T item) {
        int temp = 0;
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] != null) {
                    data[i] = item;
                    temp = i;
                    break;
                } else {
                    data = Arrays.copyOf(data, data.length + 1);
                    data[data.length - 1] = item;
                    temp = data.length - 1;
                }

            }
        } else {
            temp = -1;
        }
        return temp;
    }
    T get(int index){
        return data[index];
    }
//6
//    T[] getItems(){
//        for (Object i:
//             data) {
//
//        }
// 1 2 3 777
    boolean delete(int index){
        if (index >= data.length){
            return false;
        } else {
            data[index] = null;
            int countNull = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null){
                    countNull += 1;
                }
            }

        }
    }
}
