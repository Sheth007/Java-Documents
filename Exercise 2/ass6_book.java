class book{
    String title;
    int price,no_of_pages;
    book(){
        title="the truth";
        price=800;
        no_of_pages=600;
    }
    book(String t,int p,int n){
        title=t;
        price=p;
        no_of_pages=n;
    }
    void show(){
		System.out.println("title : "+title);
		System.out.println("price : "+price);
		System.out.println("no_of_pages : "+no_of_pages+"\n");
	}
}
class ass6_book {
	public static void main(String args[]){
		book b1 = new book();
		book b2 = new book("the dark",1500,500);
		b1.show();
		b2.show();
	}
}
