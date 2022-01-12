package Mini;

public class DriverExam {

	public static void executeExcercise(IExcercise excercise) throws Exception {
		try {
			excercise.start();
			excercise.execute();
		} catch (Exception e) {
			excercise.markNegativePoints();
		} finally {
			excercise.end();
		}

	}

	public static void main(String[] args) throws Exception {

		DriverExam.executeExcercise(new Excercise());

	}

}

class Excercise implements IExcercise {

	public void start() {
		System.out.println("Start");
	}
	public void execute() {
		System.out.println("Execute");
	}

	public void markNegativePoints() {
		System.out.println("MarkNegativePoints");
	}

	public void end() {
		System.out.println("End");
	}
}

interface IExcercise {
	void start() throws Exception;

	void execute();

	void markNegativePoints();

	void end();

}
