class BookSample{
	public static void main(String[] args){
		BookShelf bookShelf = new BookShelf(3);

		bookShelf.add("��y�͔L�ł���");
		bookShelf.add("��͓S���̖�");
		bookShelf.add("�����ĒN�����Ȃ��Ȃ���");
		
		BookShelfIterator itr = bookShelf.iterator();
		while(itr.hasNext()){
			Book book = (Book)itr.next();
			System.out.println(book.getName());
		}
	}
}
