public class CustomArrayList {
    private int[] myArray;
    private int index;
    private int[] myArrayCopy;
    public CustomArrayList(){
        this.myArray = new int[0];
        this.index = 0;
    }
    private void increaseIndex(){
        this.copy(this.myArray);
        this.myArray = new int[this.myArrayCopy.length + 1];
        int tmpArrayLength = myArrayCopy.length;
        for(int i=0; i<tmpArrayLength; i++){
            this.myArray[i] = this.myArrayCopy[i];
            if(i == (tmpArrayLength-1)){
                this.index = i + 1;
            }
        }

    }
    public void add(int value){
        this.increaseIndex();
        this.myArray[index] = value;
    }
    public void show(){
        int length = this.myArray.length;
        if(length>0) {
            for (int i = 0; i < length; i++) {
                System.out.println("Index = " + i + ", value= " + this.myArray[i]);
            }
        }else{
            System.out.println("NotFoundException");
        }
    }
    public void push(int value){
        this.add(value);
    }
    public void pop(){
        int length = this.myArray.length;
        if(length>0){
            this.myArrayCopy = this.myArray.clone();
            this.myArray = new int[length-1];
            for(int i=0; i<this.myArray.length; i++){
                this.myArray[i] = this.myArrayCopy[i];
            }

        }else {
            System.out.println("Total array items = 0");
        }
    }
    public void shift(){
        int length = this.myArray.length;
        this.copy(this.myArray);
        if(length>0){
            this.myArray = new int[length-1];
            for(int i=0; i<this.myArray.length; i++){
                this.myArray[i] = this.myArrayCopy[i + 1];
            }
        }else {
            System.out.println("ArrayIndexNotFoundException");
        }
    }
    public void unshift(int value){
        int length = this.myArray.length;
        this.copy(this.myArray);
        if(length>0){
            this.myArray = new int[length+1];
            this.myArray[0] = value;
            for(int i=0; i<this.myArrayCopy.length; i++){
                this.myArray[i + 1] = this.myArrayCopy[i];
            }
        }else {
            System.out.println("ArrayIndexLimitException");
        }
    }
    private void copy(int[] myArray){
        int length = myArray.length;
        this.myArrayCopy = new int[length];
        for (int i = 0; i < length; i++){
            this.myArrayCopy[i] = myArray[i];
        }
    }
    public static void main(String[] args){
        CustomArrayList myNewArray = new CustomArrayList();
        myNewArray.add(10);
        myNewArray.unshift(9);
        myNewArray.unshift(8);
        myNewArray.push(11);
        myNewArray.push(12);
        myNewArray.push(13);
        myNewArray.push(14);
        myNewArray.pop();
        myNewArray.shift();
        myNewArray.shift();
        myNewArray.shift();
        myNewArray.shift();
        myNewArray.show();


    }
}
