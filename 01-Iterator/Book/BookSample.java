class BookSample{
	public static void main(String[] args){
		BookShelf bookShelf = new BookShelf(3);

		bookShelf.add("吾輩は猫である");
		bookShelf.add("銀河鉄道の夜");
		bookShelf.add("そして誰もいなくなった");
		
		BookShelfIterator itr = bookShelf.iterator();
		while(itr.hasNext()){
			Book book = (Book)itr.next();
			System.out.println(book.getName());
		}
	}
}
