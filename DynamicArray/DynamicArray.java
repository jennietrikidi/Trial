import java.util.Arrays;

public class DynamicArray {
    private int index;
    private int value;
    private int size;
    private int[]dynamicArr;
    private int getValueByIndex;
    public DynamicArray(){
        this.index=0;
        this.value=0;
        this.size=0;
    }
    public void setDynamicArr(int[]dynamicArr){
        this.dynamicArr=dynamicArr;
    }
    public int[]getDynamicArr(){
        return this.dynamicArr;
    }
    public void growArr(int size){
        dynamicArr=new int[size];
    }
    public void add(int value){
        this.size++;
        this.dynamicArr[this.size-1]=value;
    }
    public int get(int index){
        for (int i=0;i<this.dynamicArr.length;i++){
            if(i==index){
                getValueByIndex=this.dynamicArr[i];
                break;
            }
        }
        return getValueByIndex;
    }

    public int getGetValueByIndex() {
        return getValueByIndex;
    }

    public void setGetValueByIndex(int getValueByIndex) {
        this.getValueByIndex = getValueByIndex;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "index=" + index +
                ", value=" + value +
                ", size=" + size +
                ", dynamicArr="+Arrays.toString(dynamicArr)+"get value by index: "+getValueByIndex;
    }
}
