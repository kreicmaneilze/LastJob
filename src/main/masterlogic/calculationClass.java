package main.masterlogic;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class calculationClass {
    public calculationClass(char findLargest) {

    }

    public class longestWord {
        final String words = null;
        private String FailaNosaukums;

        {
//
//        }
//
//        private final String FailaNosaukums = "textData.txt";
//
//        {
//            try {
//                FileReader fileReader = new FileReader("./src/main.data/" + this.FailaNosaukums);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            Throwable var4 = null;
//            String ss[] = words.split(" ");
//
//            List<String> vardi = new ArrayList<>();
//
//            Map<Integer, String> set = new Hashtable<Integer, String>();
//
//            int i = 0;
//            for (
//                    String str : vardi) {
//                set.put(str.length(), str);
//                System.out.println(vardi.get(i));
//                i++;
//            }
//
//
//            Set<Integer> keys = set.keySet();
//
//            System.out.println(keys);
//            System.out.println(set);
//
//            Object j[] = keys.toArray();
//
//            Arrays.sort(j);
//
//            Object max = j[j.length - 1];
//
//            set.get(max);
//
//            System.out.println("Tha longest word is " + set.get(max));
//            System.out.println("Length is  " + max);
        }

        public int findLargest(int array[]) {

            final String FailaNosaukums = "textData.txt";

            try {
                FileReader fileReader = new FileReader("./src/main.data/" + this.FailaNosaukums);

                int largest = array[0];
                int largestIndex = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] > largest) {
                        largest = array[i];
                        largestIndex = i;
                    }
                }

                return largestIndex;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return 0;
        }
    }
}

//        class LargestFromTextFile {
//            public void main(String[] args) {
//                try {
//                    Scanner file = new Scanner(new File("numbers.txt"));
//                    int largest = file.nextInt();
//
//                    while (file.hasNextInt()) {
//                        int number = file.nextInt();
//
//                        if (number > largest) {
//                            largest = number;
//                        }
//
//                        System.out.println(number);
//                    }
//
//                    file.close();
//
//                    System.out.println("The biggest number in the file is: " + largest);
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//        }
//
//    }
//}
