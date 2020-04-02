//@author syed saad
class test{

    public static  int[] swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;

    }

    //method to sort full array
    public static int[] mySort(int[] arr,int k){
        if(k==arr.length){
            return arr;
        }else{
            for(int i=k;i>0;i--){
                if(arr[i]>=arr[i-1]){
                    break;
                }
                if(arr[i]<arr[i-1])
                   arr= swap(arr,i,i-1);
                    
            }
            return mySort(arr, k+1);
        }

    }

    //method to sort array from 0th index to kth index
    public static int[] mySort(int[] arr,int k,int l){
        if(k==l){
            return arr;
        }else{
            for(int i=k+1;i>0;i--){
                if(arr[i]>=arr[i-1]){
                    break;
                }
                if(arr[i]<arr[i-1])
                   arr= swap(arr,i,i-1);
                    
            }
            return mySort(arr, k+1,l);
        }

    }
    public static void main(String[] args){
        //System.out.println("running");
        int[] arr ={4,3,8,6,1,2,-1,-3,9,7,0};
        System.out.println("before sorting");
        for(int i: arr){
            System.out.print(i+" ");
        }
        arr= mySort(arr, 0,5);      //sorting from 0th to 5th index
        System.out.println();
        System.out.println("After index sorting");
        for(int i: arr){
            System.out.print(i+" ");
        }
        
        System.out.println();
        arr=mySort(arr, 0);
        System.out.println("After sorting");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
