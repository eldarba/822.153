package c.collections;

public class Box<T> { // <T> is type parameter

	private T Content;

	public T getContent() {
		return Content;
	}

	public void setContent(T content) {
		Content = content;
	}

	public static void main(String[] args) {

		Box<Integer> boxOfInt = new Box<>(); // <Integer> is type argument
		boxOfInt.setContent(5);
		int x = boxOfInt.getContent();

		Box<String> boxOfString = new Box<>(); // <String> is type argument
		boxOfString.setContent("aaa");
		String str = boxOfString.getContent();

	}

}
