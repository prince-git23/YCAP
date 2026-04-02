class ArrayAddition{
    public static void main(String[] args)
    {
        int size;
        Scanner s1=new Scanner(System.in);
        s1.size=nextInt(); 
        int a = new int[size];
        for(int i=0;i<size;i++){
            s1.a[i]=nextInt();
        }
        int addition=0;
        for(int i=0;i<size;i++){
            addition=addition+a[i];
        }
        System.out.print(addition);
    }
}