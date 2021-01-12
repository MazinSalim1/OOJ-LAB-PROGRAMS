class Book<a, b, c>{
   a name;
   b author;
   c number;
   Book(a a1,b b1,c c1 )
   {
      this.name = a1;
      this.author=b1;
      this.number=c1;
   }
   public void display()
   {
      System.out.println("the Name of the Book is: "+this.name+" ,the Author is:"+this.author+" & number of pages:"+this.number);

   }
}

class Labtest1
{
	 public static void main(String args[])
	 {
	 	Book<String, String, Integer>ob1= new Book<String, String, Integer>("The Alchemist","Paulo cohelo",200);
	 	ob1.display();
	 	Book<String, String, Integer>ob2= new Book<String, String, Integer>("After","Christian Reed",300);
	 	ob2.display();
	 	Book<String, String, Integer>ob3= new Book<String, String, Integer>("Random name","John shelby",900);
	 	ob3.display();

	 }
}
