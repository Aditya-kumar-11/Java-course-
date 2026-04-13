class Max_Min{
    public static void main ( String [] args){
        int arr[]={5,10,15,20,25};
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < 5; i++) {
            if(arr[i]>max){
                max =arr[i];
            
            }
              if(arr[i]>min){
                min =arr[i];
              }
             
        }
               System.out.println("max number in array is : "+max);
               System.out.println("min number in array is : "+min);
    }
    
}
