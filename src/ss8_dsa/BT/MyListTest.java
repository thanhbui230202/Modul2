package ss8_dsa.BT;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> test= new MyList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        System.out.println("Add element");
        for (int i =0; i< test.size();i++){
            System.out.println(test.get(i));
        }
        System.out.println("Remove element");
        int a = test.remove(5);
        System.out.println(a);
        System.out.println("New Arr: ");
        for (int i = 0; i < test.size() ; i++) {
            System.out.println(test.get(i));
        }
        System.out.println("Clone: ");
        MyList<Integer> testClone = (MyList<Integer>) test.clone();
        for (int i = 0; i < testClone.size(); i++) {
            System.out.println(testClone.get(i));
    }
}
}
