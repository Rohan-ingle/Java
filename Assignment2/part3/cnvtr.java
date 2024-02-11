package part3;


import java.util.ArrayList;

public class converter {
    public Integer[] arr_lst_2_arr(ArrayList<Integer> arrlist)
    {
        return arrlist.toArray(new Integer[0]);
    }

    public ArrayList<Integer> arr_2_arr_lst(int[] arr)
    {
        ArrayList<Integer> converted_arrlist = new ArrayList<>();

        for(int i: arr)
        {
            converted_arrlist.add(i);
        }

        return converted_arrlist;
    }
}