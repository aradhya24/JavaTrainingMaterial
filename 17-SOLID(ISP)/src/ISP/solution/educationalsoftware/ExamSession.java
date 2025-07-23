package ISP.solution.educationalsoftware;

public class ExamSession implements IExamSession {

	@Override
	public void gradeExam() {
		System.out.println("Teacher graded exam marks...");
	}

	@Override
	public void createQuestionBank() {
		System.out.println("Teacher created Question...");

	}

	@Override
	public void startExam() {
		System.out.println("Student started exam...");

	}

}
