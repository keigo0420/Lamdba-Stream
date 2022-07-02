import java.time.LocalDate;

public class Task {
	// Comparable�C���^�t�F�[�X����������
	private LocalDate date;
	private String task;
	boolean done;
	boolean incomplete = false;
	boolean completion = true;// �ǉ� ������true, �������� false

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;

	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	// boolean�^��getter���\�b�h��is�`�Ƃ��邱�Ƃ�����܂�
	public boolean isDone() {
		return done;
	}

	// compareTo���\�b�h���I�[�o�[���C�h����
	// ���t�ŕ��ёւ��邽�߁ALocalDate��compareTo���g��

	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	public String toString() {
		return this.date + " " + this.task;
	}
}
