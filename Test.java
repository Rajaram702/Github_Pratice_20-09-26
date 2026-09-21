class Test{
    public static void main(String[] args){
        System.out.println("Test class updated by me...");
    }
    public void m1(){
        int var1=100;
        int var2=200;
        System.out.println(var1+var2);
    }
    public void m2(Integer[] arr){
        Stream.of(arr).forEach(System.out::println);
    }
}
