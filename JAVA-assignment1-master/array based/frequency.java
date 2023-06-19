public class frequency {
    //Function to print the frequency of 
    //each element of the sorted array
    public static void main(String[] args){
        //Given input
        int arr[]=new int[]{1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        int fr[]=new int[arr.length];
        int visited = -1;
        for(int i=0; i<arr.length; i++){
            int count= 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
            fr[i]=count;
        }
System.out.println("-------------------");
System.out.println(" Element | Frequency");
System.out.println("-------------------");
for(int i=0; i<fr.length; i++){
    if(fr[i]!=visited)
    System.out.println(" "+arr[i]+" | "+fr[i]);
}
System.out.println("-------------------");
    }
}
