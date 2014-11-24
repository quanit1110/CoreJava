/**
 * Created by mitalcs on 10/27/14.
 */
public class ArrayCopyExample {
    double[] arrayName = new double[]{8, 7, 8.5, 9.5, 7,4,10};
    double [] secondArray = new double [arrayName.length-1];

    public void printMinValue (){
        System.out.println ("Minimum element in an array is :" + arrayName[getMinIndex()]);
        System.out.println ("Position of minimum element is : " + getMinIndex());
    }

    public int getMinIndex(){
        int minIndex = 0;
        double min = arrayName[0];
        for(int i = 0 ; i < arrayName.length; i++){
            if( arrayName[i] < min ){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void deleteMin (){

        if(getMinIndex() == 0){
            System.arraycopy(arrayName, getMinIndex()+1, secondArray, 0, secondArray.length);

            for(int i=0; i <secondArray.length; i++){
               System.out.print(" "+secondArray[i]+" ");
            }
        }else if (getMinIndex() == arrayName.length-1){
            System.arraycopy(arrayName, 0, secondArray, 0, secondArray.length);

            for(int i=0; i <secondArray.length; i++){
                System.out.print(" "+secondArray[i]+" ");
            }
        }else{

            System.arraycopy(arrayName, 0, secondArray, 0, getMinIndex());
            System.arraycopy(arrayName, getMinIndex()+1, secondArray, getMinIndex(), secondArray.length - (getMinIndex()));

        }

        for(int i=0; i <secondArray.length; i++){
            System.out.print(" "+secondArray[i]+" ");
        }


    }

    public static void main (String[]args){
       ArrayCopyExample ace = new ArrayCopyExample();
        System.out.println ("Length of first array is " + ace.arrayName.length);
        System.out.println ("Length of second array is " + ace.secondArray.length);
        ace.deleteMin();
    }

}


