public class NestedLoop {
    public static void main(String [] args){
        String pyramid = " ";
        for(int i = 1; i < 10; i++){
            for(int j = 0; j < i; j++){
                pyramid = pyramid + i;
            }
            System.out.println(pyramid);
            pyramid = " ";
        }
    }
}
