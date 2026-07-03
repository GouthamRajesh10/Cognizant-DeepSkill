public class ecommerce{
    public static void main(String[] args){
        product[] products = {new product(1,"toys","kids"),
        new product(2,"pens","stationary"),
        new product(3,"paper","stationary"),
        new product(4,"balls","kids"),
        new product(5,"brush","cosm")};
        linearSearch ls = new linearSearch();
        binarySearch bs = new binarySearch();
        System.out.println(ls.search(products, 4));
        System.out.println(bs.search(products, 4));
    }

}
class product{
    public int pdId;
    public String pdName;
    public String category;
    public product(int pdId, String pdName, String category){
        this.pdId=pdId;
        this.pdName=pdName;
        this.category=category;
    }
}
class linearSearch{
    public int search(product[] products, int pdId){
        for(int i=0; i<products.length;i++){
            if(pdId==products[i].pdId){
                return i;
            }
        }
        return -1;
    }

}

class binarySearch{
    public int search(product[] products, int pdId){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(pdId==products[mid].pdId){
                return mid;
            }
            else if(pdId<products[mid].pdId){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;


    }

}