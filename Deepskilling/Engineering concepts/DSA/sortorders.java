class order{
    public int orderId;
    public String customerName;
    public double totalPrice;
    public order(int orderId, String customerName, double totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }
}
public class sortorders{
    public static void main(String[] args) {
        order[] orders1={
            new order(1,"henry",100000),
            new order(2,"richard",200),
            new order(3,"camille",30000),
            new order(4,"bunny",20000),
            new order(5,"charles",40000)
        };
        quicksort(orders1,0,orders1.length-1);
        order[] orders2={
            new order(1,"henry",100000),
            new order(2,"richard",200),
            new order(3,"camille",30000),
            new order(4,"bunny",20000),
            new order(5,"charles",40000)
        };
        bubblesort(orders2);
        System.out.println("quick sort:");
        for(order od: orders1){
            System.out.println(od.orderId + " " + od.totalPrice);
        }
        System.out.println("bubble sort:");
        for(order od: orders2){
            System.out.println(od.orderId + " " + od.totalPrice);
        }

    }

    public static void bubblesort(order[] orders){
        for(int i=0; i<orders.length;i++){
            for(int j=0;j<orders.length-1;j++){
                if(orders[j].totalPrice>orders[j+1].totalPrice){
                    order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }

    }


    public static void quicksort(order[] orders, int low, int high){
        if(low>=high){
            return;
        }
        int i=low+1;
        int j=high;
        order item;
        order pivot = orders[low];
        
        while(i<j){
            while(i<=j && orders[i].totalPrice<pivot.totalPrice){
                i++;
            }
            while(i<=j && orders[j].totalPrice>pivot.totalPrice){
                j--;
            }
            if(i<j){
                item=orders[i];
                orders[i]=orders[j];
                orders[j]=item;
                i++;
                j--;
            }
        }
        orders[low]=orders[j];
        orders[j]=pivot;

        
        quicksort(orders, low, j-1);
        quicksort(orders,j+1,high);
        }
}
    
