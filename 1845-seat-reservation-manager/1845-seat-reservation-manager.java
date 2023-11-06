class SeatManager {

     private int [] arr;
     private int index = 0;
    
    public SeatManager(int n) {
        arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
    }

    public int reserve() {
       while (index < arr.length-1 && arr[index] == -1) index++;
        if (index < arr.length){
            int temp = arr[index];
            arr[index++] = -1;
            return temp;
        }
        return -1;
    }

    public void unreserve(int seatNumber) {
        index =  (seatNumber <= index)? seatNumber-1 : index--;
        arr[seatNumber-1] = seatNumber;
    }
}