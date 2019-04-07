class BookSample{
	public static void main(String[] args){
		BookShelf bookShelf = new BookShelf(3);

		bookShelf.add("Œá”y‚Í”L‚Å‚ ‚é");
		bookShelf.add("‹â‰Í“S“¹‚Ì–é");
		bookShelf.add("‚»‚µ‚Ä’N‚à‚¢‚È‚­‚È‚Á‚½");
		
		BookShelfIterator itr = bookShelf.iterator();
		while(itr.hasNext()){
			Book book = (Book)itr.next();
			System.out.println(book.getName());
		}
	}
}
