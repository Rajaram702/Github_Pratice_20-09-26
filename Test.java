class Test{
    public static void main(String[] args){
        System.out.println("Test class updated by me...");
    }
    public void m2(Integer[] arr){
        Stream.of(arr).forEach(System.out::println);
    }
}
