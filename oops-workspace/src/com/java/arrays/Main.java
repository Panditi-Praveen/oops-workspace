package com.java.arrays;

public class Main {
    static void main() {
        int[] ids; // array declaration
        ids = new int[5]; //array instantiation
        System.out.println(ids[0]);


        //array initialization
        ids[0] =101;
        ids[1] =102;
        ids[2] =103;
        ids[3] =104;
        ids[4] =105;

        System.out.println(ids.length);
        for (int index = 0; index < ids.length; index++) {
            System.out.println(ids[index]);
        }

        //enhanced for loop (for-each)

        for (int id : ids) { // for each id in ids
            System.out.println(id);

        }
        //add 10000 to all ids in ids array
        for (int id : ids){
            id += 10000;
            System.out.println(id);
        }
        // minus 500 to all ids in ids array
        for (int id: ids){
            id -= 500;
            System.out.println(id);
        }
        //multiply with 2  to all ids in ids array
        for (int id : ids){
            id *= 2;
        }
        for (int id : ids){
            System.out.println(id);
        }
        /*float[] prices = new float[5];
        prices[0] = 100.5F;
        prices[1] = 200.5F;
        prices[2] = 300.5F;
        prices[3] = 400.5F;
        prices[5] = 500.5F;*/
        float[] prices = {100.5F, 200.5F, 300.5F,400.5F,500.5F};
        for (float price: prices){
            System.out.println(price);
        }
        char[] genders = {'M', 'F', 'T', 'F'};
        for (char gender : genders){
            System.out.println(gender);
        }

    }
}
