package homeWork10;

public class Task1 {
    public static void main(String[] args) {
        int[] twenty = new int[20];
        for (int i = 0; i < twenty.length; i++) {
            twenty[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(twenty[i]);  //распечатываю что бы можно было метод проверить
        }
        max(twenty);
        min(twenty);
    }
        public static void max (int[]twenty) {
        int maxValue = twenty[0];
        int numberMaxValues=0;
        for(int i = 1; i<twenty.length; i++) {
            if(twenty[i]>maxValue){
                maxValue = twenty[i];
            }
        }
            for (int i : twenty) {
                if (i == maxValue) {
                    numberMaxValues++;
                }
            }
            System.out.println("Maximum value of this array = "+ maxValue);
            System.out.println("There are "+ numberMaxValues+ " element(s) with maximum value");

        }
        public static void min (int[]twenty) {
            int minValue = twenty[0];
            int numberMinValues=0;
            for(int i = 1; i<twenty.length; i++) {
                if(twenty[i]<minValue){
                    minValue = twenty[i];
                }
            }
            for (int i : twenty) {
                if (i == minValue) {
                    numberMinValues++;
                }
            }
            System.out.println("Minimum value of this array = "+ minValue);
            System.out.println("There are "+ numberMinValues+ " element(s) with minimum value");

        }
    }
