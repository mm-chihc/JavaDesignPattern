public class BookShelf implements Aggregate {
	private Book[] books;
	private int length = 0;

	public BookShelf(int bookCount){
		books = new Book[bookCount];
	}

	public void add(String name){
		books[length] = new Book(name);
		length++;
	}
	public Book getBookAt(int index){
		return books[index];
	}
	public int getLength(){
		return length;
	}
	public BookShelfIterator iterator(){
		return new BookShelfIterator(this);
	}
}
