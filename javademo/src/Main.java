import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 调用 Demo
        Demo demo = new Demo();
        demo.testArray();
    }
}


class Demo {
    public void testArray() {
        // 数组操作
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        // 数组拷贝
        int[] arr2 = new int[10];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[0] = 5;
        for (int i : arr2) {
            System.out.println(i);
        }
        for (int i : arr) {
            System.out.println(i);
        }
/*        int[] arr3 = arr.clone();
        arr3[0] = 6;
        for (int i : arr3) {
            System.out.println(i);
        }
        for (int i : arr) {
            System.out.println(i);
        }*/
    }

    public void test() {
        // 1. 传统方式
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("传统方式");

        // 2. Lambda 表达式
        Consumer<String> consumer2 = (String s) -> {
            System.out.println(s);
        };
        consumer2.accept("Lambda 表达式");

        // 3. Lambda 表达式简化
        Consumer<String> consumer3 = (s) -> {
            System.out.println(s);
        };
        consumer3.accept("Lambda 表达式简化");

        // 4. Lambda 表达式简化
        Consumer<String> consumer4 = s -> {
            System.out.println(s);
        };
        consumer4.accept("Lambda 表达式简化");

        // 5. Lambda 表达式简化
        Consumer<String> consumer5 = s -> System.out.println(s);
        consumer5.accept("Lambda 表达式简化");
    }
}