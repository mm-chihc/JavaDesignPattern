public class MyTeacher extends Teacher{
		private MyStudentList studentList;

		public void createStudentList(){
      studentList = new MyStudentList(5);
      studentList.add(new Student("�Ԉ䗺��",1));
      studentList.add(new Student("�ԉH����",2));
      studentList.add(new Student("���c����",2));
      studentList.add(new Student("���X�r��",1));
      studentList.add(new Student("���m�X���",2));
		}
		public void callStudents(){
      Iterator itr = studentList.iterator();
      while(itr.hasNext()){
					Student student = (Student)itr.next();
          System.out.println(student.getName());
      }
		}
}
